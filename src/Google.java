/**
 * Created by raymour on 6/28/16.
 */
public class Google extends Remote implements WaterProof, Rechargeable, Universal {
    public Google(){
        super();
    }

    public Google(boolean batts, boolean USB){
        super(batts, USB);
    }

    @Override
    public void channelUp() {
        System.out.println("Channel up from Google");

    }

    @Override
    public void channelDown() {
        System.out.println("Channel down from Google");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up from Google");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down from Google");

    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
