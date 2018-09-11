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

import cn.vbill.middleware.porter.common.consumer.Position;
import cn.vbill.middleware.porter.core.event.s.EventConverter;
import cn.vbill.middleware.porter.core.event.s.MessageEvent;

/**
 * 自定义源端数据格式解析
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年03月19日 23:22
 * @version: V1.0
 * @review: zhangkewei[zhang_kw@suixingpay.com]/2018年03月19日 23:22
 */
public class OggXmlConverter implements EventConverter {
    @Override
    public String getName() {
        return "oggXml";
    }

    /**
     * 参考OggJsonConverter
     * @see cn.vbill.middleware.porter.core.event.s.converter.OggJsonConverter
     * @param params
     * @return
     */
    @Override
    public MessageEvent convert(Object... params) {
        Position position = (Position) params[0];
        String msg = (String) params[1];
        //解析xml
        return null;
    }
}
