public class Sedan extends Car {
public int numDoors = 3;

public void trunk() {
System.out.println("Sedan is opening trunk");
}
public void honk() {
System.out.println("Sedan is honking");
super.honk();
}
private void getNumWheels() {
System.out.println("Sedan has " + numWheel + " wheels");
}

public void showWheels() {
    getNumWheels();
}


}