package src.Dog.subclasses;
import src.Dog.Dog;
import src.User.subclasse.Dono;

public class Padreador extends Dog {
    private Dog mother;
    private Dog father;
    private Dono owner;
    
    public Padreador(int chip, String name, Number pedigree, Dog father, Dog mother, Dono owner) {
        super(chip, name, pedigree);
        this.father = father;
        this.mother = mother;
        this.owner = owner;
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

    public Dono getOwner() {
        return owner;
    }

    public void setOwner(Dono owner) {
        this.owner = owner;
    }

}
