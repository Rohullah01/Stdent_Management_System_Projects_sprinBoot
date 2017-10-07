package model;

import javax.persistence.*;

@Entity
public class StudentM {
    @Column(name = "student_id")
    private int id;
    private String fullName,gender,cource;

    public StudentM(int id, String fullName, String gender, String cource) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.cource = cource;
    }

    public StudentM(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }
}
