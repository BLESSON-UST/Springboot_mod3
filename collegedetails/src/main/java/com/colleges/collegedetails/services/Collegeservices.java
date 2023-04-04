package com.colleges.collegedetails.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colleges.collegedetails.model.College;
import com.colleges.collegedetails.repository.Collegerepo;

@Service
public class Collegeservices {
	@Autowired
	private Collegerepo repo;
	
	public College createdata(College clg) {
		
		return repo.save(clg);
	}

	public List<College> getdetails() {
	
		return repo.findAll();
	}

	public College getglgbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public College updatedetails(College clg) {
		// TODO Auto-generated method stub
		College o_clg=null;
		Optional<College> opclg=repo.findById(clg.getId());
		if(opclg.isPresent())
		{
			o_clg=opclg.get();
			o_clg.setName(clg.getName());
			o_clg.setType(clg.getType());
			o_clg.setLocation(clg.getLocation());
			repo.save(o_clg);
		}
		else
		{
			return new College();
		}
		return o_clg;
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	
	

}
