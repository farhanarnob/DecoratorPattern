package house_type;

import house.House;

public class SmallHouse extends House {
    public SmallHouse() {
        setName("Small House");
    }

    @Override
    public double cost() {
        return 12;
    }
}
