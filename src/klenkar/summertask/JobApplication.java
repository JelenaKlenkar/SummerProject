package klenkar.summertask;

import java.util.Date;

public class JobApplication {

	// define private fields

	private int id;
	private Date dateOfReceive;
	private Date timeOfReceive;
	private int numberOfApplication;

	// default constructor

	public JobApplication() {

	}

	// parameterized constructor
	public JobApplication(int id, Date dateOfReceive, Date timeOfReceive, int numberOfApplication) {
		this.id = id;
		this.dateOfReceive = dateOfReceive;
		this.timeOfReceive = timeOfReceive;
		this.numberOfApplication = numberOfApplication;

	}

	// public methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfReceive() {
		return dateOfReceive;
	}

	public void setDateOfReceive(Date dateOfReceive) {
		this.dateOfReceive = dateOfReceive;
	}

	public Date getTimeOfReceive() {
		return timeOfReceive;
	}

	public void setTimeOfReceive(Date timeOfReceive) {
		this.timeOfReceive = timeOfReceive;
	}

	public int getNumberOfApplication() {
		return numberOfApplication;
	}

	public void setNumberOfApplication(int numberOfApplication) {
		this.numberOfApplication = numberOfApplication;
	}

}
