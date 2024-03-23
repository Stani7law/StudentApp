package Phone;

public class Smarthphone extends CellPhone {

    private String operationSystem;

    public Smarthphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }
    

}
