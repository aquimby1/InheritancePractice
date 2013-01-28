/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

import myconcrete.*;

/**
 *
 * @author AJ
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus;

    public SalaryPlusBonusEmployee(double bonus, double salarie, String name, int age, String job, String department) {
        super(salarie, name, age, job, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}
