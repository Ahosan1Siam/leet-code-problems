public abstract class Vehicle implements IVehicle{
    public abstract int noOfWheels();
    public void start(){
        System.out.println("Starting");
    }
}

class car extends Vehicle implements ICar{
    @Override
    public int noOfWheels() {
        System.out.println("Car has 4 wheel");
        return 4;
    }
}

class Bike extends Vehicle implements IBike{
    @Override
    public int noOfWheels() {
        System.out.println("Bike has 2 wheel");
        return 2;
    }

}

class suzuki implements IBike,ICar{
    @Override
    public int noOfWheels() {
        System.out.println("This is Suzuki Bike");
        return 0;
    }


}

class Demo{
    public static void main(String[] args){
        car myCar =new car();
        int wheels = myCar.noOfWheels();
        myCar.start();
        suzuki suzuki = new suzuki();
        suzuki.noOfWheels();

    }
}
