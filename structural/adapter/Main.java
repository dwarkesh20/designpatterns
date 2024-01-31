package designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // class adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        System.out.println("***********class adapter***********");
        System.out.println(adapter.getName());
        System.out.println(adapter.getAddress());

        // object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        Customer objectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println("***********object adapter***********");
        System.out.println(objectAdapter.getName());
        System.out.println(objectAdapter.getAddress());

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elon Musk");
        employee.setJobTitle("CEO");
        employee.setOfficeLocation("Sydney");
    }

}
