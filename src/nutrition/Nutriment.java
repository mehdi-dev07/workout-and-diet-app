package nutrition;

public class Nutriment {

    private double ratio; //100g
    private Units units;
    private double calories;
    private double proteins;
    private double fats;
    private double carbs;
    private double sugars;
    private double fibers;

    private double vitaminD;
    private double vitaminB12;
    private double vitaminC;
    private double folate;
    private double iron;
    private double calcium;
    private double magnesium;
    private double sodium;
    private double zinc;
    private double vitaminE;
    private double vitaminA;
    private double iodine;
    private double selenium;



    public Nutriment(double ratio, Units unit,double calories,double proteins, double fats, double carbs, double sugar, double fibers){
        this.ratio = ratio;
        this.proteins = proteins;
        this.calories = calories;
        this.fats = fats;
        this.carbs = carbs;
        this.sugars = sugar;
        this.fibers = fibers;
        this.vitaminD = 0;
        this.vitaminB12 = 0;
        this.vitaminC = 0;
        this.vitaminE = 0;
        this.vitaminA = 0;
        this.iodine = 0;
        this.selenium = 0;
        this.calcium = 0;
        this.magnesium = 0;
        this.sodium = 0;
        this.zinc = 0;
        this.folate = 0;
        this.iron = 0;
    }

    public Nutriment(double ratio,double calories,double proteins, double fats, double carbs,double sugar, double fibers, double vitamineD, double vitaminC, double vitaminB12, double folate, double iron, double calcium, double magnesium, double sodium, double zinc, double vitaminA, double vitaminE, double iodine, double selenium){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.sugars = sugar;
        this.fibers = fibers;
        this.vitaminD = vitamineD;
        this.vitaminB12 = vitaminB12;
        this.vitaminC = vitaminC;
        this.vitaminE = vitaminE;
        this.vitaminA = vitaminA;
        this.iodine = iodine;
        this.selenium = selenium;
        this.calcium = calcium;
        this.magnesium = magnesium;
        this.sodium = sodium;
        this.zinc = zinc;
        this.folate = folate;
        this.iron = iron;
    }

//===========================getter=========================================//

    public double getProteins(){
        return proteins;
    }
    public double getFats(){
        return fats;
    }
    public double getCarbs(){
        return carbs;
    }
    public double getSugars(){
        return sugars;
    }
    public double getFibers(){
        return fibers;
    }
    public double getVitaminD(){
        return vitaminD;
    }
    public double getVitaminB12(){
        return vitaminB12;
    }
    public double getVitaminC(){
        return vitaminC;
    }
    public double getVitaminE(){
        return vitaminE;
    }
    public double getVitaminA(){
        return vitaminA;
    }
    public double getIodine(){
        return iodine;
    }
    public double getSelenium(){
        return selenium;
    }
    public double getCalcium(){
        return calcium;
    }
    public double getMagnesium(){
        return magnesium;
    }
    public double getSodium(){
        return sodium;
    }
    public double getZinc(){
        return zinc;
    }

    public double getFolate() {
        return folate;
    }
    public double getIron() {
        return iron;
    }
    //===========================setter=========================================//

    public void setProteins(double proteins){
        this.proteins = proteins;
    }
    public void setFats(double fats){
        this.fats = fats;
    }
    public void setCarbs(double carbs){
        this.carbs = carbs;
    }
    public void setSugars(double sugars){
        this.sugars = sugars;
    }
    public void setFibers(double fibers){
        this.fibers = fibers;
    }
    public void setVitaminD(double vitaminD){
        this.vitaminD = vitaminD;
    }
    public void setVitaminB12(double vitaminB12){
        this.vitaminB12 = vitaminB12;
    }
    public void setVitaminC(double vitaminC){
        this.vitaminC = vitaminC;
    }
    public void setVitaminE(double vitaminE){
        this.vitaminE = vitaminE;
    }
    public void setVitaminA(double vitaminA){
        this.vitaminA = vitaminA;
    }
    public void setIodine(double iodine){
        this.iodine = iodine;
    }
    public void setSelenium(double selenium){
        this.selenium = selenium;
    }
    public void setCalcium(double calcium){
        this.calcium = calcium;
    }
    public void setMagnesium(double magnesium){
        this.magnesium = magnesium;
    }
    public void setSodium(double sodium){
        this.sodium = sodium;
    }
    public void setZinc(double zinc){
        this.zinc = zinc;
    }


}
