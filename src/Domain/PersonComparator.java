package Domain;

import java.util.Comparator;

// 1) Для того чтобы этот класс стал компаратором ему необходимо имплементировать 
//компаратор Comparator<Student>  и сравнивать 2 объекта между собой
//2) для образования класса генерик необходимо после названия класса указать треугольные скобочки 
//и тип данных <Т extend Person>, после чего меняем в Comparable <тип данных на "T">

public class PersonComparator<T extends Person> implements Comparator<T> {

    /**
     * Метод позволяющий сравнивать объекты между собой, в данном случае
     * Student(студентов их имя)
     * простой код сравнитель студентов , но
     * 2.1) Теперь не надо указывать в методе compare() Student, вместо этого подставляем Т
     */
    // Что теперь происходит -> Компелятор подставляет указанное значение в <> и пытается запустить код
    
    @Override
    public int compare(T o1, T o2) {
        // result присваевается сравнение 1 имени студента со вторым
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }

}