package Macros;

public class Food {
    private String name;
    private String barcode;
    private Nutriment nutriments;
    private TypeFood type;

    public Food(String name, Nutriment nutriments, TypeFood type, String barcode) {
        this.type = type;
        this.name = name;
        this.nutriments = nutriments;
        this.barcode = barcode;
    }
    public Food(String name, Nutriment nutriments, TypeFood type) {
        this.name = name;
        this.nutriments = nutriments;
        this.type = type;
    }

    public String getName() {
        return name;
    }


    public Nutriment getNutriments() {
        return nutriments;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNutriments(Nutriment nutriments) {
        this.nutriments = nutriments;
    }


}
