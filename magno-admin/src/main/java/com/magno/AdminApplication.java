package com.magno;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



//@EnableTransactionManagement(order = 2)	//设置事务执行顺序(需要在切换数据源之后，否则只走主库)
//@ComponentScan("com.crets.*")
//@MapperScan("com.crets.**.model.*")
//@EnableFeignClients(basePackages="com.crets")
//@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
