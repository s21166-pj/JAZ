package pl.pjatk.pawbad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    public MySecondComponent(
            @Value("${my.custom.property}") String valueFromProperties,
            @Value("${my.custom.random: some default value from @value}") String randomValueFromProperties
    ) {
        System.out.println("Hello from MySecondComponent");
        System.out.println("------------------------------");
        System.out.println(valueFromProperties);
        System.out.println(randomValueFromProperties);
        System.out.println("------------------------------");

    }

    public void helloFromMethod() {
        System.out.println("Hello from MyFirstComponent from method printHelloMessage");

    }



}
