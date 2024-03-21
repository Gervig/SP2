public abstract class ACar implements ICar {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    @Override
    public String getMake() {
        return this.make;
    }
    @Override
    public String getModel() {
        return this.model;
    }
    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
    @Override
    public String toString(){
        String result = "";
        result += "Registration number:\t\t "+getRegistrationNumber()+"\n";
        result += "Make:\t\t\t\t\t\t "+getMake()+"\n";
        result += "Model:\t\t\t\t\t\t "+getModel()+"\n";
        result += "Number of doors:\t\t\t "+this.numberOfDoors+"\n";
        return result;
    }
}