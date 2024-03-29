package chapter13_Generic.multiTypeParameter;

public class ProductExample {
    public static void main(String[] args) {

        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("Smart TV");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("Diesel");
        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
