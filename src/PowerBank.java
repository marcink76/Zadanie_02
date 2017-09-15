public class PowerBank {
    private String manufacturer;
    private int batteryCapacity;
    private String color;
    private boolean indicator; //full empty

        public PowerBank(){
            this.manufacturer = manufacturer;
            this.batteryCapacity = batteryCapacity;
            this.color = color;
            this.indicator = indicator;
        }

        void setManufacturer(String manufacturer){
            this.manufacturer = manufacturer;
        }
        String getManufacturer(){
            return manufacturer;
        }
        void setBatteryCapacity(int batteryCapacity){
            this.batteryCapacity = batteryCapacity;
        }
        int getBatteryCapacity(){
            return batteryCapacity;
        }
        void setColor(String color){
            this.color = color;
        }
        String getColor(){
            return color;
        }
        void setIndicator(boolean indicator){
            this.indicator = indicator;
        }
        boolean getIndicator(){
            return indicator;
        }
}
