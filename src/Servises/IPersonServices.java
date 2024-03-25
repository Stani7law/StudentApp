package Servises;

import java.util.List;

import Domain.Person;

/** Generic interface IPersonServices*/
public interface IPersonServices <T extends Person> {

    List<T> getAll();

    public void create(String name, int age);

    /** метод печати */
     //public void printPerson(List<T> group);
    

    
}
