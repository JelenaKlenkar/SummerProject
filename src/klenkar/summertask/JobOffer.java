package klenkar.summertask;

import java.util.Date;

public class JobOffer {

	// private fields
	private int id;
	private double salary;
	private Date startingDate;
	private boolean accept;
	private int jobApplication;

	// default constructor
	public JobOffer() {

	}

	// parameterized constructor
	public JobOffer(int id, double salary, Date startingDate, boolean accept, int jobApplication) {
		this.id = id;
		this.salary = salary;
		this.startingDate = startingDate;
		this.accept = accept;
		this.jobApplication = jobApplication;
	}

	// public methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public int getJobApplication() {
		return jobApplication;
	}

	public void setJobApplication(int jobApplication) {
		this.jobApplication = jobApplication;
	}

}
