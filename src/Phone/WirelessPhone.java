package Phone;
/**Беспроводной телефон */
public abstract class WirelessPhone extends AbstractPhone{

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }

    

}
