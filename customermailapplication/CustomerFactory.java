/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author umyong
 */
public class CustomerFactory {
    private static Customer customer;
    public static Customer getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain" :
                customer = new MountainCustomer();
                break;
            case "Delinquent" :
                customer = new DelinquentCustomer();
                break;
        }
        return customer;
    }
}


