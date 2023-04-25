package classes.src.Dog.subclasses;

import classes.src.Dog.Dog;
import classes.src.SaudeDoAnimal.Alimentacao.Dieta;
import classes.src.SaudeDoAnimal.CarteiraVacinacao.CarteiraVacinacao;
import src.SaudeDoAnimal.SaudeAnimal;

public class Puppy extends Dog {
    private Padreador matrizPadreador;
    private Double valorFilhote;
    private CarteiraVacinacao carteiraVacinacao;
    private Dieta dieta;

    private SaudeAnimal dogHealth;


    public Puppy(int chip, String name, Number pedigree, Padreador matrizPadreador, Double valorFilhote,
            CarteiraVacinacao carteiraVacinacao, Dieta dieta, SaudeAnimal dogHealth) {
        super(chip, name, pedigree);
        this.matrizPadreador = matrizPadreador;
        this.valorFilhote = valorFilhote;
        this.carteiraVacinacao = new CarteiraVacinacao();
        this.dieta = dieta;
        this.dogHealth = dogHealth;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public CarteiraVacinacao getCarteiraVacinacao() {
        return carteiraVacinacao;
    }

    public void setCarteiraVacinacao(CarteiraVacinacao carteiraVacinacao) {
        this.carteiraVacinacao = carteiraVacinacao;
    }

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

    public void vacinar(String tipoVacina, String dataVacina) {
        this.carteiraVacinacao.vacinar(tipoVacina, dataVacina);
    }

    public void exibirCarteiraVacinação() {
        this.carteiraVacinacao.exibirCarteiraVacinação();
    }

    public SaudeAnimal getDogHealth() {return this.dogHealth;}
}
