public class App {
    public static void main(String[] args) throws Exception {
        Forma f1 = new Cerchio(20);

        System.out.println("Area: " + f1.area() + " Perimeter: "+ f1.perimeter());

        Forma f2 = new Rettangolo(10, 5);

        System.out.println("Area: " + f2.area() + " Perimeter: "+ f2.perimeter());
    }
}
