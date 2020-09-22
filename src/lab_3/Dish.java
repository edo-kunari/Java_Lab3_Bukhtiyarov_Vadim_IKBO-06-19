package lab_3;

public abstract class Dish {
    protected String type; protected String material;

    public String getType() {
        return type;
    }
    public String getMaterial() {
        return material;
    }

    public Dish (String type, String material){
        this.type=type;
        this.material=material; }
    public void displayInfo(){
        System.out.println("Тип посуды: " + type + " Материал: " + material); }
}
