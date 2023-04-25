package src.SaudeDoAnimal.Exams.subclasses;

import src.SaudeDoAnimal.Exams.Exames;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Displasia implements Exames {
    private Map<String, Object> exame;

    public Displasia(String irregularidadeOssea, String sinalDeArtrite, double grau){
        exame = new HashMap<>();
        exame.put("IRREGULARIDADE OSSEA", irregularidadeOssea);
        exame.put("SINAL DE ARTRITES", sinalDeArtrite);
        exame.put("GRAU DE DISPLASIA",grau);
    }

    public void MostrarDados(){
        for(Map.Entry<String, Object> dados :  exame.entrySet()){
            if(dados.getKey() == "GRAU DE DISPLASIA"){
                System.out.println(dados.getKey()+"\n%"+dados.getValue());
            }
            else{
                System.out.println(dados.getKey()+"\n"+dados.getValue());
            }
        }
    }
}
