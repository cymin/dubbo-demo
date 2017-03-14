package site.oaksharks.service;

/**
 * Created by service on 17-2-28.
 */
public class ProductServiceServiceImpl implements ProductService {

    private Long i = 0L;

    public String sayHello(String words){
        System.out.println((++i) + ") "+ words);
        return (i) + ") from chen'server: " + words;
    }

}
