package pl.pjatk.pawbad;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public MySimplePojo pojoClass() {
        return new MySimplePojo("Some string value");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("one","two","three","four","five");
    }

    @Bean
    public List<String> defaultAnotherData(){
        return List.of("five","four","three","two","one");
    }

    @Bean
    public List<MySimplePojo> mySimplePojoList(MySimplePojo mySimplePojo) {
        return List.of(mySimplePojo);
    }

    @Bean
    public int someInt() {
        return 1;
    }

    @Bean
    @ConditionalOnProperty(name = "my.custom.access_value", havingValue = "true")
    public void helloFromHomeWorkMethod() {
        System.out.println("Hi Arek! I'm Homeworkkkkkkkkkkkk");
    }
}
