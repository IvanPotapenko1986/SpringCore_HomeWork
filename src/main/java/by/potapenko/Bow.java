package by.potapenko;

import java.util.List;

public class Bow implements Weapon {

    private List<Arrow> arrows;

    public void setArrows(List<Arrow> arrows) {
        this.arrows = arrows;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "arrows=" + arrows +
                '}';
    }
}
