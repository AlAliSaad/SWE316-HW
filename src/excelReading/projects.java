package excelReading;

import java.util.ArrayList;

public class projects {
	
	String NodeID;
	String ProjectID;
	double Stage;
	double StartDate;
	double EndDate;
	private ArrayList<projects> projectsArr;
	
//	public projects() {
//		NodeID = "";
//		ProjectID = "";
//		Stage = 0;
//		StartDate = "";
//		EndDate = "";
//		
//	}
	
	public projects(String NodeID, String ProjectID, double Stage, double StartDate, double EndDate) {
		this.NodeID = NodeID;
		this.ProjectID = ProjectID;
		this.Stage = Stage;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		
	}
	
	public String getNodeID(){
		return this.NodeID;
	}
	public String getProjectID() {
		return this.ProjectID;
	}
	public double getStage() {
		return this.Stage;
	}
	public double getStartDate() {
		return this.StartDate;
	}
	public double getEndDate() {
		return this.EndDate;
	}	

}
