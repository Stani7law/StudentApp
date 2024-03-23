package Domain;

import java.util.Iterator;
import java.util.List;

//Для того чтобы класс стал итератором необходимо имплементировать интерфейс Iterator и передаем объект
//Добавляем методы hasNext() и next() переопределяем их
/** */
public class StudentIterator implements Iterator<Student> {
    /** Счетчик который отслеживает позицию в списке */
    private int count;

    /** Список по которому будем проходить */
    private List<Student> students;

    /**
     * Метод для получения списка студентов
     * 
     * @param students студенты
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает ответ - Дошли мы до конца списка или нет, а дойдем когда count
     * будет равен длине списка studetn.size()
     */
    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    /** Возвращает следующий объект */// для этого нужно ещё и count увеличить на 1 -> count++;
    @Override
    public Student next() {
        return students.get(count++);
    }

    // теперь в классе StudentGrup должны вернуть класс StudentIterator и поместить
    // его в метод iterator

}
