package com.task.entity;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;



@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollNumber;

    private String name;


    private Date dob;


    private String gender;


    private Long familyIncome;

    private String fatherName;


    private String motherName;


    private String contactNumber;


    private String address;


    private Date admissionDate;


    private String nationality;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;

    @OneToMany(targetEntity = Languages.class,cascade = CascadeType.ALL)
    private List<Languages> languages;

    private String parentHighestQualification;
    private String pastSchool;
    private String pastEducationBoard;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", familyIncome=" + familyIncome +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", admissionDate=" + admissionDate +
                ", nationality='" + nationality + '\'' +
                ", house=" + house +
                ", languages=" + languages +
                ", parentHighestQualification='" + parentHighestQualification + '\'' +
                ", pastSchool='" + pastSchool + '\'' +
                ", pastEducationBoard='" + pastEducationBoard + '\'' +
                '}';
    }

    public Long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(Long familyIncome) {
        this.familyIncome = familyIncome;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public String getParentHighestQualification() {
        return parentHighestQualification;
    }

    public void setParentHighestQualification(String parentHighestQualification) {
        this.parentHighestQualification = parentHighestQualification;
    }

    public String getPastSchool() {
        return pastSchool;
    }

    public void setPastSchool(String pastSchool) {
        this.pastSchool = pastSchool;
    }

    public String getPastEducationBoard() {
        return pastEducationBoard;
    }

    public void setPastEducationBoard(String pastEducationBoard) {
        this.pastEducationBoard = pastEducationBoard;
    }

    public Student(Long rollNumber, String name, Date dob, String gender, Long familyIncome, String fatherName, String motherName, String contactNumber, String address, Date admissionDate, String nationality, House house, List<Languages> languages, String parentHighestQualification, String pastSchool, String pastEducationBoard) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.familyIncome = familyIncome;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.admissionDate = admissionDate;
        this.nationality = nationality;
        this.house = house;
        this.languages = languages;
        this.parentHighestQualification = parentHighestQualification;
        this.pastSchool = pastSchool;
        this.pastEducationBoard = pastEducationBoard;
    }

    public Student() {
    }

}
