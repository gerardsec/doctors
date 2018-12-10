package com.ggs.doctors.model.entity;

import java.util.List;

public class DoctorList {
  private List<Doctor> doctors;

  public void doctorInfo(List<Doctor> doctors) {
    this.setDoctors(doctors);
  }

  public List<Doctor> getDoctors() {
    return doctors;
  }

  public void setDoctors(List<Doctor> doctors) {
    this.doctors = doctors;
  }

}
