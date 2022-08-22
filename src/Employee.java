public class Employee {
    String EmployeeName;
    int EmployeeCode;
    int EmployeeAge;
    String dob;
    String Address;
    double salary;
    Employee(String EmployeeName,int employeecode,int employeeCode,String dob,String Address,double salary){
        this.EmployeeName=EmployeeName;
        this.EmployeeCode=employeecode;
        this.EmployeeAge=EmployeeAge;
        this.dob=dob;
        this.Address=Address;
        this.salary=salary;

    }
    public double annualSalary(){
        return salary*12;
    }
    public double payRise(double hikePercentnge){

        return salary=salary+((salary*20)/100);
    }


}
