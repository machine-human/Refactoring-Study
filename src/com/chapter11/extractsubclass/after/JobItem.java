package com.chapter11.extractsubclass.after;

//하위클래스 추출
public class JobItem {
    private int unitPrice;
    private int quantity;
    protected Employee employee;

    //하위클래스가 기존 생성자를 사용하기 때문에
    //public -> protected로 변경
    protected JobItem(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }
    protected boolean isLabor() {
        return false;
    }
}

//그닝과 데이터 중 일부가 LaborItem 클래스에만 사용되기 때문에 LaborItem 클래스 추가
class LaborItem extends JobItem{

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        super.employee = employee;
    }
    public int getEmployee() {
        return employee.getRate();
    }
    protected boolean isLabor() {
        return true;
    }
}
