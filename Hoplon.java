package Shields;

public class Hoplon extends Shield{

    private static final String armorReserve = null;

    public Hoplon(int size, int armorReserve) {
        super(size, armorReserve);
    }

    @Override
    public String toString() {
        return "Hoplon{" +
                "armorReserve=" + armorReserve +
                '}';
    }
}

