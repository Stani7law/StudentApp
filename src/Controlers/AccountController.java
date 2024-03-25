package Controlers;

import java.util.List;

import Domain.Person;

import Domain.Worker;


public class AccountController {

    public static <V extends Person> void printPerson(List<V> group) {
        for (V s : group){
            System.out.println(s);

        }
        
    }

    // Для защиты метода  делаем static.
    // Для объединения классов Teacher и Employee Создаём общий класс Worker
    public static <T extends Worker> void paySalary(T person, int salary){
        System.out.println(person.getName() + " выплаченная зарплата " + salary + " руб.");
    }

    public static <B extends Person> void averageAge(List<B> persons){
        double ageSum = 0;

        for (B s : persons){
            ageSum += s.getAge();
        }
        System.out.println(ageSum + " - Сумма возрастов ");
        ageSum /= 2;
        System.out.println(ageSum + " - Средний возраст ");
    }

    

}
