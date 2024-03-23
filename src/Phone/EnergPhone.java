package Phone;

public class EnergPhone extends AbstractPhone{

    public EnergPhone(int year) {
        super(year);
        
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вас вызывает номер " + outputNumber);
       
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вызов завершен!");
    }

}
