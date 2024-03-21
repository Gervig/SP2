class GasolinCar extends AFuelCar{

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = getKmPrLitre();
        int registrationFee = 10470;
        if (kmPrLitre > 20) {
            registrationFee = 330;
        } else if (kmPrLitre > 15) {
            registrationFee = 1050;
        } else if (kmPrLitre > 10) {
            registrationFee = 2340;
        } else if (kmPrLitre > 5) {
            registrationFee = 5500;
        }
        return registrationFee;
    }

}