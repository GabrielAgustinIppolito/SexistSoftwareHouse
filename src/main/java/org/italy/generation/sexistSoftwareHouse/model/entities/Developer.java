package org.italy.generation.sexistSoftwareHouse.model.entities;

import org.italy.generation.sexistSoftwareHouse.model.Sex;

import java.time.LocalDate;
import java.util.ArrayList;

public class Developer {
   private long id;
   private String name, surname, grade;
   private Sex sex;
   private LocalDate yearOfRecruitment;
   private double salary;
   private ArrayList<Competence> competences;

   public Developer(){}

   public Developer(String name, String surname, String grade, Sex sex, LocalDate yearOfRecruitment,
                    double salary) {
      this.name = name;
      this.surname = surname;
      this.grade = grade;
      this.sex = sex;
      this.yearOfRecruitment = yearOfRecruitment;
      this.salary = salary;
   }

   public Developer(String name, String surname, String grade, Sex sex, LocalDate yearOfRecruitment,
                    double salary, ArrayList<Competence> competences) {
      this.name = name;
      this.surname = surname;
      this.grade = grade;
      this.sex = sex;
      this.yearOfRecruitment = yearOfRecruitment;
      this.salary = salary;
      this.competences = competences;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public Sex getSex() {
      return sex;
   }

   public LocalDate getYearOfRecruitment() {
      return yearOfRecruitment;
   }

   public double getSalary() {
      return salary;
   }

   public ArrayList<Competence> getCompetences() {
      return competences;
   }

   public void setId(long id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   public void setSex(Sex sex) {
      this.sex = sex;
   }

   public void setYearOfRecruitment(LocalDate yearOfRecruitment) {
      this.yearOfRecruitment = yearOfRecruitment;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public void setCompetences(ArrayList<Competence> competences) {
      this.competences = competences;
   }
}
