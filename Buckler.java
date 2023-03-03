package Shields;

public class Buckler extends Shield{

    private static final String armorReserve = null;

    public Buckler(int size, int armorReserve) {
        super(size, armorReserve);
    }

    @Override
    public String toString() {
        return "Buckler{" +
                "armorReserve=" + armorReserve +
                '}';
    }
}

