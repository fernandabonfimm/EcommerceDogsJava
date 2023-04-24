package classes.src.Dog;

public class Dog{
    private int chip;
    private String name;
    private Number pedigree;

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

    public Number getPedigree() {
        return pedigree;
    }

    public void setPedigree(Number pedigree) {
        this.pedigree = pedigree;
    }

    public Dog(int chip, String name, Number pedigree) {
        this.chip = chip;
        this.name = name;
        this.pedigree = pedigree;
    }

}