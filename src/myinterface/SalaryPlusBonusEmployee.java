/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author AJ
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus;

    public SalaryPlusBonusEmployee(double bonus, String name, int age, String job, String department, double salarie) {
        super(name, age, job, department, salarie);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}
