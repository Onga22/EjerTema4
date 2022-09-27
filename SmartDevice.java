package domain;

public class SmartDevice {

    boolean bluetooth;
    String modelo;
    String marca;
    String color;
    double size;

    public SmartDevice() {
    }

    public SmartDevice(boolean bluetooth, String modelo, String marca, String color, double size) {
        this.bluetooth = bluetooth;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.size = size;
    }

}
