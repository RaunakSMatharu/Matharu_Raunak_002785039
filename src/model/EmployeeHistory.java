/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Raunak Singh Matharu
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;

    public EmployeeHistory() {
        this.history = new ArrayList<Employee>();
    }
  
    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public Employee addnewDetails(){
    Employee newDetails = new Employee();
    history.add(newDetails);
    return newDetails;
    }  
    // Adding a comment 
    public void deleteEmployee(Employee vs){
        history.remove(vs);
    }
}
