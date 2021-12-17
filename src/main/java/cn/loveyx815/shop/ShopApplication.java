package cn.loveyx815.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "cn.loveyx815.shop.dao")
@ComponentScan(
//        value = "cn.loveyx815.shop"
        basePackages = "cn.loveyx815.shop.*"
)
//@EnableAutoConfiguration
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
