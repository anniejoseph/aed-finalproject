/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Insurance.InsuranceInventoryManager;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author JAGTAP
 */
public class InsuranceManagerOrganization extends Organization{
    
    private ArrayList<InsuranceInventoryManager> listOfInsuranceInventoryManager;

    public ArrayList<InsuranceInventoryManager> getListOfInsuranceInventoryManager() {
        return listOfInsuranceInventoryManager;
    }

    public void setListOfInsuranceInventoryManager(ArrayList<InsuranceInventoryManager> listOfInsuranceInventoryManager) {
        this.listOfInsuranceInventoryManager = listOfInsuranceInventoryManager;
    }

    
    public InsuranceManagerOrganization()
    {
        super(Type.InsuranceManager.getValue());
    }
    @Override
    public HashSet<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString()
    {
        return super.getName();
    }
}
