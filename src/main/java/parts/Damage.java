package parts;

public class Damage {

    private String description;
    private double costToRepair;

    public Damage(String description, double costToRepair) {
        this.description = description;
        this.costToRepair = costToRepair;
    }

    public String getDescription() {
        return description;
    }

    public double getCostToRepair() {
        return costToRepair;
    }
}
