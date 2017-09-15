public class Main {
    public static void main (String[] args){
        PowerBank powerBank = new PowerBank();
            powerBank.setBatteryCapacity(2000);
            powerBank.setManufacturer("Xiaomi");
            powerBank.setColor("Biały niczym śnieg");
            powerBank.setIndicator(true);

            System.out.println("Pojemność powerbanku: " + powerBank.getBatteryCapacity());
            System.out.println("Producent: "+powerBank.getManufacturer());
            System.out.println("Kolor: "+powerBank.getColor());
            if(powerBank.getIndicator()){
                System.out.println("Power Bank jest pełny");
            }else {System.out.println("Power Bank jest pusty");
            }
    }
}
