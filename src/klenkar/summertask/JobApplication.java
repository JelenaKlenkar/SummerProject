package klenkar.summertask;

import java.util.Date;

public class JobApplication {

	// define private fields

	private int id;
	private Date dateOfReceive;
	private Date timeOfReceive;
	private int numberOfApplication;
	private int jobPosition;
	private int applicant;

	// default constructor

	public JobApplication() {

	}

	// parameterized constructor
	public JobApplication(int id, Date dateOfReceive, Date timeOfReceive, int numberOfApplication, int jobPosition,
			int applicant) {
		this.id = id;
		this.dateOfReceive = dateOfReceive;
		this.timeOfReceive = timeOfReceive;
		this.numberOfApplication = numberOfApplication;
		this.jobPosition = jobPosition;
		this.applicant = applicant;
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

	public int getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(int jobPosition) {
		this.jobPosition = jobPosition;
	}

	public int getApplicant() {
		return applicant;
	}

	public void setApplicant(int applicant) {
		this.applicant = applicant;
	}

}
