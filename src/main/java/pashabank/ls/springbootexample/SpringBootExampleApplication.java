package pashabank.ls.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(SpringBootExampleApplication.class, args);

        CustomerDAO customerInfo=(CustomerDAO)context.getBean("customerInfo");
        System.out.println(customerInfo);
        CustomerService service=(CustomerService)context.getBean("service");
        System.out.println(service.getCustomerInfo().getName());
    }

}
