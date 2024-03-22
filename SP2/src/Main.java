public class Main {
    public static void main(String[] args) {
        GasolinCar gas1 = new GasolinCar("ABC 123", "Mercedes", "McLaren", 4, 12);
        DieselCar die1 = new DieselCar("DEF 456", "Sköda", "Slavia", 4, 25,true);
        ElectricCar ele1 = new ElectricCar("GHI 789", "Hyundai", "Ioniq 5 N",4, 84, 448);
        FleetOfCars f1 = new FleetOfCars();
        f1.addCar(gas1);
        f1.addCar(die1);
        f1.addCar(ele1);
        System.out.println(f1);
        System.out.println(ele1.getWhPrKm());
        System.out.println("Total registration fee for fleet of cars is: "+f1.getTotalRegistrationFeeForFleet()+" dkk");
    }
}