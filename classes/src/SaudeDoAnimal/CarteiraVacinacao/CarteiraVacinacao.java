package src.SaudeDoAnimal.CarteiraVacinacao;

import java.util.HashMap;
import java.util.Map;

public class CarteiraVacinacao {
    private Map<String, String> vacinas;

    public Map<String, String> getVacinas() {
        return vacinas;
    }

    public void setVacinas(Map<String, String> vacinas) {
        this.vacinas = vacinas;
    }

    public CarteiraVacinacao() {
        this.vacinas = new HashMap<>();
        this.vacinas.put("V8", "");
        this.vacinas.put("V10", "");
        this.vacinas.put("Antirrábica", "");
    }

    public void vacinar(String tipoVacina, String dataVacina) {
        if (this.vacinas.containsKey(tipoVacina)) {
            this.vacinas.put(tipoVacina, dataVacina);
        } else {
            System.out.println("Vacina não existente para cachorros");
        }
    }

    public void exibirCarteiraVacinação() {
        for (Map.Entry<String, String> entry : this.vacinas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
