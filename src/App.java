import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);
        Student student6 = new Student("Max", 22);
        // создаем объект - Список Студентов - помещаем всех Student в список через
        // метод add()
        List<Student> students = new ArrayList<>();
        students.add(student6);
        students.add(student5);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student1);

        Student student_1 = new Student("Vera", 18);
        Student student_2 = new Student("Vania", 19);
        Student student_3 = new Student("Taisia", 25);
        Student student_4 = new Student("Victoria", 21);
        Student student_5 = new Student("Nadejda", 22);
        Student student_6 = new Student("Pavel", 22);

        List<Student> students2 = new ArrayList<>();
        students2.add(student_1);
        students2.add(student_2);
        students2.add(student_3);
        students2.add(student_4);
        students2.add(student_5);
        students2.add(student_6);

        // Создаём объек StudentGroup - группа сстудентов под названием group5830,
        // помещаем Strint СПИСОК СТУДЕНТОВ
        // ране перечисленных (students) и int номер группы 5830.
        // StudentGroup group5830 = new StudentGroup(students, 5830);

        // Чтобы вывести список студентов в строчку необходимо этоn список
        // итерировать(перечислить) студентов в группе,
        // для этого переходим в класс StudentGroup и имплементируем встроенный в VS
        // Code интерфейс по названию Iterable.
        // Данный интерфейс принимает тип данных(класс который необходимо итеррировать)
        // в таких скобочках < ... >
        // for (Student stud : group5830) {
        // System.out.println(stud);
        // }

        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // // для сортировки группы студентов необходимо обратиться к встроенному
        // // интерфейсу Collections
        // // методу sort( и передаём в метод группу group5830 + метод getGroup() ->
        // список
        // // студентов в группе)

        // Collections.sort(group5830.getGroup());
        // // Копируем фор и вставляем в интерфейс Collections
        // for (Student stud : group5830) {
        // System.out.println(stud);
        // }
        // далее необходимо написать функционал по сравнению студентов между собой, для
        // этого классу Student необходимо
        // имплементировать интерфейс Comparable

        StudentGroup potok2024 = new StudentGroup(students, 2320);
        StudentGroup potok2023 = new StudentGroup(students2, 4522);
      

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(potok2024);
        groups.add(potok2023);
        

        for (StudentGroup studgroup : groups) {
            System.out.println(studgroup);
        }

    }

}
