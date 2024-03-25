package Servises;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

public class StudentService implements IPersonServices<Student>{
     private int count;
     /**Список Студентов под названием -students- */
    private List<Student> students;

    /**
     * Метод создает новый список студентов
     */
    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        students.add(student);
        
    }
    public void sortByFio(){
        PersonComparator<Student>  comparator = new PersonComparator<Student>();
        count++;
        students.sort(comparator);
    }

    //@Override
    // public void printPerson(List<Student> group) {
    //     for (Student s : group){
    //         System.out.println(s);

    //     }
        
    // }
    

}
