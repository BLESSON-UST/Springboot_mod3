package com.UST.collegeAssignment.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.collegeAssignment.Model.Department;
import com.UST.collegeAssignment.Model.Faculty;
import com.UST.collegeAssignment.Repository.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
       return departmentRepository.findByCollegeName(collegeName);
//        return departments.stream().map(Department::new).collect(Collectors.toList());
    }

    public Department saveDepartment(Department departmentDTO) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        return new Department();
    }

//    public void deleteDepartmentById(Long departmentId) {
//        departmentRepository.deleteById(departmentId);
//    }

	public Department getDepartmentByIdAndCollegeName(Long departmentId, String collegeName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Department getDepartmentByNameAndCollegeName(String name, String collegeName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Faculty getHodByDepartmentNameAndCollegeName(String name, String collegeName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Faculty addFacultyToDepartment(Long departmentId, Faculty facultyDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public Faculty addHodToDepartment(Long departmentId, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
