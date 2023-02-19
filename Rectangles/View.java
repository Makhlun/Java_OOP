package Rectangles;

public class View {
    public static String RectangleToString (CreateRectangle rectangle)
    {
        return "This rectange have: \nax = " + rectangle.ax + 
        "\nbx = " + rectangle.bx + "\nay = " + rectangle.ay +
        "\nby = " + rectangle.by;
    }
    public String Compare (CreateRectangle r1, CreateRectangle r2)
    {
        return "Rectangules are " + Model.Compare(r1,r2);
    }

}
