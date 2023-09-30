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
public class HourlyEmployee extends EmployeeMain {
    

    private float totalHourWorked; 
    private float ratePerHour; 

    public HourlyEmployee() {
        super();
    }
    
    public HourlyEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        super(empID, firstName, middleName, lastName, empDateHired, empBirthDate);
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }




    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked >= 0 ? totalHourWorked: 0;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour >= 0 ? ratePerHour: 0;
    }
    
    
    public double computeSalary(){
        
        float excessHrs; 
        float excessSal; 
        float totalSalary; 
        float otRate = this.ratePerHour * 1.5f;
        
        if(this.totalHourWorked > 40){
           excessHrs = this.totalHourWorked - 40;
           excessSal = otRate * excessHrs;  
           totalSalary = (40 * this.ratePerHour) + excessSal; 
          
           return totalSalary;
           
        }else{
            
           totalSalary = this.totalHourWorked * this.ratePerHour; 
           return totalSalary;
           
        }
          
    }
    
    public void displayInfo(){ 
        String display = this.toString();
        System.out.println(display);
    }

@Override
public String toString() {
    double salary = this.computeSalary(); 
    return "empID = " + getEmpID() + ", First Name = " + super.getFirstName()+ ", Middle Name = " + super.getMiddleName()+ ", Last Name = " + super.getLastName()+ ", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() + ", totalHoursWorked = " + totalHourWorked + ", Rate Per Hour = " + ratePerHour + ", salary = " + salary;
}
    
    
    
    


    
    
    
    
    
    
    
}
