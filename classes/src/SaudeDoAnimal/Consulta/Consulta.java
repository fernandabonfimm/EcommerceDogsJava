package classes.src.SaudeDoAnimal.Consulta;

import java.time.LocalDate;
import java.util.Map;

import classes.src.Dog.subclasses.Puppy;
import classes.src.SaudeDoAnimal.CarteiraVacinacao.CarteiraVacinacao;
import classes.src.User.subclasse.Veterinary;
import src.SaudeDoAnimal.Exams.subclasses.Blood;
import src.SaudeDoAnimal.Exams.subclasses.Displasia;
import src.SaudeDoAnimal.Exams.subclasses.Feces;
import src.SaudeDoAnimal.SaudeAnimal;

public class Consulta {
    private Veterinary veterinario;
    private Puppy puppy;
    private LocalDate dataConsulta;

    public Consulta(Veterinary veterinario, Puppy puppy, LocalDate dataConsulta) {
        this.veterinario = veterinario;
        this.puppy = puppy;
        this.dataConsulta = dataConsulta;
    }

    public void realizarConsulta() {
        boolean vacinado = verificarVacinacao();
        verificarSaude();
    }

    private boolean verificarVacinacao() {
        CarteiraVacinacao carteira = puppy.getCarteiraVacinacao();
        boolean vacinado = true;

        for (Map.Entry<String, String> entry : carteira.getVacinas().entrySet()) {
            if (entry.getValue().isEmpty()) {
                System.out.println("ATENÇÃO: O animal não está vacinado contra " + entry.getKey());
                vacinado = false;
            }
        }

        if (vacinado) {
            System.out.println("O animal está devidamente vacinado.");
        }

        return vacinado;
    }

    private void verificarSaude() {
        switch (this.puppy.getDogHealth()){
            case SAUDAVEL -> System.out.println("CACHORRO SAUDÁVEL!!!");
            case DOENTE -> bateriaDeExames();
            case DESNUTRIDO -> System.out.println("CACHORRO DESNUTRIDO!!!");
        }

        //System.out.println("PRESCRIÇÃO: Recomenda-se que o animal seja submetido a exame de fezes para diagnosticar eventuais problemas de saúde.");
    }

    private void bateriaDeExames(){
        System.out.println("CACHORRO DOENTE!!!");
        Feces exameFeces = new Feces(true,true,true);
        Blood exameSangue = new Blood("Hemograma bla bla bla","O perfil do cachorro é que ele é estressado",
                "Não esta coagulado");
        Displasia exameDisplasia = new Displasia("Foi encontra irregularidades osseas no quadril","Sem sinal de artrite",
                5.87);
        exameFeces.MostrarDados();
        exameSangue.MostrarDados();
        exameDisplasia.MostrarDados();
    }

}

