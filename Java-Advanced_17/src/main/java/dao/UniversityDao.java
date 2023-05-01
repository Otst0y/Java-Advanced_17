package dao;

import domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UniversityDao extends JpaRepository<University, Integer>, CrudRepository<University, Integer> {

    List<University> findByName(String name);
    List<University> findByAmountStudents(Integer count);
    List<University> findByAddressUniversity(String adress);
   }
