package lab_3;

class Spoon extends Dish{
    private String tooths;
    public Spoon(String type, String material, String tooths) {
        super(type, material);
        this.tooths=tooths; }

    @Override
    public String toString() {
        return "Dish{" + "type=" + type + ", material=" + material + ", tooths= " + tooths + '\'' +  '}';
    }
}