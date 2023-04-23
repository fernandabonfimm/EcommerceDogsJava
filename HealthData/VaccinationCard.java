package HealthData;

import Dog.Dog;

import java.util.LinkedList;

public class VaccinationCard {
    private Dog dog;
    private LinkedList<Vaccine> vaccinesList = new LinkedList<Vaccine>();
    private LinkedList<Vermifuge> vermifugesList = new LinkedList<Vermifuge>();

    public void addVaccine(Vaccine vaccine){
        vaccinesList.add(vaccine);
    }

    public void addVermifuge(Vermifuge vermifuge){
        vermifugesList.add(vermifuge);
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public LinkedList<Vaccine> getVaccinesList() {
        return vaccinesList;
    }

    public void setVaccinesList(LinkedList<Vaccine> vaccinesList) {
        this.vaccinesList = vaccinesList;
    }

    public LinkedList<Vermifuge> getVermifugesList() {
        return vermifugesList;
    }

    public void setVermifugesList(LinkedList<Vermifuge> vermifugesList) {
        this.vermifugesList = vermifugesList;
    }
}
