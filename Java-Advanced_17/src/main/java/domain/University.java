package domain;

import jakarta.persistence.*;
@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer levelAccreditation;
    @Column
    private Integer numberInstitutes;
    @Column
    private Integer amountStudents;
    @Column
    private String addressUniversity;


    public University(Integer id, String name, Integer levelAccreditation, Integer numberInstitutes, Integer amountStudents, String addressUniversity) {
        this.id = id;
        this.name = name;
        this.levelAccreditation = levelAccreditation;
        this.numberInstitutes = numberInstitutes;
        this.amountStudents = amountStudents;
        this.addressUniversity = addressUniversity;
    }

    public University() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelAccreditation() {
        return levelAccreditation;
    }

    public void setLevelAccreditation(Integer levelAccreditation) {
        this.levelAccreditation = levelAccreditation;
    }

    public Integer getNumberInstitutes() {
        return numberInstitutes;
    }

    public void setNumberInstitutes(Integer numberInstitutes) {
        this.numberInstitutes = numberInstitutes;
    }

    public Integer getAmountStudents() {
        return amountStudents;
    }

    public void setAmountStudents(Integer amountStudents) {
        this.amountStudents = amountStudents;
    }

    public String getAddressUniversity() {
        return addressUniversity;
    }

    public void setAddressUniversity(String addressUniversity) {
        this.addressUniversity = addressUniversity;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", levelAccreditation=" + levelAccreditation +
                ", numberInstitutes=" + numberInstitutes +
                ", amountStudents=" + amountStudents +
                ", addressUniversity='" + addressUniversity + '\'' +
                '}';
    }
}

