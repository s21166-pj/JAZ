package pl.pjatk.pawbad;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

//    public MyThirdComponent(ApplicationContext applicationContext) {
//        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
//        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
//
//        System.out.println("Hello from MyThirdComponent");
//
//
//        MySimpleClass myFristSimpleClass = applicationContext.getBean("mySimpleClass", MySimpleClass.class);
//        MySimpleClass mySecondSimpleClass = applicationContext.getBean("mySecondSimpleClass", MySimpleClass.class);
//
//        System.out.println(myFristSimpleClass.getName());
//        System.out.println(mySecondSimpleClass.getName());
//    }

    public MyThirdComponent(
            MyFirstComponent myFirstComponent,
            MySecondComponent mySecondComponent,
            MySimpleClass mySimpleClass,
            MySimpleClass mySecondSimpleClass
    ){
        mySecondComponent.helloFromMethod();
        System.out.println("Hello from MyThirdComponent");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
