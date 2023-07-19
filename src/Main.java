import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student=new Student("Baikal","Asanov",15,"Male");
        Student student1=new Student("Samagan","Tolonbaev",15,"male");
        Student student2=new Student("Kumarbek","Tolonbaev",15,"Male");
        Student student3=new Student("Aizirek","Toktorsunova",18,"Female");
        Student[] students1={student,student1,student2,student3};
        School school=new School("Peaksoft",students1);
        school.getAllStudents(students1);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        school.getByName(scanner.nextLine(),students1);
        System.out.println("Парни: ");
        school.getAllBoys(students1);

    }
}