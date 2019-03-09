springboot 整合ElasticSearch的例子，出现了一个问题导致项目启动不成功。
问题：
Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean
答案：
    因为其他项目使用的 springboot依赖是2.0.1版本，所以本地的maven仓库里面的springboot依赖的版本也是2.0.1.
    <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.1.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	但起初最先本项目的springboot的版本是2.0.0，导致项目使用的依赖低于本机maven仓库，所以出现此问题
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	 解决办法： 将版本改为比本机maven的springboot的2.0.1的版本一样或者高
	 <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.1.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>