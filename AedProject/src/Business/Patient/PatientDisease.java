/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JAGTAP
 */
public class PatientDisease {
    
    private String name;
    private Date detectedDate;
    private ArrayList<Treatment> listOfTreatment;
    private boolean cured;
    private boolean death;
    
    public PatientDisease()
    {
        listOfTreatment=new ArrayList<>();
        cured=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDetectedDate() {
        return detectedDate;
    }

    public void setDetectedDate(Date detectedDate) {
        this.detectedDate = detectedDate;
    }

    public ArrayList<Treatment> getListOfTreatment() {
        return listOfTreatment;
    }

    public void setListOfTreatment(ArrayList<Treatment> listOfTreatment) {
        this.listOfTreatment = listOfTreatment;
    }

    public boolean isCured() {
        return cured;
    }

    public void setCured(boolean cured) {
        this.cured = cured;
    }

    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
    
    
    
}
