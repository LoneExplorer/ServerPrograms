package edu.nyt.cst3619.dao.ss8285;

import java.util.ArrayList;
import java.util.List;
//import edu.nyt.cst3619.dao.ss8285.XMLStudentDAO;
import edu.nyt.cst3619.facade.homework.IStudentDAO;
import edu.nyt.cst3619.model.homework.Student;

public abstract class GenericStudentDAO implements IStudentDAO {

	// @Override
	// public List<Student> findAll() {
	// // TODO Auto-generated method stub
	// return null;
	// }

	private List<Student> findByGender(String gender) {
		List<Student> allStudents = this.findAll();
		List<Student> allGenders = new ArrayList<Student>();

		for (Student student : allStudents) {

			if (student.getGender().equals(gender)) {
				// do something
				allGenders.add(student);
				System.out.println(student);
			}

		}

		return allGenders;
	}

	@Override
	public List<Student> findAllFemale() {
		// TODO Auto-generated method stub
		return this.findByGender("F");
	}

	@Override
	public List<Student> findAllMale() {
		// TODO Auto-generated method stub
		return this.findByGender("M");
	}

}
