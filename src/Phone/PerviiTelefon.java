package Phone;

public class PerviiTelefon extends AbstractPhone {

    public PerviiTelefon(int year) {
        super(year);
       
    }
    
    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }



}
