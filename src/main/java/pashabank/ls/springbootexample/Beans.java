package pashabank.ls.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class Beans {

        @Bean
        public CustomerDAO customerInfo(){
            return new CustomerDAO("Durna");
        }

        @Bean
        public CustomerService service(CustomerDAO customerInfo){
            return new CustomerService(customerInfo);
        }
    }

