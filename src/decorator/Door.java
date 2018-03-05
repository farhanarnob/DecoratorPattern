package decorator;

import house.House;

public class Door extends ExtraComponent {
    House house;
    public Door(House house) {
        this.house = house;
    }

    @Override
    public String getName() {
        return house.getName()+", 1 Door";
    }

    @Override
    public double cost() {
        return house.cost()+3;
    }
}
