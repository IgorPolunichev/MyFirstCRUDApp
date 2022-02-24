package web.Model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;

    @Column(name = "User_name")
    private String name;

    @Column(name = "User_Lastname")
    private String lastName;

    @Column(name = "User_Age")
    private Integer age;

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
