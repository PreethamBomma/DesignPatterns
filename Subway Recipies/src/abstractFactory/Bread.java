package abstractFactory;

public class Bread implements Item {
    @Override
    public String name() {
        return "Bread";
    }

    @Override
    public float price() {
        return 60;
    }
}
