package excelReading;

import java.util.ArrayList;

public class projectsCollection {
	
	public ArrayList<projects> projectsArr;

    public projectsCollection() {
    	projectsArr = new ArrayList<projects>();
    }

    public void addProject(String NodeID, String ProjectID, int Stage, String StartDate, String EndDate) {
    	projectsArr.add(new projects(NodeID, ProjectID, Stage, StartDate, EndDate));
    }

    public projects getProjectAtIndex(int index) {
        return projectsArr.get(index);
    }

    //or if you want the entire ArrayList:
    public ArrayList getProjectsArr() {
        return projectsArr;

    }

}
