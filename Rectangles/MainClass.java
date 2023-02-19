package Rectangles;

import java.net.SocketImpl;

public class MainClass {
    static View v = new View();
    public static void main(String[] args) throws Exception {
        CreateRectangle rectangle1 = new CreateRectangle(0, 2, 0, 2);
        CreateRectangle rectangle2 = new CreateRectangle(2,5,1,3);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(v.Compare(rectangle1, rectangle2));
    }
}
