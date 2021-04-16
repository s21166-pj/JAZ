package pl.pjatk.pawbad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {

    public MyFirstComponent(
            MySecondComponent mySecondComponent,
            MySimplePojo mySimplePojo,
            List<String> defaultData,
            List<String> defaultAnotherData,
            List<MySimplePojo> mySimplePojoList,
            int someInt
    ) {
        System.out.println("Hello from MyFirstComponent");
        mySecondComponent.helloFromMethod();
        mySimplePojo.printOutMe();
        System.out.println(defaultData);
        System.out.println(defaultAnotherData);
        System.out.println(mySimplePojoList);
        System.out.println(someInt);

    }

}
