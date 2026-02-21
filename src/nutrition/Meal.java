package nutrition;

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
            sum += food.getCalories();
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

    public double sumSodium(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getSodium();
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

    public double sumVitaminD(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getVitaminD();
        }
        return sum;
    }

    public double sumVitaminC(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getVitaminC();
        }
        return sum;
    }

    public double sumVitaminB12(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getVitaminB12();
        }
        return sum;
    }

    public double sumFolate(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getFolate();
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

    public double sumCalcium(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getCalcium();
        }
        return sum;
    }

    public double sumZinc(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getZinc();
        }
        return sum;
    }

    public double sumVitaminE(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getVitaminE();
        }
        return sum;
    }

    public double sumVitaminA(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getVitaminA();
        }
        return sum;
    }

    public double sumIron(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getIron();
        }
        return sum;
    }

    public double sumIodine(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getIodine();
        }
        return sum;
    }

    public double sumMagnesium(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getMagnesium();
        }
        return sum;
    }

    public double sumSelenium(){
        double sum = 0;
        for (Food food : foodList){
            sum += food.getNutriments().getSelenium();
        }
        return sum;
    }

}
