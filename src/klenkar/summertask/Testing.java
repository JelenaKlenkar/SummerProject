package klenkar.summertask;

import java.util.Date;

public class Testing {

	// private fields

	private int id;
	private String typeOfTesting;
	private Date dateOfTesting;
	private int numberOfTesting;
	private Date testingTime;
	private int resultOfTesting;
	private int jobApplication;

	// default constructor
	public Testing() {

	}

	// parameterized constructor
	public Testing(int id, String typeOfTesting, Date dateOfTesting, int numberOfTesting, Date testingTime,
			int resultOfTesting, int jobApplication) {
		this.id = id;
		this.typeOfTesting = typeOfTesting;
		this.dateOfTesting = dateOfTesting;
		this.numberOfTesting = numberOfTesting;
		this.testingTime = testingTime;
		this.resultOfTesting = resultOfTesting;
		this.jobApplication = jobApplication;
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

	public Date getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(Date testingTime) {
		this.testingTime = testingTime;
	}

	public int getResultOfTesting() {
		return resultOfTesting;
	}

	public void setResultOfTesting(int resultOfTesting) {
		this.resultOfTesting = resultOfTesting;
	}

	public int getJobApplication() {
		return jobApplication;
	}

	public void setJobApplication(int jobApplication) {
		this.jobApplication = jobApplication;
	}

}
