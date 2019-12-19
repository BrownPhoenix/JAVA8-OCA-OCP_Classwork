package prac1.business;

import prac1.domain.Director;
import prac1.domain.Employee;
import prac1.domain.Manager;

public class EmployeeStockPlan {

    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public EmployeeStockPlan() {
    }

    public int grantStock(Employee emp) {
        // Stock is granted based on the employee type
        if (emp instanceof Director) {
            return directorShares;
        } else {
            if (emp instanceof Manager) {
                return managerShares;
            } else {
                return employeeShares;
            }
        }
    }
}