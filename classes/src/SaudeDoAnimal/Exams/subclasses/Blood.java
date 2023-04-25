package src.SaudeDoAnimal.Exams.subclasses;

import src.SaudeDoAnimal.Exams.Exames;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Blood implements Exames {
    Map<String,String> exame;

    public Blood(String hemograma,String perfilBioquimico,String coagulacao){
        exame = new HashMap<>();
        exame.put("HEMOGRAMA COMPLETO", hemograma);
        exame.put("PERFIL BIOQUÍMICO", perfilBioquimico);
        exame.put("TESTE DE COAGULAÇÃO",coagulacao);
    }

    public void MostrarDados(){
        System.out.println("\n---EXAME DE SANGUE---");
        for(Map.Entry<String, String> dados :  exame.entrySet()){
            System.out.println(dados.getKey()+"\n"+dados.getValue());
        }
        System.out.println("-----");
    }


}

