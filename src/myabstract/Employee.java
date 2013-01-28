/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author AJ
 */
public abstract class Employee {
    private String name;
    private int age;
    private String job;
    private String department;

    public Employee(String name, int age, String job, String department) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getJob() {
        return job;
    }


    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }
}
