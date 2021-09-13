package com.psa.SpringData_jpa_app.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psa.SpringData_jpa_app.entity.EMP_TBL;


@Repository
public interface EmpRepository extends JpaRepository<EMP_TBL, Serializable> {

}
