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

package cn.vbill.middleware.porter.plugin.consumer.client;

import cn.vbill.middleware.porter.common.client.AbstractClient;
import cn.vbill.middleware.porter.common.client.PluginServiceClient;
import cn.vbill.middleware.porter.common.consumer.ConsumeClient;
import cn.vbill.middleware.porter.common.consumer.Position;
import cn.vbill.middleware.porter.common.exception.TaskStopTriggerException;
import cn.vbill.middleware.porter.plugin.consumer.config.CustomConsumeConfig;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年04月25日 13:17
 * @version: V1.0
 * @review: zkevin/2018年04月25日 13:17
 */
public class CustomConsumeClient  extends AbstractClient<CustomConsumeConfig> implements ConsumeClient, PluginServiceClient {

    public CustomConsumeClient(CustomConsumeConfig config) {
        super(config);
    }

    @Override
    public String getClientName() {
        return "CustomConsumeClient";
    }

    @Override
    protected void doStart() throws Exception {

    }

    @Override
    protected void doShutdown() throws Exception {

    }

    @Override
    public boolean isAutoCommitPosition() {
        return false;
    }

    @Override
    public long commitPosition(Position position) throws TaskStopTriggerException {
        return 0;
    }

    @Override
    public void initializePosition(String s, String s1, String s2) throws TaskStopTriggerException {

    }

    @Override
    public String getSwimlaneId() {
        return null;
    }

    @Override
    public <F, O> List<F> fetch(FetchCallback<F, O> fetchCallback) throws TaskStopTriggerException, InterruptedException {
        return null;
    }

    @Override
    public String getInitiatePosition(String s) {
        return null;
    }
}
