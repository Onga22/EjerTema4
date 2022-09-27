
package domain;

public class SmartPhone extends SmartDevice{
    
    boolean camara;

    public SmartPhone() {
    }

    public SmartPhone(boolean camara, boolean bluetooth, String modelo, String marca, String color, double size) {
        super(bluetooth, modelo, marca, color, size);
        this.camara = camara;
    }


}
