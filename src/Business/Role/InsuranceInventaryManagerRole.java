/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganDonationInventoryManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OrganDonation.InventoryManager.OrganDonationInventoryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kruti
 */
public class InsuranceInventaryManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new OrganDonationInventoryManagerJPanel(userProcessContainer, account, (OrganDonationInventoryManagerOrganization)organization, enterprise, business);//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString()
    {
        return Role.RoleType.InsuranceInventoryManager.getValue();
    }
}
