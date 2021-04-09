package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "zakaz", schema = "zakazi")
public class ZakazEntity {
    private static final long serialVersionUID = 1L;
    private int idzakaz;
    private String name;
    private String description;
    private String email;
    public ZakazEntity(){ }
    public ZakazEntity(String name, String description){

        this.name = name;
        this.description = description;
    }
    public ZakazEntity(int idzakaz, String name, String description, String email){

        this.idzakaz = idzakaz;
        this.name = name;
        this.description = description;
        this.email = email;
    }

    @Id
    @Column(name = "idzakaz", nullable = false)
    public int getIdzakaz() {
        return idzakaz;
    }

    public void setIdzakaz(int idzakaz) {
        this.idzakaz = idzakaz;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZakazEntity that = (ZakazEntity) o;
        return idzakaz == that.idzakaz &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idzakaz, name, description, email);
    }
}
