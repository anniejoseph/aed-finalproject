/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

<<<<<<< HEAD
import Business.Insurance.InsuranceInventoryManager;
import Business.Role.Role;
import java.util.ArrayList;
=======
import Business.Role.Role;
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
import java.util.HashSet;

/**
 *
 * @author JAGTAP
 */
public class InsuranceManagerOrganization extends Organization{
<<<<<<< HEAD
    
    private ArrayList<InsuranceInventoryManager> listOfInsuranceInventoryManager;

    public ArrayList<InsuranceInventoryManager> getListOfInsuranceInventoryManager() {
        return listOfInsuranceInventoryManager;
    }

    public void setListOfInsuranceInventoryManager(ArrayList<InsuranceInventoryManager> listOfInsuranceInventoryManager) {
        this.listOfInsuranceInventoryManager = listOfInsuranceInventoryManager;
    }

    
=======

>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
    public InsuranceManagerOrganization()
    {
        super(Type.InsuranceManager.getValue());
    }
    @Override
    public HashSet<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
<<<<<<< HEAD
    @Override
    public String toString()
    {
        return super.getName();
    }
=======
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
}
