/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author JAGTAP
 */
public abstract class Role {
    
     public enum RoleType{
        
        
        SystemAdmin("SystemAdmin"),
        HospitalAdmin("HospitalAdmin"),
        HospitalInventoryManager("HospitalInventoryManager"),
        BloodBankAdmin("BloodBankAdmin"),
        BloodBankInventoryManager("BloodBankInventoryManager"),
        Doctor("Doctor"),
        OrganDonationAdmin("OrganDonationAdmin"),
        OrganDonationInventoryManager("OrganDonationInventoryManager"),
        LabAdmin("LabAdmin"),
<<<<<<< HEAD
        LabAssistant("LabAssistant"),
        InsuranceAdmin("InsuranceAdmin"),
        InsuranceInventoryManager("InsuranceInventoryManager");
=======
        LabAssistant("LabAssistant");
>>>>>>> 0f5e4d868fad4b746360859abccdaf206fea2eb3
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
