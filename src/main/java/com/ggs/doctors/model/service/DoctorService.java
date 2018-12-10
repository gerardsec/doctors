package com.ggs.doctors.model.service;

import com.ggs.doctors.model.entity.Doctor;
import com.ggs.doctors.model.entity.DoctorList;
import com.ggs.doctors.model.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
  @Autowired
  DoctorRepository doctorRepository;

//  public List<Doctor> findByLocationAndSpeciality(String location, String speciality) {
//    return doctorRepository.findByLocationAndSpeciality(location, speciality);
//  }
  public DoctorList buscaDE(String location, String speciality){
    List<Doctor> doctorList1 = doctorRepository.busca(location, speciality);
    for (Doctor doctor:doctorList1) {
      System.out.println("Service->"+doctor.toString());
    }
    DoctorList doctorList2 = new DoctorList();
    doctorList2.setDoctors(doctorList1);
    return doctorList2;
  }
  public Integer claveMaxima(){
    return doctorRepository.maxClave();
  }

}
