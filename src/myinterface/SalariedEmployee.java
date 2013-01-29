/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author AJ
 */
public class SalariedEmployee implements Employee {
    private String name;
    private int age;
    private String job;
    private String department;
    private double salarie;

    public SalariedEmployee(String name, int age, String job, String department, double salarie) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.department = department;
        this.salarie = salarie;
    }

    

    public double getSalarie() {
        return salarie;
    }


    public void setSalarie(double salarie) {
        this.salarie = salarie;
    }
    
    
}
