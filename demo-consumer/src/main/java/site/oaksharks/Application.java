package site.oaksharks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.oaksharks.service.ProductService;

public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:applicationContext.xml");//加载配置文件
        context.start();//调用context.start()
        logger.info("dubbo service begin to start");
        System.out.println("dubbo service begin to start");

        ProductService product = (ProductService) context.getBean("productService");
        for (int i=0;i<20;i++) { //模拟调用一万次
            System.out.println(product.sayHello(String.valueOf(i)));//执行远程方法
            Thread.currentThread().sleep(1000);
        }

    }


}
