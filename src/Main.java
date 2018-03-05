import decorator.Door;
import decorator.Fan;
import house.House;
import house_type.LargeHouse;
import house_type.SmallHouse;

public class Main {
    public static void main(String[] args) {
        House house = new LargeHouse();
        house=  new Fan(house);
        house=  new Fan(house);
        house=  new Fan(house);
        house = new Door(house);
        house = new Door(house);
        house = new Door(house);
        System.out.println(house.getName()+"; cost:"+house.cost());


        House house1 = new SmallHouse();
        house1 = new Fan(house1);
        house1 = new Door(house1);
        System.out.println(house1.getName()+"; cost:"+house1.cost());
    }
}
