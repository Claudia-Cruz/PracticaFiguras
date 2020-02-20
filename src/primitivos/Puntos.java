package primitivos;

public class Puntos {
    Puntos(double x,double y)
    {
        this._x=x;
        this._y=y;
    }
    private double _x;
    private double _y;

    public double Getx()
    {
        return this._x;
    }

    public double Gety()
    {
        return this._y;
    }
}
