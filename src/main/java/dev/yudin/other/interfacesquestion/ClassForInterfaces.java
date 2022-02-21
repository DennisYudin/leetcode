package dev.yudin.other.interfacesquestion;

public class ClassForInterfaces implements FirstInterface, SecondInterface {

    @Override
    public String sayHello() {
        return "Sup";
    }
}
