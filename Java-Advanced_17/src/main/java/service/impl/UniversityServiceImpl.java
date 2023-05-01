package service.impl;

import dao.UniversityDao;
import domain.University;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import service.UniversityService;

import java.util.List;

@Service
@Transactional
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private UniversityDao universityRepository;


    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }


    @SuppressWarnings("deprecation")
    @Override
    public University findById(Integer id) {
        return universityRepository.getOne(id);
    }

    @Override
    public University update(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(Integer id) {
        universityRepository.deleteById(id);
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public List<University> findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public List<University> findByAmountStudents(Integer count) {
        return universityRepository.findByAmountStudents(count);
    }

    @Override
    public List<University> findByAddressUniversity(String adress) {
        return universityRepository.findByAddressUniversity(adress);
    }
}
