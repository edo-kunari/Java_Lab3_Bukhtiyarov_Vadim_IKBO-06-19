package lab_3;

class Fork extends Dish {
    private String diametr;

    public Fork(String type, String material, String diametr) {
        super(type, material);
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Dish{" + "type=" + type + ", material=" + material + ", diametr= " + diametr + '\'' +  '}';
    }
}
