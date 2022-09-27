
package domain;


public class MainDevice {
    public static void main(String[] args) {
        
        SmartPhone phone = new SmartPhone(true , true , "A10" , "Samsung", "Black" , 10.4 );
        SmartWatch clock = new SmartWatch(true , false , "Px48" , "Apple" , "Pink" , 4.5);
        
        System.out.println("Caracteristicas del Telefono: " +"\n" +
                "Contiene Bluetooth: " + phone.bluetooth+"\n"+
                "Contiene camara: " + phone.camara+"\n"+
                "Modelo: " + phone.modelo +"\n"+
                "Marca: " + phone.marca +"\n"+
                "Color: " + phone.color +"\n"+
                "Tamaño de la pantalla: " + phone.size + " pulgadas ");
        
        System.out.println("\n");
        
        System.out.println("Caracteristicas del Reloj: " +"\n" +
                "Es resistente al Agua: " + clock.waterResist+"\n"+
                "Contiene Bluetooth: " + clock.bluetooth+"\n"+
                "Modelo: " + clock.modelo +"\n"+
                "Marca: " + clock.marca +"\n"+
                "Color: " + clock.color +"\n"+
                "Tamaño de la pantalla: " + clock.size + " pulgadas ");
        
                
      
       
        
        
    }
}
