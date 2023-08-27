package domain.company.app.entity;

public abstract class AbstractAnimal {
    String name;
    double weightKg;

    abstract void voice();

    void walk(String name) {
        System.out.println("Я " + name + " и я умею ходить.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

    abstract void walk();
}
