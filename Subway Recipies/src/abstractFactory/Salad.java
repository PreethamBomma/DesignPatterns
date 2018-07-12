package abstractFactory;

public class Salad implements Item {
    @Override
    public float price() {
        return 100;
    }

    @Override
    public String name() {
        return "Salad";
    }
}
