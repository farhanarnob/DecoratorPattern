package decorator;

import house.House;

public class Fan extends ExtraComponent {
    private House house;

    public Fan(House house) {
        this.house = house;
    }

    @Override
    public String getName() {
        return house.getName()+", 1 Fan";
    }

    @Override
    public double cost() {
        return house.cost()+2;
    }
}
