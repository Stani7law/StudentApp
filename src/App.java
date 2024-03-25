import java.util.ArrayList;

import java.util.List;

import Controlers.AccountController;
import Domain.Employee;
import Domain.Student;

import Domain.Teacher;
import Servises.EmployeeService;
import Servises.StudentService;
import Servises.TeacherService;
;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);
        
        // создаем объект - Список Студентов - помещаем всех Student в список через
        // метод add()
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
       

        // Создаём объек StudentGroup - группа сстудентов под названием group5830,
        // помещаем Strint СПИСОК СТУДЕНТОВ
        // ране перечисленных (students) и int номер группы 5830.
        //StudentGroup group5830 = new StudentGroup(listStudents, 5830);

        // Чтобы вывести список студентов в строчку необходимо этоn список
        // итерировать(перечислить) студентов в группе,
        // для этого переходим в класс StudentGroup и имплементируем встроенный в VS
        // Code интерфейс по названию Iterable.
        // Данный интерфейс принимает тип данных(класс который необходимо итеррировать)
        // в таких скобочках < ... >
        // for (Student stud : group5830) {
        //System.out.println(group5830);
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

        // StudentGroup potok2024 = new StudentGroup(students, 2320);
        // StudentGroup potok2023 = new StudentGroup(students2, 4522);

        // List<StudentGroup> groups = new ArrayList<>();
        // groups.add(potok2024);
        // groups.add(potok2023);

        // for (StudentGroup studgroup : groups) {
        // System.out.println(studgroup);
        // }

        StudentService service = new StudentService();       
        for (Student s : listStudents) {
            service.create(s.getName(), s.getAge());
        }


        // AccountController controller = new AccountController();
        AccountController.printPerson(service.getAll());
        // controller.printPerson(service.getAll());
        // service.printPerson(service.getAll());
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // service.sortByFio();
        // AccountController.printPerson(service.getAll());
        

        Teacher t1 = new Teacher("Piotr", 45, "доцент");
        Employee e1 = new Employee("Vasiliy", 28, "Слесарь");
        Employee e2 = new Employee("Tolia", 25, "Prepod");
        // //Для безопасности кода необходимо защитить метод paySalary (перейти в AccountController)

        AccountController.paySalary(t1, 100000000);
        AccountController.paySalary(e1, 40000000);
        AccountController.paySalary(e2, 2500000);

        Teacher teacher1 = new Teacher("Galina", 50, "Fizica");
        Teacher teacher2 = new Teacher("Sabina", 55, "Literatura");
        Teacher teacher3 = new Teacher("Valentina", 40, "Trud");
        Teacher teacher4 = new Teacher("Genadiy", 25, "Hymea");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        TeacherService service2 = new TeacherService();
        for (Teacher t : teachers) {
            service2.create(t.getName(), t.getAge());
        }

        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // AccountController controller = new AccountController();
        AccountController.printPerson(service2.getAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        service2.sortByFio();
        AccountController.printPerson(service2.getAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AccountController.averageAge(service2.getAll());
        AccountController.averageAge(service.getAll());
       
       
       
        AccountController.paySalary(teacher1, 100000);

        

    }

}
