/**
 * Created by raymour on 6/28/16.
 */
public class Motorolla extends Remote implements WaterProof, Rechargeable, Universal {

   public Motorolla(){
       super();
   }

    public Motorolla(boolean batts, boolean USB){
        super(batts, USB);
    }

    @Override
    public void channelUp() {
        System.out.println("Channel up from Motorolla");
    }

    @Override
    public void channelDown() {
        System.out.println("Channel down from Motorolla");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up from Motorolla");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down from Motorolla");
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Droid Does");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
