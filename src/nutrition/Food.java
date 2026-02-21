package nutrition;

public class Food {
    private String name;
    private Double weight;
    private Nutriment nutriments;
    private TypeFood type;

    public Food(String name, Nutriment nutriments, TypeFood type) {
        this.type = type;
        this.name = name;
        this.nutriments = nutriments;
    }
    public Food(String name, Double weight, Nutriment nutriments, TypeFood type) {
        this.name = name;
        this.weight = weight;
        this.nutriments = nutriments;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
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
