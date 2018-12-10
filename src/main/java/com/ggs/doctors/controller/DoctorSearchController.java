package com.ggs.doctors.controller;


import com.ggs.doctors.model.entity.Doctor;
import com.ggs.doctors.model.entity.DoctorList;
import com.ggs.doctors.model.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorSearchController {
  @Autowired
  private DoctorService docService;

  @RequestMapping(value = "/doctors", method = RequestMethod.GET, produces = "application/json")
  public DoctorList searchDoctor(@RequestParam(value = "location", required = false)
                                         String location, @RequestParam(value = "speciality", required =
          false) String speciality) {
    System.out.println("Llamando a /doctors, location="+location+", speciality="+speciality);
    DoctorList docList = docService.buscaDE(location, speciality);
    for (Doctor doctor:docList.getDoctors()) {
      System.out.println("->"+doctor.toString());
    }
    Integer algo = docService.claveMaxima();
    return docList;
  }
}
