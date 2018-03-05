package house_type;

import house.House;

public class LargeHouse extends House {


    public LargeHouse() {
        setName("Large House");
    }

    @Override
    public double cost() {
        return 2222;
    }
}
