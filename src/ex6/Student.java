/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

/**
 *
 * @author benjawan
 */
public class Student {
    private int id;
    private String name;
    private double GPA;
    public Student() {
    }
    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }
    public double getGPA () {
        return GPA ;
    }

    public void setGPA (double GPA) {
        this.GPA  = GPA ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
