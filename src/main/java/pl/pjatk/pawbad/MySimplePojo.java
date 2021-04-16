package pl.pjatk.pawbad;

public class MySimplePojo {
    private String someStringValue;

    public MySimplePojo(String someStringValue) {
        this.someStringValue = someStringValue;
    }

    public void printOutMe() {
        System.out.println("Value from MySimplePojo is:" + someStringValue);
    }
}
