package src.SaudeDoAnimal.Exams.subclasses;

import src.SaudeDoAnimal.Exams.Exames;

import java.util.Map;
import java.util.HashMap;


public class Feces implements Exames {
    private Map<String, Boolean> exame;

    public Feces(Boolean sangue, Boolean muco, Boolean bacteria){
        exame = new HashMap<>();
        exame.put("BACTERIA", bacteria);
        exame.put("SANGUE", sangue);
        exame.put("MUCO",muco);
    }
//    public boolean verificarExames(){
//        for(Map.Entry<String, Boolean> dados :  exame.entrySet()){
//            if(dados.getValue()){
//                return false;
//            }
//        }
//        return true;
//    }

    public void MostrarDados(){
        for(Map.Entry<String, Boolean> dados :  exame.entrySet()){
            if(dados.getValue()){
                System.out.printf("O exame de fezes encontrou complicações relacionado a: %s\n",dados.getKey());
            }
        }
    }
}
