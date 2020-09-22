package lab_2;

public class Circle {
    private int rad;
    private int weight_line;
    private String colour;

    public Circle(int rad, int weight_line, String colour){
        this.rad = rad;
        this.weight_line = weight_line;
        this.colour = colour;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public void setWeight_line(int weight_line) {
        this.weight_line = weight_line;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getRad() {
        return rad;
    }
    public int getWeight_line() {
        return weight_line;
    }
    public String getColour() {
        return colour;
    }
//    @Override
//    public String toString(){
//        return ()
//    }

    @Override
    public String toString() {
        return "Circle{" + "rad=" + rad + ", weight_line=" + weight_line + ", colour='" + colour + '\'' + '}';
    }

}
