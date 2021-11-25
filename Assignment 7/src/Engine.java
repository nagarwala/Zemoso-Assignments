public interface Engine {
    int horsepower(int hp);
    void typeOfEngine();
}

interface Brakes{
    int resistantPower(int rp);
    void typeOfBrakes();
}

interface GearBox{
    int numberOfGears(int numGear);
    void typeOfGearBox();
}

interface Car extends Engine, Brakes, GearBox{

    void companyOfCar();
}

class brand{
    void nameOfCar(){
        System.out.println("Car Brand");
    }
}

class TypeOfCar extends brand implements Car{

    @Override
    public int horsepower(int a) {
        return a;
    }

    @Override
    public void typeOfEngine() {
        System.out.println("Engine type");
    }

    @Override
    public int resistantPower(int b) {
        return b;
    }

    @Override
    public void typeOfBrakes() {
        System.out.println("Types of Brakes");
    }

    @Override
    public int numberOfGears(int g) {
        return g;
    }

    @Override
    public void typeOfGearBox() {
        System.out.println("Gear Box");
    }

    @Override
    public void companyOfCar() {
        System.out.println("Car Company");
    }
}

class CarMain{

    public static void Honda(Engine engine) {
        System.out.println("The horse power is " + engine.horsepower(60));
    }

    public static void Toyota(Brakes brakes){
        brakes.typeOfBrakes();
    }

    public static void Tata(GearBox gear){
        System.out.println("The number of gears " + gear.numberOfGears(12));
    }

    public static void Suzuki(Car car){
        car.companyOfCar();
    }

    public static void main(String[] args) {
        TypeOfCar tc = new TypeOfCar();
        Honda(tc);
        Toyota(tc);
        Tata(tc);
        Suzuki(tc);
    }

}
