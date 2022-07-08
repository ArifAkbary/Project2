package Project1;
//Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice() which
// should be returning a price of the Vehicle.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation
// of  calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price
// car should include 10% discount, otherwise 20% discount.
// The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
// if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

 public class Vehicle {

    double vPrice;
    void getSalePrice(){


    }

}
class Truck extends Vehicle{
   double weight;


    @Override
    void getSalePrice() {
        if(weight>2000){
            System.out.println("the dicount is "+(vPrice/100)*20);
        }else {
            System.out.println("the dicount is "+(vPrice/100)*10);
        }

    }

}
class Sedan extends Vehicle{
  double length;


    @Override
    void getSalePrice() {
        if(length<20){
            System.out.println("the dicount is "+(vPrice/100)*10);
        }else {
            System.out.println("the dicount is "+(vPrice/100)*5);
        }

    }

    public static void main(String[] args) {

        Truck truck=new Truck();
        truck.vPrice=35000;
        truck.weight=5000;
        truck.getSalePrice();

        Sedan sedan=new Sedan();
        sedan.length=59;
        sedan.vPrice=33000;
        sedan.getSalePrice();
    }
}
