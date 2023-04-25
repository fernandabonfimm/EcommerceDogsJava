package classes.src.SaudeDoAnimal.Consulta;

import java.time.LocalDate;
import java.util.Map;

import classes.src.Dog.subclasses.Puppy;
import classes.src.SaudeDoAnimal.CarteiraVacinacao.CarteiraVacinacao;
import classes.src.User.subclasse.Veterinary;

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
        boolean exameFezes = verificarExameFezes();

        if (exameFezes) {
            System.out.println("O animal está saudável.");
        } else {
            System.out.println("ATENÇÃO: O animal pode estar com problemas de saúde, é necessário realizar exame de fezes.");
        }
        System.out.println("PRESCRIÇÃO: Recomenda-se que o animal seja submetido a exame de fezes para diagnosticar eventuais problemas de saúde.");
    }

    private boolean verificarExameFezes() {
        return true;
    }
}

