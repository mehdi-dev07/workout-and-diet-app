package Macros;

public class Nutriment {

    private double ratio; //100g
    private Units units;
    private double calories;
    private double proteins;
    private double fats;
    private double carbs;
    private double sugars;
    private double fibers;



    public Nutriment(double ratio, Units unit,double calories,double proteins, double fats, double carbs, double sugar, double fibers){
        this.ratio = ratio;
        this.proteins = proteins;
        this.calories = calories;
        this.fats = fats;
        this.carbs = carbs;
        this.sugars = sugar;
        this.fibers = fibers;
    }


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
    public double getCalories(){
        return calories;
    }


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
    public void setCalories(double calories){
        this.calories = calories;
    }

}
