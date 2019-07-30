package klenkar.summertask;

import java.util.Date;

public class Testing {

	// private fields

	private int id;
	private String typeOfTesting;
	private Date dateOfTesting;
	private int numberOfTesting;
	private int resultOfTesting;

	// default constructor
	public Testing() {

	}

	// parameterized constructor
	public Testing(int id, String typeOfTesting, Date dateOfTesting, int numberOfTesting, int resultOfTesting) {
		this.id = id;
		this.typeOfTesting = typeOfTesting;
		this.dateOfTesting = dateOfTesting;
		this.numberOfTesting = numberOfTesting;
		this.resultOfTesting = resultOfTesting;

	}

	// public methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfTesting() {
		return typeOfTesting;
	}

	public void setTypeOfTesting(String typeOfTesting) {
		this.typeOfTesting = typeOfTesting;
	}

	public Date getDateOfTesting() {
		return dateOfTesting;
	}

	public void setDateOfTesting(Date dateOfTesting) {
		this.dateOfTesting = dateOfTesting;
	}

	public int getNumberOfTesting() {
		return numberOfTesting;
	}

	public void setNumberOfTesting(int numberOfTesting) {
		this.numberOfTesting = numberOfTesting;
	}

	public int getResultOfTesting() {
		return resultOfTesting;
	}

	public void setResultOfTesting(int resultOfTesting) {
		this.resultOfTesting = resultOfTesting;
	}

}
