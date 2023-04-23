package Alimentation;

import Dog.Dog;
import HealthData.Vaccine;

import java.util.LinkedList;

public class Alimentation {
    private Dog dog;
    private LinkedList<String> recommendedFoods = new LinkedList<String>();;
    private LinkedList<String> forbiddenFoods = new LinkedList<String>();

    public void addRecommendedFood(String food){
        recommendedFoods.add(food);
    }

    public void addforbiddenFoods(String food){
        forbiddenFoods.add(food);
    }
    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public LinkedList<String> getRecommendedFoods() {
        return recommendedFoods;
    }

    public void setRecommendedFoods(LinkedList<String> recommendedFoods) {
        this.recommendedFoods = recommendedFoods;
    }

    public LinkedList<String> getForbiddenFoods() {
        return forbiddenFoods;
    }

    public void setForbiddenFoods(LinkedList<String> forbiddenFoods) {
        this.forbiddenFoods = forbiddenFoods;
    }
}
