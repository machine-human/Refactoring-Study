package com.chapter11.extractsubclass.before;

//하위클래스 추출
public class JobItem {
    private int unitPrice;
    private int quantity;
    private Employee employee;
    private boolean isLabor;

    public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
        this.employee = employee;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public int getUnitPrice() {
        return (isLabor) ? employee.getRate() : unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }
}
