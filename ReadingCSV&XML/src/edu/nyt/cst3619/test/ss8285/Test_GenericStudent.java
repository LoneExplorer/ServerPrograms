package edu.nyt.cst3619.test.ss8285;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.nyt.cst3619.dao.ss8285.XMLStudentDAO;
import edu.nyt.cst3619.facade.homework.IStudentDAO;

public class Test_GenericStudent {

	@Test
	public void test_file_with_gender_for_female() {
		IStudentDAO dao = new XMLStudentDAO();
		int rowCount = dao.findAllFemale().size();		
		boolean test = rowCount < 25 && rowCount>5;
		assertTrue("RowCount is " + rowCount,test);
	}
	
	@Test
	public void test_file_with_gender_with_male() {
		IStudentDAO dao = new XMLStudentDAO();
		int rowCount = dao.findAllMale().size();		
		boolean test = rowCount >50;
		assertTrue("RowCount is " + rowCount,test);
	}

}
