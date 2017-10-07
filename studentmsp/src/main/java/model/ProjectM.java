package model;

import javax.persistence.*;

@Entity
public class ProjectM {
    @Column(name = "project_id")
     private int id;
     private String title;

    public ProjectM(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
