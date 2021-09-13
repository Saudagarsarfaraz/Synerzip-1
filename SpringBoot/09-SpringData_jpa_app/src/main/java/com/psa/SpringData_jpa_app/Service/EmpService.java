package com.psa.SpringData_jpa_app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.SpringData_jpa_app.Repository.EmpRepository;
import com.psa.SpringData_jpa_app.entity.EMP_TBL;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepo;

	public void saveOrUpdateData() {
		EMP_TBL emp = new EMP_TBL();
		emp.setEMP_ID((long) 102);
		emp.setEMP_NAME("Sarfaraz");
		emp.setEMP_SAL((long) 200);
		empRepo.save(emp);	
	}
	
	public void deleteData() {
		empRepo.deleteById((long)101);		
	}
		
	public void fetchData(){	
		List<EMP_TBL> findAll = empRepo.findAll();
		System.out.println(findAll);	
	} 
}
