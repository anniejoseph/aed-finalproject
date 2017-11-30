/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Date;

/**
 *
 * @author JAGTAP
 */
public class Person {
    
    private String name;
    private String Address;
    private String phNum;
    private String gender;
    private String dob;
    //private Person poc;
    
   /* public Person()
    {
        poc = new  Person();
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    /*
    public Person getPoc() {
        return poc;
    }

    public void setPoc(Person poc) {
        this.poc = poc;
    }*/

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    
}
