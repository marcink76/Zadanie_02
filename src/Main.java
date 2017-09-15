public class Main {
    public static void main (String[] args){
        PowerBank powerBank = new PowerBank();
            powerBank.batteryCapacity = 20000;
            powerBank.manufacturer = "Xiaomi";
            powerBank.color = "Biały";
            powerBank.indicator = true;

            System.out.println(powerBank.batteryCapacity);
            System.out.println(powerBank.manufacturer);
            System.out.println(powerBank.color);
            if(powerBank.indicator){
                System.out.println("Power Bank jest pełny");
            }else {System.out.println("Power Bank jest pusty");
            }
    }
}
