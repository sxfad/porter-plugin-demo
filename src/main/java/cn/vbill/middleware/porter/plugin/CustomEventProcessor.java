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

package cn.vbill.middleware.porter.plugin;

import cn.vbill.middleware.porter.core.event.etl.ETLBucket;
import cn.vbill.middleware.porter.core.event.s.EventProcessor;

/**
 * 自定义数据转换处理逻辑
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年03月19日 23:22
 * @version: V1.0
 * @review: zhangkewei[zhang_kw@suixingpay.com]/2018年03月19日 23:22
 */
public class CustomEventProcessor implements EventProcessor {


    /**
     * 每个任务自定义extractor,数据源、参数等可硬编码
     * 可变更内容
     * ETLBucket: rows列表元素可删除、新增
     * ETLRow: finalOpType finalSchema finalTable
     * ETLColumn: finalName finalValue finalOldValue  isKey required
     * isKey、required 会查询目标端数据结构重置
     */
    @Override
    public void process(ETLBucket etlBucket) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void start() {

    }
}
