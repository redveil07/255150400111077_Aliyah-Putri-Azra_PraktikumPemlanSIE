public class Driver {
    Car coupe; // Has-A relationship

    public Driver() {
        System.out.println("Driver is created.");
        coupe = new Car();}

    public void driving() {
        System.out.println("Driver is driving.");
        System.out.println("Using a car that has " + coupe.numWheel + " wheels.");}}