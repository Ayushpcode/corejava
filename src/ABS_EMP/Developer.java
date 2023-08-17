package ABS_EMP;

 class Developer extends Employee{
     private double hourlyRate;
     private double hoursWorked;

     public Developer(String name, int employeeId, double hourlyRate, double hoursWorked) {
         super(name, employeeId);
         this.hourlyRate = hourlyRate;
         this.hoursWorked = hoursWorked;
     }

     @Override
     double calculateSalary() {
         return hourlyRate * hoursWorked;
     }
 }
