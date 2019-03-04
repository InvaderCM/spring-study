package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldAPP {
    public static void main(String[] args) {
//        读入XML配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        运行helloWorld的方法
        System.out.println(helloWorld.getHello());
    }
}
