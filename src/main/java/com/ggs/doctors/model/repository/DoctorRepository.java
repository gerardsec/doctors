package com.ggs.doctors.model.repository;

import com.ggs.doctors.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface DoctorRepository extends JpaRepository<Doctor, String> {

 // @Query("select j from Doctor j where j.location = ?1 and j.specialityCode=?2")
 // List<Doctor> findByLocationAndSpeciality(String location, String speciality);

//  @Query("select j from Doctor j where j.location = ?1 and j.specialityCode=?2")
//  List<Doctor> busca(String location, String speciality);
@Query("SELECT coalesce(max(ch.id), 0) FROM Doctor ch")
Integer maxClave();
  @Query("select j from Doctor j where j.location = ?1 and j.specialityCode=?2")
  List<Doctor> busca(String location, String speciality);
}
