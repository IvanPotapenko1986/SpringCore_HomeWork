package by.potapenko;

public class Arrow{

    private final Integer damage;
    public Arrow(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Arrow{" +
                "damage=" + damage +
                '}';
    }
}
