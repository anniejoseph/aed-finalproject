/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Person;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author JAGTAP
 */
public class Patient extends Person{
    
    private String ID;
    private ArrayList<Person> poc;
    private MedicalData medicalData;
    private boolean death;
    private ArrayList<MedicalTest> listOfMedicalTests;
<<<<<<< HEAD
    private ArrayList<InsuranceDirectory> listOfInsurance;
   // private UserAccount ua;

    public ArrayList<InsuranceDirectory> getListOfInsurance() {
        return listOfInsurance;
    }

    public void setListOfInsurance(ArrayList<InsuranceDirectory> listOfInsurance) {
        this.listOfInsurance = listOfInsurance;
    }
=======
   // private UserAccount ua;
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
    
    public Patient()
    {
        poc = new ArrayList<>();
        medicalData=new MedicalData();
        listOfMedicalTests=new ArrayList<>();
<<<<<<< HEAD
        listOfInsurance = new ArrayList<>();
=======
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
        death=false;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Person> getPoc() {
        return poc;
    }

    public void setPoc(ArrayList<Person> poc) {
        this.poc = poc;
    }

    public MedicalData getMedicalHistory() {
        return medicalData;
    }

    public void setMedicalHistory(MedicalData medicalData) {
        this.medicalData = medicalData;
    }

    public MedicalData getMedicalData() {
        return medicalData;
    }

    public void setMedicalData(MedicalData medicalData) {
        this.medicalData = medicalData;
    }

    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
    
    

   /* public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }*/

    public ArrayList<MedicalTest> getListOfMedicalTests() {
        return listOfMedicalTests;
    }

    public void setListOfMedicalTests(ArrayList<MedicalTest> listOfMedicalTests) {
        this.listOfMedicalTests = listOfMedicalTests;
    }
   
    public MedicalTest addMedicalTest()
    {
        MedicalTest mt=new MedicalTest();
        listOfMedicalTests.add(mt);
        return mt;
    }
<<<<<<< HEAD
    
    public InsuranceDirectory addInsurance()
    {
        InsuranceDirectory id = new InsuranceDirectory();
        listOfInsurance.add(id);
        return id;
    }
=======
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
}
