package classes.src.Dog.subclasses;

import classes.src.Dog.Dog;

public class Puppy extends Dog {
    private Padreador matrizPadreador;
    private Double valorFilhote;

    public Double getValorFilhote() {
        return valorFilhote;
    }

    public void setValorFilhote(Double valorFilhote) {
        this.valorFilhote = valorFilhote;
    }

    public Padreador getMatrizPadreador() {
        return matrizPadreador;
    }

    public void setMatrizPadreador(Padreador matrizPadreador) {
        this.matrizPadreador = matrizPadreador;
    }

    public Puppy(int chip, String name, Number pedigree, Padreador matrizPadreador, Double valorFilhote) {
        super(chip, name, pedigree);
        this.matrizPadreador = matrizPadreador;
        this.valorFilhote = valorFilhote;
    }

}
