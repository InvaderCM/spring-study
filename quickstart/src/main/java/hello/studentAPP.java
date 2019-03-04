package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentAPP {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
            student student = (student) context.getBean("student");
            System.out.println(student.getName()+student.getAge()+student.getPhone());
        }
}
