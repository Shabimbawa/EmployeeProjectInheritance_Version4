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
public class EmployeeProject {
    public static void main(String[] args) {
       //The salary for all Employee classes is found in the display method
       //The computeSalary method is called in their display methods
       
       Date emp1Bday = new Date(27, 02, 2003);
       Date emp1HireDate = new Date(15, 12, 2022); 
       HourlyEmployee emp1 = new HourlyEmployee(123, "Jamal", "Jones", "Jabar", emp1HireDate, emp1Bday, 40, 1000);
       
       
       Date emp2Bday = new Date(29, 03, 1999); 
       Date emp2HireDate = new Date(16, 04, 2021);
       PieceWorkerEmployee emp2 = new PieceWorkerEmployee(999, "Pat", "Jamal", "Ezekiel", emp2HireDate, emp2Bday, 200, 50);
       
       
       Date emp3Bday = new Date(218, 02, 1995); 
       Date emp3HireDate = new Date(20, 07, 2016);
       CommissionEmployee emp3 = new CommissionEmployee(696, "Sean", "Black", "Mike", emp3HireDate, emp3Bday, 175000); 
       
       
       Date emp4Bday = new Date(18, 06, 2000); 
       Date emp4HireDate = new Date(20, 12, 2018);
       BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(420, "BettleJuice", "John", "Johnson", emp4HireDate, emp4Bday, 250000, 50000); 
       
       EmployeeRoster roster = new EmployeeRoster();
       roster.setMax(10);
       int max=10;
       EmployeeMain[] employees = new EmployeeMain[max];
       roster.setEmpList(employees);
       
       
       roster.addEmployees(emp1);
       roster.addEmployees(emp2);
       roster.addEmployees(emp3);
       roster.addEmployees(emp4);
       
       
//       roster.displayHE();
//       roster.displayBPCE();
//       roster.displayPWE();
//       roster.displayCE();
       
       roster.displayAllEmployee();
       
       roster.removeEmployee(123);
       
       roster.displayAllEmployee();
       
    }
    
}
