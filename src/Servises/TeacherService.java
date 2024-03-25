package Servises;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;
import Domain.Teacher;

public class TeacherService implements IPersonServices<Teacher>{

    private int count;

    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
       return teachers;
    }

    
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, name);
        teachers.add(teacher);
       

    }
    
    public void sortByFio(){
        PersonComparator<Teacher> comparator = new PersonComparator<Teacher>();
        count++;
        teachers.sort(comparator);
    }

    public void printPerson(List<Teacher> all) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printPerson'");
    }
}
