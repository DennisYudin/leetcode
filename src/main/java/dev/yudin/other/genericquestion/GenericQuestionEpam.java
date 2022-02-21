package dev.yudin.other.genericquestion;

import java.util.ArrayList;
import java.util.List;

public class GenericQuestionEpam {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Dennis");
        student.setSurName("Yudin");

        Integer number = 139;
        String string = "Hey";

        List<Object> listObjects = new ArrayList<>();

        listObjects.add(student);
        listObjects.add(number);
        listObjects.add(string);

        for (Object object : listObjects) {
            Student student1 = (Student) object;
            System.out.println(student1);

            String str = (String) object;
            System.out.println(str);
        }
    }
}
