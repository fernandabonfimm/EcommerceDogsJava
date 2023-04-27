package src.SaudeDoAnimal;

public enum SaudeAnimal {
    SAUDAVEL(1),
    DOENTE(2),
    DESNUTRIDO(4);

    int number;

    SaudeAnimal(int number){
        this.number = number;
    }
}
