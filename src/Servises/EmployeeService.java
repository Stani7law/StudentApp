package Servises;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;



public class EmployeeService implements IPersonServices<Employee>{
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
       employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "basic");
      
        employees.add(employee);
        
    }
    //@Override
    // public void printPerson(List<Employee> group) {
    //     for (Employee s : group){
    //         System.out.println(s);

    public void sortByFio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByFio'");
    }

    

    //     }
        
    // }

}
