package com.UST.EmployeePracticeValidation.service;

import com.UST.EmployeePracticeValidation.dto.EntityRequest;
import com.UST.EmployeePracticeValidation.entity.EmployeeEntity;
import com.UST.EmployeePracticeValidation.exception.IdNotFoundException;
import com.UST.EmployeePracticeValidation.exception.NameFoundException;
import com.UST.EmployeePracticeValidation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    public EmployeeEntity postStud(@Valid EntityRequest request) {
        EmployeeEntity emp = new EmployeeEntity(0L,request.getName(),request.getAge(),request.getDesignation());
        Optional<EmployeeEntity> empp = repo.findByName(emp.getName());
        if(empp.isPresent()){
            throw new NameFoundException("name already present");
        }
        else{
            return repo.save(emp);
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


