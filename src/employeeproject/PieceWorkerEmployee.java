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
public class PieceWorkerEmployee extends EmployeeMain{
    
 
    private int totalPiecesFinished; 
    private float ratePerPiece; 

    public PieceWorkerEmployee() {
        super();
    }

    public PieceWorkerEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, firstName, middleName, lastName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished >= 0 ? totalPiecesFinished: 0;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece >= 0 ? ratePerPiece: 0;
    }
    
    public double computeSalary(){
        
        float salary = this.totalPiecesFinished * this.ratePerPiece;
          
        if(this.totalPiecesFinished >= 100){
            //declaring here because these variables are only needed if there is a bonus
            float numOfBonus = this.totalPiecesFinished /100; 
            float bonusAmount = numOfBonus * this.ratePerPiece * 10;
                        
            salary += bonusAmount;
             
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
        return "empID = " + getEmpID() + ", First Name = " + this.getFirstName()+ ", Middle Name = " + this.getMiddleName()+", Last Name = " + this.getLastName() +", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() + ", totalPiecesFinished = " + totalPiecesFinished + ", ratePerPiece = " + ratePerPiece + ", salary = " + salary;

    }
    
    
    
    
    
    
}
