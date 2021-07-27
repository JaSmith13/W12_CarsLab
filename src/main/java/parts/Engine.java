package parts;

public class Engine {

    private EngineType type;
    private int horsePower;

    public Engine(EngineType type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public EngineType getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
