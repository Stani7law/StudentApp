package INTERFACES;

public class Duck implements Swimmable, iLetati {

    @Override
    public void svim() {
        System.out.println("Уточка, плыви!");
    }

    @Override
    public void poliot(String swim) {
        System.out.println(swim + " теперь взлетай");
    }



}
