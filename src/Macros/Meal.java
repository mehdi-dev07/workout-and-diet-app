package Macros;

import java.util.List;

public class Meal {
    private List<Food> foodList;
    private String name;

    public Meal(List<Food> foodList, String name){
        this.name = name;
        this.foodList = foodList;
    }
    public List<Food> getFoodList() {
        return foodList;
    }
    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//==========================sum functions==================================//

    public double sumCalories(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getCalories();
        }
        return sum;
    }

    public double sumCarbs(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getCarbs();
        }
        return sum;
    }

    public double sumFats(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getFats();
        }
        return sum;
    }

    public double sumProtein(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getProteins();
        }
        return sum;
    }


    public double sumSugar(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getSugars();
        }
        return sum;
    }


    public double sumFiber(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getFibers();
        }
        return sum;
    }


}
