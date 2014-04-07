package edu.cst.nyt.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the people database table.
 * 
 */
@Entity
@NamedQuery(name="People.findAll", query="SELECT p FROM People p")
public class People implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int peopleId;

	private BigDecimal currentSalary;

	private String firstName;

	private String gender;

	private String lastName;

	private int titleId;

	public People() {
	}

	public int getPeopleId() {
		return this.peopleId;
	}

	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}

	public BigDecimal getCurrentSalary() {
		return this.currentSalary;
	}

	public void setCurrentSalary(BigDecimal currentSalary) {
		this.currentSalary = currentSalary;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTitleId() {
		return this.titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

}