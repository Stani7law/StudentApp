package Phone;

public class Test {
    public static void main(String[] args) {

        AbstractPhone phone1 = new PerviiTelefon(1879);
        AbstractPhone phone2 = new Phone(1984);
        AbstractPhone phone3 = new VideoPhone(2018);
        Smarthphone phone4 = new Smarthphone(2019, 24, "Android");
        AbstractPhone phone5 = new EnergPhone(2022);
        User user =new User("ТАня");
        //user.callAnotherUser(1325487, phone1);
        //user.callAnotherUser(2354846, phone2);
         user.callAnotherUser(7965468, phone3);
         user.callAnotherUser(8784885, phone5);
        // phone4.call(2);
        // phone1.call(5);
        // phone2.ring(8654864);
        // phone3.call(354684968);

        
    }
}
