
package domain;


public class SmartWatch extends SmartDevice{
    
    boolean waterResist;

    public SmartWatch() {
    }

   

    public SmartWatch(boolean waterResist, boolean bluetooth, String modelo, String marca, String color, double size) {
        super(bluetooth, modelo, marca, color, size);
        this.waterResist = waterResist;
    }
    
}
