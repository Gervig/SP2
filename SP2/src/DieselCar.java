class DieselCar extends AFuelCar{
    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }
    public boolean hasParticleFilter(){
        return this.particleFilter;
    }
    @Override
    public int getRegistrationFee() {
        int kmPrLitre = getKmPrLitre();
        int equalizationTax = 15260;
        int registrationFee = 10470;
            if (kmPrLitre > 20) {
                registrationFee = 330;
                equalizationTax = 130;
            } else if (kmPrLitre > 15) {
                registrationFee = 1050;
                equalizationTax = 1390;
            } else if (kmPrLitre > 10) {
                registrationFee = 2340;
                equalizationTax = 1850;
            } else if (kmPrLitre > 5) {
                registrationFee = 5500;
                equalizationTax = 2770;
            }

        int sum = equalizationTax + registrationFee;

        if(!hasParticleFilter()){
            sum += 1000;
        }
        return sum;
    }
    @Override
    public String toString(){
        String result = super.toString()+"Particle filter:\t\t\t "+hasParticleFilter()+"\n";
        result += "Registration fee:\t\t\t "+getRegistrationFee()+" dkk"+"\n\n";
        return result;
    }
}