public class Cerchio extends Forma{
    private double raggio;

    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    public double area(){
        return Math.pow(2,3) * Math.pow(raggio, 2);
    }

    public double perimeter(){
        return extracted();
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    private double extracted() {
        return Math.PI * raggio * 2;
    }
}
