/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raunak Singh Matharu
 */
public class Employee {
    private String Name;
    private int Employee_ID;
    private int age;
    private String Gender;
    private String StartDate;
    private String Level;
    private String TeamInfo;
    private String Position;
    private String Cell_No;
    private String Email_ID;


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(int Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getCell_No() {
        return Cell_No;
    }

    public void setCell_No(String Cell_No) {
        this.Cell_No = Cell_No;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String Email_ID) {
        this.Email_ID = Email_ID;
    }

   @Override
   public String toString(){
       return Name;
   }
}