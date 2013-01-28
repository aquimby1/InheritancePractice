/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author AJ
 */
public class SalariedEmployee extends Employee {
    private double salarie;

    public SalariedEmployee(double salarie, String name, int age, String job, String department) {
        super(name, age, job, department);
        this.salarie = salarie;
    }


    public double getSalarie() {
        return salarie;
    }


    public void setSalarie(double salarie) {
        this.salarie = salarie;
    }
    
    
}
