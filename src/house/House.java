package house;

public abstract class House {
    private String name = "General House";

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract double cost();
}
