package edu.nyt.cst3619.dao.ss8285;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import edu.nyt.cst3619.model.homework.Student;

public class XMLStudentDAO extends GenericStudentDAO {

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		try {

			File fXmlFile = new File("C:\\data\\Students.xml");// E:\\Documents\\Eclipse\\Students.xml
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("ROW");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Student student = new Student();
				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					// setting all values
					String id = eElement.getElementsByTagName("id").item(0)
							.getTextContent();
					String first = eElement.getElementsByTagName("firstName")
							.item(0).getTextContent();
					String last = eElement.getElementsByTagName("lastName")
							.item(0).getTextContent();
					String gender = eElement.getElementsByTagName("gender")
							.item(0).getTextContent();
					String dob = eElement.getElementsByTagName("dob").item(0)
							.getTextContent();
					String scores = eElement.getElementsByTagName("scores")
							.item(0).getTextContent();
					double Dscores = Double.parseDouble(scores);

					student.setId(id);
					student.setFirstName(first);
					student.setLastName(last);
					student.setGender(gender);
					student.setDateOfBirth(dob);
					student.setScores(Dscores);
					// adding to the list

					students.add(student);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	

}
