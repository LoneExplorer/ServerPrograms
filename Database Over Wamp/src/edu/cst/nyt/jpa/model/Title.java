package edu.cst.nyt.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the title database table.
 * 
 */
@Entity
@NamedQuery(name="Title.findAll", query="SELECT t FROM Title t")
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int titleId;

	private String description;

	private BigDecimal salaryRange1;

	private BigDecimal salaryRange2;

	public Title() {
	}

	public int getTitleId() {
		return this.titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getSalaryRange1() {
		return this.salaryRange1;
	}

	public void setSalaryRange1(BigDecimal salaryRange1) {
		this.salaryRange1 = salaryRange1;
	}

	public BigDecimal getSalaryRange2() {
		return this.salaryRange2;
	}

	public void setSalaryRange2(BigDecimal salaryRange2) {
		this.salaryRange2 = salaryRange2;
	}

}