package com.chapter09.introduceassertion.after;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getTypeCode(Employee emp);

    int payAmount(Employee emp) {
        switch (getTypeCode(emp)) {
            case EmployeeType.ENGINEER:
                throw new RuntimeException("재정의해야 함");
            case EmployeeType.SALESMAN:
                throw new RuntimeException("재정의해야 함");
            case EmployeeType.MANAGER:
                throw new RuntimeException("재정의해야 함");
            default:
                throw new RuntimeException("없는 사원입니다.");
        }
    }
}


class Engineer extends EmployeeType {
    @Override
    int getTypeCode(Employee emp) {
        return EmployeeType.ENGINEER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}

class Salesman extends EmployeeType {
    @Override
    int getTypeCode(Employee emp) {
        return EmployeeType.SALESMAN;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.monthlySalary + emp.getCommission();
    }
}

class Manager extends EmployeeType {
    @Override
    int getTypeCode(Employee emp) {
        return EmployeeType.MANAGER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.monthlySalary + emp.getBonus();
    }
}