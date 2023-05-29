package by.potapenko;

public class Dagger implements Weapon{
    private final Integer damage;

    public Dagger(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Dagger{" +
                "damage=" + damage +
                '}';
    }
}
