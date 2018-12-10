package com.ggs.doctors.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor", schema = "public")
public class Doctor {
  private String id;
  private String firstName;
  private String lastName;
  private String specialityCode;

  private String location;

  @Id
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSpecialityCode() {
    return specialityCode;
  }

  public void setSpecialityCode(String specialityCode) {
    this.specialityCode = specialityCode;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
