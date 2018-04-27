package com.example.focus.e_democracy;

public class Project {
    private int employeeName;
    private String employeeEmail;
    private String employeePhone;
    private int projectImage;

    public Project(int employeeName, String employeeEmail, String employeePhone, int projectImage) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.projectImage = projectImage;
    }

    /*Getters and setters to access the private members*/
    public int getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(int employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public int getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(int projectImage) {
        this.projectImage = projectImage;
    }

}