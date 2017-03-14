package site.oaksharks;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();
        System.out.println("server start successfully");
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag){
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("bye") || s.equalsIgnoreCase("quit")||s.equalsIgnoreCase("exit")) {
                System.out.println("bye bye");
                context.stop();
                flag = false;
            }else {
                s = scanner.nextLine();
            }
        }
    }

}
