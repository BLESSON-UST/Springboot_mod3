package com.UST.EmployeePracticeException.service;

//import com.UST.EmployeePracticeCrud.entity.EmployeeEntity;
//import com.UST.EmployeePracticeCrud.repository.EmployeeRepo;
import com.UST.EmployeePracticeException.entity.EmployeeEntity;
import com.UST.EmployeePracticeException.exception.IdNotFoundException;
import com.UST.EmployeePracticeException.exception.NameFoundException;
import com.UST.EmployeePracticeException.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    public EmployeeEntity postStud(EmployeeEntity empent) {
        Optional<EmployeeEntity> emp = repo.findByName(empent.getName());
        if(emp.isPresent()){
            throw new NameFoundException("Name already present");
        }
        else{
            return repo.save(empent);
        }
    }

    public List<EmployeeEntity> getAll() {
        return repo.findAll();
    }

    public EmployeeEntity getById(Long id) {
        Optional<EmployeeEntity> emp1 = repo.findById(id);
        if(emp1.isEmpty()){
            throw new IdNotFoundException("id not found");
        }
        else{
            return repo.findById(id).orElse(null);
        }
    }

    public EmployeeEntity updateById(EmployeeEntity empent) {
        // TODO Auto-generated method stub
        EmployeeEntity oldemp = null;
        Optional<EmployeeEntity> optionalemployee = repo.findById(empent.getId());
        if (optionalemployee.isPresent()) {
            oldemp = optionalemployee.get();
            oldemp.setName(empent.getName());
            //oldemp.setAddress(employee.getAddress());
            //oldemp.setLocation(employee.getLocation());
            repo.save(oldemp);
        } else {
            return new EmployeeEntity();
        }
        return oldemp;
    }

    public String deleteById(Long id) {
        repo.deleteById(id);
        return "deleted..";
    }
}

