package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Sklad {
    private int idsklad;
    private String description;

    public Sklad(int idsklad, String description) {
        this.idsklad = idsklad;
        this.description = description;
    }
    public Sklad() { }

    @Id
    @Column(name = "idsklad", nullable = false)
    public int getIdsklad() {
        return idsklad;
    }

    public void setIdsklad(int idsklad) {
        this.idsklad = idsklad;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sklad sklad = (Sklad) o;
        return idsklad == sklad.idsklad &&
                Objects.equals(description, sklad.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsklad, description);
    }
}
