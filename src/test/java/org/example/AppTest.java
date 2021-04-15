package org.example;

import static org.junit.Assert.assertTrue;

import org.example.pojo.Student;
import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test01(){
        //指定spring配置文件的位置和名称
        String resource="applicationContext.xml";
        //创建spring容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        //从spring容器中用id获取对象
        SomeService service=(SomeService) ac.getBean("someService");
        //执行
        service.doSome();
    }

    @Test
    public void test02(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Date date = (Date)ac.getBean("myDate");
        System.out.println("date="+date.toString());
    }

    @Test
    public void test03(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("myStudent");
        System.out.println("name="+stu.getName()+"; age="+stu.getAge());
    }

    /**
     * set注入，前两个属性为简单注入，school为引用注入
     */
    @Test
    public void test04(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("myStudent");
        System.out.println(stu.toString());
    }

    /**
     * 构造注入参数，先定义有参构造函数
     */
    @Test
    public void test05(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("myStudentConstructor");
        System.out.println(stu.toString());
    }

    @Test
    public void test06(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        File file=(File) ac.getBean("myFile");
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件名称："+file.getName());
    }

    /**
     * byName自动注入 autowire
     */
    @Test
    public void test07(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("studentByName");
        System.out.println(stu.toString());
    }

    /**
     * byType自动注入 autowire
     */
    @Test
    public void test08(){
        String resource="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("studentByType");
        System.out.println(stu.toString());
    }

    /**
     * 多个spring配置文件 使用byName注入参数
     */
    @Test
    public void test09(){
        String resource="total.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        Student stu=(Student) ac.getBean("studentMultiple");
        System.out.println(stu.toString());
    }
}
