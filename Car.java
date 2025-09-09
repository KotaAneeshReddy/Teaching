public class Car {

    public static String brand;
    private int speed;

    public Car(){
    }   //default constructor

    public Car(String brand, int speed){
        this(); //parameterised constructor
        Car.brand = brand;
        this.speed=speed;
        System.out.println(this.brand);
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>0) {
            this.speed = speed;
        }
    }

    public void accelerate(){
        speed=speed+10;
//        System.out.println("Speed: "+this.speed);
    }

    public static void main(String[] a){
        Car innova = new Car();  //Object creation
        Car fortuner = new Car("Toyota",100);//Object creation

        System.out.println("Brand1: "+Car.brand+" speed: "+innova.speed);
        System.out.println("Brand1: "+Car.brand+" speed: "+fortuner.speed);

    }
}
