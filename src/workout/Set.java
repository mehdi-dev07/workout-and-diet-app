package workout;

public class Set extends Exercise {
    Exercise exercise;
    int reps;
    int weight;
    int rir;

    public Set(Exercise exercise, int reps, int weight, int rir, String name, String type) {
        super(name, type);
        this.exercise = exercise;
        this.reps = reps;
        this.weight = weight;
        this.rir = rir;
    }

    public Exercise getExercise() {
        return exercise;
    }
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getRir() {
        return rir;
    }
}
