package classes.src.Dog.subclasses;

import classes.src.Dog.Dog;

public class Puppy extends Dog {
    private Padreador matrizPadreador;

    public Padreador getMatrizPadreador() {
        return matrizPadreador;
    }

    public void setMatrizPadreador(Padreador matrizPadreador) {
        this.matrizPadreador = matrizPadreador;
    }

    public Puppy(int chip, String name, Number pedigree, Padreador matrizPadreador) {
        super(chip, name, pedigree);
        this.matrizPadreador = matrizPadreador;
    }

}
