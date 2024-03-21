import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<ICar> fleet = new ArrayList<>();

    public void addCar(ICar car){
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for (ICar c: fleet){
            sum += c.getRegistrationFee();
        }
        return sum;
    }
    @Override
    public String toString(){
        String result = "";
        for (ICar c: fleet){
            result += "Registration number:\t\t "+c.getRegistrationNumber()+"\n";
            result += "Make:\t\t\t\t\t\t "+c.getMake()+"\n";
            result += "Model:\t\t\t\t\t\t "+c.getModel()+"\n";
            result += "Registration fee:\t\t\t "+c.getRegistrationFee()+" dkk"+"\n\n";
        }
        return result;
    }
}