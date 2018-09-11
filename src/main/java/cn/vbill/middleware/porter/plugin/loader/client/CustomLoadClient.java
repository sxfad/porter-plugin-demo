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

package cn.vbill.middleware.porter.plugin.loader.client;

import cn.vbill.middleware.porter.common.client.AbstractClient;
import cn.vbill.middleware.porter.common.client.LoadClient;
import cn.vbill.middleware.porter.common.client.MetaQueryClient;
import cn.vbill.middleware.porter.common.client.PluginServiceClient;
import cn.vbill.middleware.porter.common.db.meta.TableSchema;
import cn.vbill.middleware.porter.plugin.loader.config.CustomLoadConfig;

import java.util.Date;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年04月25日 11:40
 * @version: V1.0
 * @review: zkevin/2018年04月25日 11:40
 */
public class CustomLoadClient extends AbstractClient<CustomLoadConfig> implements LoadClient, MetaQueryClient, PluginServiceClient {
    /**
     * 用于Spring SPI初始化
     */
    public CustomLoadClient() {
        super(null);
    }

    public CustomLoadClient(CustomLoadConfig config) {
        super(config);
    }

    @Override
    protected void doStart() throws Exception {

    }

    @Override
    protected void doShutdown() throws Exception {

    }

    @Override
    public TableSchema getTable(String s, String s1) throws Exception {
        return null;
    }

    @Override
    public int getDataCount(String s, String s1, String s2, Date date, Date date1) {
        return 0;
    }

    @Override
    public String getClientName() {
        return "CustomLoadClient";
    }

    public void insert() {

    }
}
