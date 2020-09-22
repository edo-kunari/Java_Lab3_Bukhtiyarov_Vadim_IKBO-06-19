package lab_2;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        int rad, weight_line;
        String colour;

        Scanner in = new Scanner(System.in);
        rad = in.nextInt();
        weight_line = in.nextInt();
        colour = in.next();

        Circle ob1 = new Circle(rad, weight_line, colour);
        System.out.println(ob1);

        ob1.setRad(in.nextInt());
        ob1.setWeight_line(in.nextInt());
        ob1.setColour(in.next());

        System.out.println(ob1);
    }
}
