# Ӧ������
## ���÷�ʽ
* properties�ļ�����
* yml�ļ�����
* ������������
* �����в�������

properties���ÿ���ͨ��`@Value`annotation����ע�룬

### ���ֵ����
```java  
my.secret=${random.value}  
my.number=${random.int}  
my.bignumber=${random.long}  
my.uuid=${random.uuid}  
my.number.less.than.ten=${random.int(10)}  
my.number.in.range=${random.int[1024,65536]}  

```

### �����в���

Spring Ĭ�Ͻ���`--`��ͷ��ѡ�����ת����property����ӵ�Spring��`Environment`�У�����㲻�뽫����ӵ�`Environment`�п���ͨ�����´������ã�  
```
SpringApplication.setAddCommandLineProperties(false)
```

