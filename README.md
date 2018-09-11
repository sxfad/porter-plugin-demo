# 数据同步中间件插件开发

## EventConverter

通过spring.factories发布
```
cn.vbill.middleware.porter.core.event.s.EventConverter = \
  cn.vbill.middleware.porter.plugin.OggXmlConverter
```

通过配置文件生效
```
porter.task[index].consumer.converter=oggXml
```

## EventProcessor
可以以jar、class、源码的形式通过配置文件生效
```
porter.task[index].consumer.eventProcessor.className=cn.vbill.middleware.porter.plugin.CustomEventProcessor
porter.task[index].consumer.eventProcessor.content=文件路径
```


## DataLoader
```
    参见样例代码,通过spring.factories发布
```
## DataConsumer
```
    参见样例代码,通过spring.factories发布
```


## 插件注册
放置到porter-boot-${version}/plugins目录下，重启node-boot后生效。
