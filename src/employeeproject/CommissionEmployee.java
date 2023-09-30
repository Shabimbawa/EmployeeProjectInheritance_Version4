/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

/**
 *
 * @author User
 */
public class CommissionEmployee extends EmployeeMain {

    private double totalSales; 

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate) {
        super(empID, firstName, middleName, lastName, empDateHired, empBirthDate);

    }

    public CommissionEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, firstName, middleName, lastName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }



    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales >= 0 ? totalSales : 0;
    }
    
    public double computeSalary(){
        
        double salary = 0; 
        
        if(this.totalSales < 50000){
            salary = this.totalSales * 0.05; 
        }else if(this.totalSales >= 50000 && this.totalSales < 100000){
            salary = this.totalSales * 0.2; 
        }else if(this.totalSales >= 100000 && this.totalSales < 500000){
            salary = this.totalSales * 0.3;
        }else if(this.totalSales >= 500000){
            salary = this.totalSales * 0.5; 
        }
        
        return salary; 
        
    }
    
    public void displayInfo(){
        
        String display = this.toString(); 
        System.out.println(display);
        
    }

@Override
public String toString() {
    double salary = this.computeSalary(); 
    return "empID = " + getEmpID() + ", First Name = " + super.getFirstName()+ ", Middle Name = " + super.getMiddleName()+ ", Last Name = " + super.getLastName()+  ", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() +", totalSales = " + totalSales + ", salary = " + salary ;
}
    
}
