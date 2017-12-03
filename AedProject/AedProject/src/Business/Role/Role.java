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
<<<<<<< HEAD:AedProject/AedProject/src/Business/Role/Role.java
        OrganDonationAdmin("OrganDonationAdmin"),
        OrganDonationInventoryManager("OrganDonationInventoryManager"),
=======
>>>>>>> fb0d14a7ab4cd0a07cfe1fd312055ae282be2f60:AedProject/src/Business/Role/Role.java
        LabAdmin("LabAdmin"),
        LabAssistant("LabAssistant");
        
        
        
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
