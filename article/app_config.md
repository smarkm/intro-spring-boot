# 应用配置
## 配置方式
* properties文件配置
* yml文件配置
* 环境变量配置
* 命令行参数配置

properties配置可以通过`@Value`annotation进行注入，

### 随机值配置
```java  
my.secret=${random.value}  
my.number=${random.int}  
my.bignumber=${random.long}  
my.uuid=${random.uuid}  
my.number.less.than.ten=${random.int(10)}  
my.number.in.range=${random.int[1024,65536]}  

```

### 命令行参数

Spring 默认将以`--`开头的选项参数转换成property并添加到Spring的`Environment`中，如果你不想将其添加到`Environment`中可以通过如下代码设置：  
```
SpringApplication.setAddCommandLineProperties(false)
```

