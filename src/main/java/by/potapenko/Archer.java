package by.potapenko;

import java.util.List;

public class Archer {
    private final String name;

    private List<Weapon> weapons;

    public Archer(String name) {
        this.name = name;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", weapons=" + weapons +
                '}';
    }
}
