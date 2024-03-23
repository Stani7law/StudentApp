package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс ГруппСтудентов, в котором будет находиться список студентов
 * 
 * @param Iterable интерфейс Iterable и передаем ему тип <Student>
 */
public class StudentGroup implements Iterable<Student>  {// Если имплементировали метод Iterable необходимо добавить
    // метод iterator.
    /** список студентов в группе */
    protected List<Student> group;
    /** номер группы */
    private int idGroup;

    /**
     * Конструктор
     * 
     * @param group   группа студентов созданная из списка List<Student>
     * @param idGroup номер группы
     */
   

    public StudentGroup( List<Student> group, int idGroup) {
        
        this.group = group;
        this.idGroup = idGroup;
    }

    // Добавили гетеры и сетеры.Без переопределения.
    /**
     * Метод что получает ->
     * 
     * @return список студентов в группе
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * Метод позволяет переименовать группу, но сейчас передаёт
     * 
     * @param group список студентов в группе
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * метод что получает
     * 
     * @return номер группы
     */
    public int getIdGroup() {
        return idGroup;
    }

    /**
     * Метод позволяет переназначить номер группы, но сейчас передаёт
     * 
     * @param idGroup номер группы
     */
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup [group = " + group + ", idgroup=" + idGroup + "]";

    }

    // Прежде чем переопределить метод необходимо создать новый класс, сейчас
    // StudentIterator и вернуть
    // new StudentIterator(group);
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    

}
