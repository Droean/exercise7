package com.mcfadden.exercise7;
//Ean McFadden
//Exercise 6
//February 27, 2018
import java.util.*;
class Contact{
    private String name;
    private String email;
    public Contact(){
    }
    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void display(){
        System.out.println("The name of this contact is " + name + " and their e-mail address is " + email + ".");
    }
}
class BusinessContact extends Contact{
    private String phoneNumber;
    public BusinessContact(String name, String email, String phoneNumber){
        super(name, email);
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void display(){
        System.out.println("The name of this business contact is " + getName() + ", their e-mail address is " + getEmail() + ", and their phone number is " + phoneNumber + ".");
    }

}
public class Main {

    public static void main(String[] args) {
        Contact num1 = new Contact("Johnathan Crane", "sp00kman@gmail.com");
        Contact num2 = new Contact("Meowiarty", "nap0legu1n0fcr1m3@gmail.com");
        num1.display();
        num2.display();
        BusinessContact num3 = new BusinessContact("Krokhotep", "kr0k0sph1nx@gmail.com", "(614)-345-4321");
        num3.display();
        BusinessContact num4 = new BusinessContact("Edward Nygma", "puzzl3r@gmail.com", "(321)-567-9012");
        num4.display();
    }
}
