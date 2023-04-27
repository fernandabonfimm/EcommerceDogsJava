package src.Dog.subclasses;

import java.util.LinkedList;

import src.Dog.Dog;
import src.SaudeDoAnimal.Alimentacao.Dieta;
import src.SaudeDoAnimal.CarteiraVacinacao.CarteiraVacinacao;
import src.SaudeDoAnimal.Exams.Exames;
import src.SaudeDoAnimal.SaudeAnimal;

public class Puppy extends Dog {
    private Padreador matrizPadreador;
    private Double valorFilhote;
    private CarteiraVacinacao carteiraVacinacao;
    private Dieta dieta;
    private boolean reservado = false;
    private SaudeAnimal dogHealth;
    private Exames[] examesDog = new Exames[3];


    public Puppy(int chip, String name, Number pedigree, Padreador matrizPadreador, Double valorFilhote,
            CarteiraVacinacao carteiraVacinacao, Dieta dieta, SaudeAnimal dogHealth) {
        super(chip, name, pedigree);
        this.matrizPadreador = matrizPadreador;
        this.valorFilhote = valorFilhote;
        this.carteiraVacinacao = new CarteiraVacinacao();
        this.dieta = dieta;
        this.dogHealth = dogHealth;
        examesDog[0] = null;
        examesDog[1] = null;
        examesDog[2] = null;
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

    public boolean getReservado(){ return reservado;}

    public void setResevado(){
        reservado = true;
    }
    public void setExames(Exames[] exames)
    {
        examesDog[0] = exames[0];
        examesDog[1] = exames[1];
        examesDog[2] = exames[2];
    }
}
