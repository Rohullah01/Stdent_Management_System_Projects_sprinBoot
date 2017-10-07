package model;

import javax.persistence.*;

@Entity
public class SupervisorM {

    @Column(name = "supervisor_id")
    private int id;
    private  String fullName,copartment,gender;

    public SupervisorM(int id, String fullName, String copartment, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.copartment = copartment;
        this.gender = gender;
    }
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

    public String getCopartment() {
        return copartment;
    }

    public void setCopartment(String copartment) {
        this.copartment = copartment;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
