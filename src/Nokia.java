/**
 * Created by raymour on 6/28/16.
 */
public class Nokia extends Remote implements WaterProof, Rechargeable, Universal {
    public Nokia(){
        super();
    }

    public Nokia(boolean batts, boolean USB){
        super(batts, USB);
    }

    @Override
    public void channelUp() {
        System.out.println("Channel up from Nokia");

    }

    @Override
    public void channelDown() {
        System.out.println("Channel down from Nokia");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up from Nokia");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down from Nokia");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("The ONLY way to play SNAKE");

    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
