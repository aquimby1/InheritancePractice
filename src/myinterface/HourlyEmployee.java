/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author AJ
 */
public class HourlyEmployee implements Employee {
    private String name;
    private int age;
    private String job;
    private String department;
    private double hourlyPay;

    public HourlyEmployee(String name, int age, String job, String department, double hourlyPay) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.department = department;
        this.hourlyPay = hourlyPay;
    }
    
    public double getHourlyPay() {
        return hourlyPay;
    }


    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    
    
    
}
