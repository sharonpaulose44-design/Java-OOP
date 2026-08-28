
class Animal {
    String species;
    Animal(String species) {
        this.species = species;
    }
    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
public class DefaultDemo{
    public static void main(String[] args) {
        Animal a = new Animal("Lion");
        // Direct access because both classes are in the same package
        System.out.println("Species: " + a.species);
        a.displaySpecies();
    }
}
