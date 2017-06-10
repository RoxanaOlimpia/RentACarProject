package ro.sci.rentacar.domain.costumer;

import ro.sci.rentacar.domain.costumer.Client;

/**
 * Created by Roxana on 5/24/2017.
 */
public class Foreigners implements Client {
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
