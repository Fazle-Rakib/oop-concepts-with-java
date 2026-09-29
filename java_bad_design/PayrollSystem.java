package java_bad_design;

// ============================================================
//  PayrollSystem.java  --  A working payroll calculator.
//
//  This file intentionally does NOT use OOP principles.
//  Everything lives in one class with public static data.
//  Read it, run it, and then try the tasks in EXERCISE.md.
// ============================================================

public class PayrollSystem {

    // ----------------------------------------------------------
    // All employee data is stored in parallel arrays.
    // Index 0 in every array belongs to the same employee.
    // NOTE: if you need a new type, update addEmployee() AND
    //       every method below that checks employeeTypes[].
    // ----------------------------------------------------------
    public static String[] employeeNames    = new String[10];
    public static String[] employeeTypes    = new String[10]; // "FULLTIME" or "PARTTIME"
    public static double[] rateOrSalary     = new double[10]; // annual salary OR hourly rate
    public static int[]    workUnits        = new int[10];    // 0 for FULLTIME, hours/month for PARTTIME
    public static int      employeeCount    = 0;

    // ----------------------------------------------------------
    // Adds one employee record to the parallel arrays.
    // Supported types: "FULLTIME", "PARTTIME"
    // ----------------------------------------------------------
    public static void addEmployee(String name, String type,
                                   double rate, int units) {
        employeeNames[employeeCount] = name;
        employeeTypes[employeeCount] = type;
        rateOrSalary[employeeCount]  = rate;
        workUnits[employeeCount]     = units;
        employeeCount++;
    }

    // ----------------------------------------------------------
    // Returns the gross monthly salary for employee at index i.
    // ----------------------------------------------------------
    public static double calculateMonthlySalary(int i) {
        if (employeeTypes[i].equals("FULLTIME")) {
            return rateOrSalary[i] / 12.0;       // annual ÷ 12
        } else if (employeeTypes[i].equals("PARTTIME")) {
            return rateOrSalary[i] * workUnits[i]; // hourly × hours
        }
        return 0;
    }

    // ----------------------------------------------------------
    // Returns the monthly tax deduction for employee at index i.
    // ----------------------------------------------------------
    public static double calculateTax(int i) {
        double salary = calculateMonthlySalary(i);
        if (employeeTypes[i].equals("FULLTIME")) {
            if (salary > 4000) {
                return salary * 0.20; // 20% bracket
            } else {
                return salary * 0.10; // 10% bracket
            }
        } else if (employeeTypes[i].equals("PARTTIME")) {
            return salary * 0.05;    // flat 5%
        }
        return 0;
    }

    // ----------------------------------------------------------
    // Returns the monthly performance bonus for employee at index i.
    // ----------------------------------------------------------
    public static double calculateBonus(int i) {
        double salary = calculateMonthlySalary(i);
        if (employeeTypes[i].equals("FULLTIME")) {
            return salary * 0.10;  // 10% bonus
        } else if (employeeTypes[i].equals("PARTTIME")) {
            return salary * 0.05;  // 5% bonus
        }
        return 0;
    }

    // ----------------------------------------------------------
    // Returns net pay: salary - tax + bonus.
    // ----------------------------------------------------------
    public static double calculateNetPay(int i) {
        return calculateMonthlySalary(i)
             - calculateTax(i)
             + calculateBonus(i);
    }

    // ----------------------------------------------------------
    // Prints the full payroll report for all employees.
    // ----------------------------------------------------------
    public static void printReport() {
        System.out.println("========================================");
        System.out.println("          MONTHLY PAYROLL REPORT        ");
        System.out.println("========================================");

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Name   : " + employeeNames[i]);
            System.out.println("Type   : " + employeeTypes[i]);
            System.out.printf( "Salary : %.2f%n", calculateMonthlySalary(i));
            System.out.printf( "Tax    : %.2f%n", calculateTax(i));
            System.out.printf( "Bonus  : %.2f%n", calculateBonus(i));
            System.out.printf( "Net Pay: %.2f%n", calculateNetPay(i));
            System.out.println("----------------------------------------");
        }

        double totalCost = 0;
        for (int i = 0; i < employeeCount; i++) {
            totalCost += calculateNetPay(i);
        }
        System.out.printf("Total Monthly Payroll Cost: %.2f%n", totalCost);
        System.out.println("========================================");
    }

    // ----------------------------------------------------------
    // Entry point.
    // ----------------------------------------------------------
    public static void main(String[] args) {
        // Annual salary for FULLTIME (units = 0, unused)
        addEmployee("Alice Johnson",  "FULLTIME",  72000, 0);
        addEmployee("Carol White",    "FULLTIME",  54000, 0);

        // Hourly rate × hours worked for PARTTIME
        addEmployee("Bob Smith",      "PARTTIME",  25.0,  80);
        addEmployee("David Lee",      "PARTTIME",  18.0,  60);

        printReport();
    }
}
