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

package cn.vbill.middleware.porter.plugin.consumer;

import cn.vbill.middleware.porter.common.consumer.ConsumeClient;
import cn.vbill.middleware.porter.common.exception.TaskStopTriggerException;
import cn.vbill.middleware.porter.core.consumer.AbstractDataConsumer;
import cn.vbill.middleware.porter.core.event.s.MessageEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年04月25日 11:55
 * @version: V1.0
 * @review: zkevin/2018年04月25日 11:55
 */
public class CustomConsumer extends AbstractDataConsumer {
    @Override
    protected String getPluginName() {
        return "ConsumerName";
    }

    @Override
    protected List<MessageEvent> doFetch() throws TaskStopTriggerException, InterruptedException {
        return consumeClient.fetch(new ConsumeClient.FetchCallback<MessageEvent, Object>() {
            @Override
            public <F, O> List<F> acceptAll(O o) {
                List<MessageEvent> events = new ArrayList<>();
                getConverter().convert(null);
                return (List<F>) events;
            }
        });
    }
}
