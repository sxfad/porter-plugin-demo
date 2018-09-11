/*
 * Copyright ©2018 vbill.cn.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package cn.vbill.middleware.porter.plugin.loader;

import cn.vbill.middleware.porter.common.exception.TaskDataException;
import cn.vbill.middleware.porter.common.exception.TaskStopTriggerException;
import cn.vbill.middleware.porter.core.event.etl.ETLBucket;
import cn.vbill.middleware.porter.core.event.etl.ETLRow;
import cn.vbill.middleware.porter.core.loader.AbstractDataLoader;
import cn.vbill.middleware.porter.core.loader.SubmitStatObject;
import cn.vbill.middleware.porter.plugin.loader.client.CustomLoadClient;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年04月25日 11:33
 * @version: V1.0
 * @review: zkevin/2018年04月25日 11:33
 */
public class CustomLoader extends AbstractDataLoader {

    /**
     * 用户通过配置文件匹配Loader插件
     * @return
     */
    @Override
    protected String getPluginName() {
        return "CustomLoaderName";
    }

    /**
     * 载入目标端数据库的逻辑代码
     * @param etlBucket
     * @return
     * @throws TaskStopTriggerException
     */
    @Override
    public Pair<Boolean, List<SubmitStatObject>> load(ETLBucket etlBucket) throws TaskStopTriggerException {
        CustomLoadClient customLoadClient = getLoadClient();
        customLoadClient.insert();
        return new ImmutablePair<>(true, Arrays.asList(new SubmitStatObject("schema", "table", null,
                0, null, new Date())));
    }

    /**
     * TransformJob阶段执行的代码,用于load方法(LoadJob阶段)使用
     * TransformJob阶段已完成了数据结构映射、自定义数据处理。
     * @param etlRow
     * @throws TaskDataException
     */
    @Override
    public void mouldRow(ETLRow etlRow) throws TaskDataException {

    }
}
