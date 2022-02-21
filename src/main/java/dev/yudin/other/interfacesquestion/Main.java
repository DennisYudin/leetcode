package dev.yudin.other.interfacesquestion;

public class Main {

    public static void main(String[] args) {

        ClassForInterfaces ClassForInterfaces = new ClassForInterfaces();
        FirstInterface FirstInterface = new ClassForInterfaces();
        SecondInterface SecondInterface = new ClassForInterfaces();

        System.out.println("ClassForInterfaces: " + ClassForInterfaces.sayHello());
        System.out.println("FirstInterface: " + FirstInterface.sayHello());
        System.out.println("SecondInterface: " + SecondInterface.sayHello());
    }
}
