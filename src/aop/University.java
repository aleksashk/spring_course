package aop;

import org.springframework.stereotype.Component;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Aleksandr Philimonov", 4, 7.3);
        Student st2 = new Student("Dmitry Medvedev", 3, 9.58);
        Student st3 = new Student("Viacheslav Mishustin", 2, 8.74);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
