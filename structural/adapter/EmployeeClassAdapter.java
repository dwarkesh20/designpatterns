package designpatterns.structural.adapter;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }

}
