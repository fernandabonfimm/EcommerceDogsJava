package Dog;

import ExamLab.BloodExam;
import ExamLab.DisplasiaExams;
import ExamLab.FecesExam;
import HealthData.VaccinationCard;

import java.sql.Date;

public class Dog{
    private int chip;
    private String name;
    private String breed;
    private Date birthday;
    private int pedigree;
    private Dog mother;
    private Dog father;
    private BloodExam dogBloodExam;
    private FecesExam dogFecesExam;
    private DisplasiaExams dogDisplasiaExams;
    private VaccinationCard dogVaccinationCard;

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPedigree() {
        return pedigree;
    }

    public void setPedigree(int pedigree) {
        this.pedigree = pedigree;
    }

    public Dog getMother() {
        return mother;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        this.father = father;
    }




}