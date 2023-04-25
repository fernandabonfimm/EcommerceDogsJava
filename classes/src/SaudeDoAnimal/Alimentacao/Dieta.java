package classes.src.SaudeDoAnimal.Alimentacao;

public class Dieta {

    private String[] alimentos;

    public Dieta() {
        // Alimentos sugeridos para um filhote
        this.alimentos = new String[] { "ração para filhote", "carne moída crua", "frango cozido sem tempero",
                "arroz integral", "abóbora cozida" };
    }

    public Dieta(String[] alimentos) {
        this.alimentos = alimentos;
    }

    public void imprimirDieta() {
        System.out.println("Dieta para filhote:");
        for (String alimento : alimentos) {
            System.out.println("- " + alimento);
        }
    }

    public String[] getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String[] alimentos) {
        this.alimentos = alimentos;
    }
}
