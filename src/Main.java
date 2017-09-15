public class Main {
    public static void main (String[] args){
        PowerBank powerBank = new PowerBank();
            powerBank.setBatteryCapacity(2000);
            powerBank.setManufacturer("Xiaomi");
            powerBank.setColor("Biały niczym śnieg");
            powerBank.setIndicator(true);

            System.out.println(powerBank.getBatteryCapacity());
            System.out.println(powerBank.getManufacturer());
            System.out.println(powerBank.getColor());
            if(powerBank.getIndicator()){
                System.out.println("Power Bank jest pełny");
            }else {System.out.println("Power Bank jest pusty");
            }
    }
}
