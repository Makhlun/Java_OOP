package Rectangles;

public class CreateRectangle {
    int ax, bx, ay, by;

    public CreateRectangle(int ax, int bx, int ay, int by)
    {
        this.ax=ax;
        this.bx=bx;
        this.ay=ay;
        this.by=by;
    }

    public int GetaX ()
    {
        return ax;
    }
    public int GetbX ()
    {
        return bx;
    }
    public int GetaY ()
    {
        return ay;
    }
    public int GetbY ()
    {
        return by;
    }
    public String toString()
    {
       return View.RectangleToString(this);
    }
}
