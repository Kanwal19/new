package com.cg.payroll.daoServices;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO extends JpaRepository<Associate, Integer> {
	/*Associate save(Associate associate);
	Associate findOne(int associateId);
	ArrayList<Associate> findAll();
	boolean update(Associate associate);*/
	
//	Associate findFew(int associateId); // search on internet for solution
}
