package Rectangles;

public class Model {
    enum Intersection {
        None,
        Point,
        LineVertical,
        LineHorizontal,
        Rectangle
    }
    public static String Compare(CreateRectangle r1, CreateRectangle r2)
    {
        int ax1=r1.ax, bx1=r1.bx, ay1=r1.ay, by1=r1.by;
        int ax2=r2.ax, bx2=r2.bx, ay2=r2.ay, by2=r2.by;

        if(ax1 > bx2 || bx1 < ax2 || ay1 > by2 || by1 < ay2)
           return Intersection.None.toString(); 
        else if((ax1 == bx2 && ay1 == by2) || 
               (ax1 == bx2 && by1 == ay2) || 
               (bx1 == ax2 && ay1 == by2) || 
               (bx1 == ax2 && by1 == ay2))
               return Intersection.Point.toString();
        else if(((ax2 <= ax1 && ax1 <= bx2) || (ax2 <= bx1 && bx1 <= bx2)) 
        && (ay1 == by2 || by1 == ay2))
            return Intersection.LineHorizontal.toString();
        else if(((ay2 <= ay1 && ay1 <= by2) || (ay2 <= by1 && by1 <= by2)) && (ax1 == bx2 || bx1 == ax2))
            return Intersection.LineVertical.toString();
        return Intersection.Rectangle.toString();
    }
}
