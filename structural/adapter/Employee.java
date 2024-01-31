package designpatterns.structural.adapter;

public class Employee {
    private String fullName;
	private String jobTitle;
	private String officeLocation;

    public Employee(){}
	
	public Employee(String fullName, String jobTitle, String officeLocation) {
		super();
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.officeLocation = officeLocation;
	}



	public String getFullName() {
		return fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}	
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
	}
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
	}
    
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
	}
	
	public String toString() {
		return "Employee [fullName=" + fullName + ", jobTitle=" + jobTitle + ", officeLocation=" + officeLocation + "]";
	}	
	
	
	
}
