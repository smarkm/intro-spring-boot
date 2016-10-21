# Spring Boot DevTools
在maven添加如下依赖，

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency> 
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

## 常用属性配置

	spring.devtools.remote.restart.enabled			#是否允许自启动  
	spring.devtools.restart.exclude				#触发启动不包括的文件	
	spring.devtools.restart.additional-exclude 		#触发启动不包括的外部文件
	spring.devtools.restart.additional-paths   		#包含外部文件修改触发
	spring.devtools.restart.trigger-file  			#设置触发文件