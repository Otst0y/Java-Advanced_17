package service;

import domain.University;

import java.util.List;

public interface UniversityService {

    University save(University university);
    University findById(Integer id);
    University update(University university);
    void deleteById(Integer id);
    List<University> findAll();
    List<University> findByName(String name);
    List<University> findByAmountStudents(Integer count);
    List<University> findByAddressUniversity(String adress);
}
