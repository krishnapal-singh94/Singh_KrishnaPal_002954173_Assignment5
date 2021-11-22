package Business;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        //Create a network
        EcoSystem system = EcoSystem.getInstance();
        //create an enterprise
        //initialize some organizations
        
        //have some employees 
        EmployeeDirectory empDir = system.getEmployeeDirectory();
        
        Employee sysAdmin = empDir.createEmployee("sysAdmin");
        Employee customer = empDir.createEmployee("customer");
        Employee deliveryMan = empDir.createEmployee("deliveryMan");
        
        //create user account
        UserAccountDirectory accountDir = system.getUserAccountDirectory();
        
        accountDir.createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());
        accountDir.createUserAccount("customerA", "customerA", customer, new CustomerRole());
        accountDir.createUserAccount("deliveryA", "deliveryB", deliveryMan, new DeliverManRole());
       
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
