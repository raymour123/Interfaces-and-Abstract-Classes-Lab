/**
 * Created by raymour on 6/28/16.
 */
public abstract class Remote {
    private boolean needsBatteries;
    private boolean supportsUsb;

    public Remote(){
        needsBatteries = false;
        supportsUsb = false;
    }


    public Remote(boolean Batts, boolean USB){
        needsBatteries = Batts;
        supportsUsb = USB;
    }



    public void setBattery(){
    }

    public boolean getBattery(){
        return needsBatteries;
    }

    public abstract void channelUp();{
    }

    public abstract void channelDown();{
    }

    public abstract void volumeUp();{
    }

    public abstract void volumeDown();{
    }

    public boolean powerButtonPressed() {
        return true;
    }

    public void numberButtonPressed(int channel ){
        System.out.println("Changing channel to " + channel);
    }

    }



