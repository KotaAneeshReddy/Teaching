class Vehicle {
    public void fuel(){
        System.out.println("Fueling....");
    }
}
class Truck {
    public void fuel(){
        System.out.println("Fueling....");
    }
}
class Bike extends Vehicle{
    void drive() {
        System.out.println("Driving  Bike......");
    }
}

interface Payment{
    void makePayment();
}

abstract class Payment1{
    abstract void makePayment();
}
class CreditCardPayment extends Vehicle implements Payment{
    @Override
    public void makePayment() {
        System.out.println("CreditCard Payment");
    }
}

class UpiPaymet implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Upi Payment");
    }
}

class FactoryClass{
    public Payment doPayment(String paymentType){
        if(paymentType=="CreditCard"){
            return new CreditCardPayment();
        } else{
            return new UpiPaymet();
        }
    }
}

class Main2{
    public static void main(String[] a){
        FactoryClass fc = new FactoryClass();
        String paymentType = "CreditCard"; //we will get it from request Payload(i.e from frontend)
        Payment payment = fc.doPayment(paymentType);

        int age = 10;
    }
}
