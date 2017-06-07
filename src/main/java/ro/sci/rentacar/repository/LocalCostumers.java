package ro.sci.rentacar.repository;

/**
 * Created by Roxana on 5/24/2017.
 */
public class LocalCostumers implements Client {
    String name;
    String address;
    String phoneNumber;

    public void rentCar(){
        System.out.println("Client rents a domain");
    }

    public void returnCar(){
        System.out.println("Client returns the domain");

    }
}
