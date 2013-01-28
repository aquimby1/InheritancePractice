/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author AJ
 */
public class HourlyEmployee extends Employee {
    private double hourlyPay;

    public HourlyEmployee(double hourlyPay, String name, int age, String job, String department) {
        super(name, age, job, department);
        this.hourlyPay = hourlyPay;
    }
    
    public double getHourlyPay() {
        return hourlyPay;
    }


    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    
    
    
}
