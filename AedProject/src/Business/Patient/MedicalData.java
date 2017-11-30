/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author JAGTAP
 */
public class MedicalData {
    
    private ArrayList<PatientDisease> listOfDisease;
    private ArrayList<VitalSigns> listOfVitalSigns;
    
    public MedicalData()
    {
        listOfDisease=new ArrayList<>();
        listOfVitalSigns=new ArrayList<>();
    }

    public ArrayList<PatientDisease> getListOfDisease() {
        return listOfDisease;
    }

    public void setListOfDisease(ArrayList<PatientDisease> listOfDisease) {
        this.listOfDisease = listOfDisease;
    }

    public ArrayList<VitalSigns> getListOfVitalSigns() {
        return listOfVitalSigns;
    }

    public void setListOfVitalSigns(ArrayList<VitalSigns> listOfVitalSigns) {
        this.listOfVitalSigns = listOfVitalSigns;
    }
    
    
}
