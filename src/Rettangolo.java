public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public double area(){
        return base * altezza;
    }

    public double perimeter(){
        return (base * 2) + (altezza * 2);
    }
}

