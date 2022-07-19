/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66887
 */
public class Person {
    
    //Instance variables
    private String name;
    private String address;
    
    //Constructor
    public Person (String name, String addess) {
    
        this.name = name;
        this.address = address;
        
    }
    
    public String getName() {
    
        return name;
    }
    
    public String getAddress() {
    
        return address;
    }
    
    //Metator Method - Access and Change info
    public void setAddress (String address) {
    
        this.address = address; 
    }
    
    public String toString() {
    
        return String.format("Person[name=%s, address=%s]", name, address);
    }
}
