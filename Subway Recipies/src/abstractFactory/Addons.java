package abstractFactory;

public class Addons implements Item {

    @Override
    public float price() {
        return 150;
    }

    @Override
    public String name() {
        return "Addons";
    }
}
