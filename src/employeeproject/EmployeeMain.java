/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

/**
 *
 * @author User
 */
public class EmployeeMain extends Name{
    private int empID;
    private Date empDateHired; 
    private Date empBirthDate;

    public EmployeeMain(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate)  {
        super(firstName, middleName, lastName);
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public EmployeeMain() {
        
    }

    


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }
    
    
    
}
