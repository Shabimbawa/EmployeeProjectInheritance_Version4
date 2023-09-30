/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

/**
 *
 * @author rhenz
 */
public class EmployeeRoster {
    private EmployeeMain[] empList;
    private int count;
    private int max;

    public EmployeeRoster(EmployeeMain[] empList, int max) {
        this.empList = empList;
        this.count = 0;
        this.max = max;
    }

    public EmployeeRoster() {
    }
    
    public void addEmployees(EmployeeMain employee){
    if(count<max){
        this.empList[count]=employee;
        count++;
        System.out.println("Employee added to Roster");
    }
    else{
        System.out.println("Employee Roster full");
    }}

    
    public void removeEmployee(int id){
        int j, i;
        for(i=0;i<count; i++){
            if(this.empList[i].getEmpID()==id){
                count--;
                break;
            }
        }
        for(j=i;j<count; j++){
            empList[j]=empList[j+1];
            
        }
    }
    
    
    public void setEmpList(EmployeeMain[] empList) {
        this.empList = empList;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public EmployeeMain[] getEmpList() {
        return empList;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }
    
    
    public int countHE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof HourlyEmployee){
                j++;
            }
        }
        return j;
    }

    public int countPWE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                j++;
            }
        }
        return j;
    }
    public int countBPCE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof BasePlusCommissionEmployee){
                j++;
            }
        }
        return j;
    }
    
    public int countCE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof CommissionEmployee){
                j++;
            }
        }
        return j;
    }
    
    
    public void displayHE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("ID: %d\n", ((HourlyEmployee) empList[i]).getEmpID());
                System.out.printf("Name: %s %s %s\n", ((HourlyEmployee) empList[i]).getFirstName(),
                        ((HourlyEmployee) empList[i]).getMiddleName(), ((HourlyEmployee) empList[i]).getLastName());
                System.out.println("Type: Hourly Employee");
                System.out.printf("Salary: %.2f \n\n", ((HourlyEmployee) empList[i]).computeSalary());
            }
        }
    }
    public void displayPWE() {
        
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("ID: %d\n", ((PieceWorkerEmployee) empList[i]).getEmpID());
                System.out.printf("Name: %s %s %s \n", ((PieceWorkerEmployee) empList[i]).getFirstName(),
                        ((PieceWorkerEmployee) empList[i]).getMiddleName(), ((PieceWorkerEmployee) empList[i]).getLastName());
                System.out.println("Type: Piece Worker Employee ");
                System.out.printf("Salary: %.2f \n\n", ((PieceWorkerEmployee) empList[i]).computeSalary());
            }
        }
    }
    public void displayCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommissionEmployee) {
                System.out.printf("ID: %d \n", ((CommissionEmployee) empList[i]).getEmpID());
                System.out.printf("Name: %s %s %s \n", ((CommissionEmployee) empList[i]).getFirstName(),
                        ((CommissionEmployee) empList[i]).getMiddleName(), ((CommissionEmployee) empList[i]).getLastName());
                System.out.println("Type: Commission Employee");
                System.out.printf("Salary: %.2f \n\n", ((CommissionEmployee) empList[i]).computeSalary());
            }
        }
    }
    public void displayBPCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                System.out.printf("ID: %d \n", ((BasePlusCommissionEmployee) empList[i]).getEmpID());
                System.out.printf("Name: %s %s %s \n", ((BasePlusCommissionEmployee) empList[i]).getFirstName(),
                        ((BasePlusCommissionEmployee) empList[i]).getMiddleName(), ((BasePlusCommissionEmployee) empList[i]).getLastName());
                System.out.println("Type: Base Plus Commission Employee");
                System.out.printf("Salary: %.2f \n\n", ((BasePlusCommissionEmployee) empList[i]).computeSalary());
            }
        }
    }
    
    public void displayAllEmployee() {
        for (int i = 0; i < count; i++) {
                System.out.printf("Employee %d: \n", i+1);
                System.out.printf("ID: %d \n", (empList[i]).getEmpID());
                System.out.printf("Name: %s %s %s \n", (empList[i]).getFirstName(),
                    (empList[i]).getMiddleName(), (empList[i]).getLastName());
                
                if(empList[i] instanceof HourlyEmployee){
                    System.out.println("Type: Hourly Employee ");
                    System.out.printf("Salary: %.2f \n", ((HourlyEmployee) empList[i]).computeSalary());
                    System.out.println("\n\n");                    
                }
                if(empList[i] instanceof PieceWorkerEmployee){
                    System.out.println("Type: Piece Worker Employee ");
                    System.out.printf("Salary: %.2f \n", ((PieceWorkerEmployee) empList[i]).computeSalary());
                    System.out.println("\n\n");                    
                }
                 if(empList[i] instanceof CommissionEmployee){
                    System.out.println("Type: Commission Employee ");
                    System.out.printf("Salary: %.2f \n", ((CommissionEmployee) empList[i]).computeSalary());
                    System.out.println("\n\n");                    
                }
                if(empList[i] instanceof BasePlusCommissionEmployee){
                    System.out.println("Type: Base Plus Commission Employee ");
                    System.out.printf("Salary: %.2f \n", ((BasePlusCommissionEmployee) empList[i]).computeSalary());
                    System.out.println("\n\n");                    
                }                 
        }
    }    


}




