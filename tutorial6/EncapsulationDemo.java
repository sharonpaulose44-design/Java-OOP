class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }
    public void showModel() {
        System.out.println("Model: " + model);
    }
}
public class EncapsulationDemo{
    public static void main(String[] args) {
        Car c = new Car("BMW");
        // System.out.println(c.model);  // Compiler error
        c.showModel();
    }
}
