# Spring Boot DevTools
��maven�������������

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

## ������������

	spring.devtools.remote.restart.enabled			#�Ƿ�����������  
	spring.devtools.restart.exclude				#�����������������ļ�	
	spring.devtools.restart.additional-exclude 		#�����������������ⲿ�ļ�
	spring.devtools.restart.additional-paths   		#�����ⲿ�ļ��޸Ĵ���
	spring.devtools.restart.trigger-file  			#���ô����ļ�