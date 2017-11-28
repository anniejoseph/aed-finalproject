/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author JAGTAP
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String Address;
    private String phNum;
    private Person poc;
    
    public Person()
    {
        poc = new  Person();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public Person getPoc() {
        return poc;
    }

    public void setPoc(Person poc) {
        this.poc = poc;
    }
    
}
