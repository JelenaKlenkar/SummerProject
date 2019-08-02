package klenkar.summertask;

import java.util.Date;

public class Interview {

	// private fields

	private int id;
	private String typeofInterview;
	private Date dateOfInterview;
	private int numberOfInterview;

	// default constructor
	public Interview() {

	}

	// parameterized constructor

	public Interview(int id, String typeofInterview, Date dateOfInterview, int numberOfInterview) {
		this.id = id;
		this.typeofInterview = typeofInterview;
		this.dateOfInterview = dateOfInterview;
		this.numberOfInterview = numberOfInterview;

	}

	// public methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeofInterview() {
		return typeofInterview;
	}

	public void setTypeofInterview(String typeofInterview) {
		this.typeofInterview = typeofInterview;
	}

	public Date getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}

	public int getNumberOfInterview() {
		return numberOfInterview;
	}

	public void setNumberOfInterview(int numberOfInterview) {
		this.numberOfInterview = numberOfInterview;
	}

	@Override
	public String toString() {
		return getTypeofInterview() + " " + getDateOfInterview();
	}
}
