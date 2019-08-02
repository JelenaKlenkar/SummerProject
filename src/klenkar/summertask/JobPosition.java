package klenkar.summertask;

public class JobPosition {

	// private fields

	private int id;
	private String nameOfJobPosition;
	private String jobDescription;

	// default constructor
	public JobPosition() {

	}

	// parameterized constructor
	public JobPosition(int id, String nameOfJobPosition, String jobDescription) {
		this.id = id;
		this.nameOfJobPosition = nameOfJobPosition;
		this.jobDescription = jobDescription;
	}

	// public methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfJobPosition() {
		return nameOfJobPosition;
	}

	public void setNameOfJobPosition(String nameOfJobPosition) {
		this.nameOfJobPosition = nameOfJobPosition;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return getNameOfJobPosition();
	}

}
