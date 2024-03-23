package Phone;
/**Абстрактный класс Телефон, котрый будет являться родителем других классов */
public abstract class AbstractPhone {
    /**Год выпуска телефона */
    private int year;

    public AbstractPhone(int year){
        this.year = year;
    }
/** Метод Принятия номера */
    public abstract void call(int outputNumber);
    /**Метод Вызова Номера */
    public abstract void ring (int inputNumber);
}
