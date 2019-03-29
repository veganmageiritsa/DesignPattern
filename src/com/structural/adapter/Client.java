package com.structural.adapter;


public class Client {
    public static void main(String[] args) {

        // this is a class adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        BusinessCardDesigner designer = new BusinessCardDesigner();
        createEmployee(adapter);
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    private static void createEmployee(Employee employee) {
        employee.setFulleName("Lalalal");
        employee.setJobTitle("Tatatat");
        employee.setLocation("Pipipi");
    }


}
