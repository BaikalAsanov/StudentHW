import java.util.Arrays;
import java.util.Scanner;

public class School {
    private String name;
    private Student[] students;
    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
    public void getAllStudents(Student[] students) {
        System.out.println(Arrays.toString((students)));
    }
    public void getByName(String name,Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(name)){
                System.out.println(students[i]);
                break;
            }else {
                System.out.println("Такого студента нет в группе.");
                break;
            }

        }
    }
    public void getAllBoys(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equalsIgnoreCase("male")) {
                System.out.println(students[i]);
            }
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
