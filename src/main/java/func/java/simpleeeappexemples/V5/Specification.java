package func.java.simpleeeappexemples.V5;

/**
 *
 * @author Guilherme
 */
public class Specification {

    private Color color;
    private EngineType engineType;

    public Specification() {
    }

    public Specification(Color color, EngineType engineType) {
        this.color = color;
        this.engineType = engineType;
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
