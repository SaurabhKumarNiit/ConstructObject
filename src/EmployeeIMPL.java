public class EmployeeIMPL {
    public static void main(String[] args){
        Employee daniel=new Employee("daniel",130,130,"11/04/1997","124,bridge water,eville",3000);
                double annualSalary= daniel.annualSalary();
        System.out.println("annual Salary "+annualSalary);
        System.out.println("Monthly salary Before 20% hike "+daniel.salary);
        daniel.payRise(20);
        System.out.println("Monthly salary After 20% hike "+daniel.salary);
    }
}
