class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;     // this should be kilowatt, not watt
        this.maxRange = maxRange;                   // this should be kilometers
    }

    public int getBatteryCapacityKWh(){
        return this.batteryCapacity;
    }
    public int getMaxRangeKm(){
        return this.maxRange;
    }
    public int getWhPrKm(){
        return (this.batteryCapacity*1000) / this.maxRange;
    }
    @Override
    public int getRegistrationFee() {
        int WhPrKm = getWhPrKm();
        int registrationFee = 10470;
        if (WhPrKm > 20) {
            registrationFee = 330;
        } else if (WhPrKm > 15) {
            registrationFee = 1050;
        } else if (WhPrKm > 10) {
            registrationFee = 2340;
        } else if (WhPrKm > 5) {
            registrationFee = 5500;
        }
        return registrationFee;
    }
    @Override
    public String toString(){
        String result = super.toString();
        result += "Battery capacity:\t\t\t "+getBatteryCapacityKWh()+" KWh"+"\n";
        result += "Max range:\t\t\t\t\t "+getMaxRangeKm()+" km"+"\n";
        result += "Watt-hours per kilometers:\t "+getWhPrKm()+" Wh/km"+"\n";
        result += "Registration fee:\t\t\t "+getRegistrationFee()+" dkk"+"\n";
        return result;
    }
}