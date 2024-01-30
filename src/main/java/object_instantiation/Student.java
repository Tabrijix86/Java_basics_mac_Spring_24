/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_instantiation;

/**
 *
 * @author tabri
 */
public class Student {
    private int id;
    private String name;
    private String universityName;

    public Student(int id, String name, String universityName) {
        this.id = id;
        this.name = name;
        this.universityName = universityName;
    }
    
    public void submitAssignment() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", universityName=" + universityName + '}';
    }
    
    
}
