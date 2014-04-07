package edu.nyt.cst3619.dao.ss8285;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import edu.nyt.cst3619.model.homework.Student;

public class FILEStudentDAO extends GenericStudentDAO {

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> returnList = new ArrayList<Student>();
		 
		BufferedReader br = null;		
		double scores;		 
		try {
         
			String sCurrentLine; 
			br = new BufferedReader(new FileReader("E:\\Documents\\Eclipse\\Students.csv")); 

			int counter = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				Student student = new Student();
				counter ++;
				if (counter == 1){
					continue;
				}
				
				String[] data = sCurrentLine.split(",");
				student.setId(data[0]);			
				student.setFirstName(data[1]);				
				student.setLastName(data[2]);				
				student.setGender(data[3]);				
				student.setDateOfBirth(data[4]);
				
				scores = Double.parseDouble(data[5]);
				student.setScores(scores);
				returnList.add(student);
				//System.out.println(student);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return returnList;
		
	}

	
	
		
}
