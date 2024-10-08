package practice_serialization;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

 class Project1 {
   String projectName;
   String projectStatus;
   int teamSize;
   List<String> teamMember;
   List<ProjectManeger> projectManeger;
    public Project1(String projectName, String projectStatus, int teamSize, List<String> teamMember,
		List<ProjectManeger> projectManeger) {
	super();
	this.projectName = projectName;
	this.projectStatus = projectStatus;
	this.teamSize = teamSize;
	this.teamMember = teamMember;
	this.projectManeger = projectManeger;
}
	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }  
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    public String getProjectStatus() {
        return projectStatus;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }  
    public void setTeamMember(List<String> teamMember) {
        this.teamMember = teamMember;
    }
    public List<String> getTeamMember() {
        return teamMember;
    }
    public void setProjectManeger(List<ProjectManeger> projectManeger) {
        this.projectManeger = projectManeger;
    }
    public List<ProjectManeger> getProjectManeger() {
        return projectManeger;
    } 
}
 class ProjectManeger {
   String name;
   String empId;
    public ProjectManeger(String name, String empId) {
	super();
	this.name = name;
	this.empId = empId;
}
	public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpId() {
        return empId;
    }
}
public class Run1_POJO {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		List<String> list= new ArrayList<String>();
		List<ProjectManeger> list1= new ArrayList<ProjectManeger>();

		list.add("Nag");
		list.add("Hari");
		list.add("Ram");
		 list1.add(  new ProjectManeger("Nag", "Typ212"));
		 list1.add(  new ProjectManeger("Charan", "Typ208"));
		Project1 projectobj= new Project1("Ngdr","created",12,list,list1);
		ObjectMapper objmap= new ObjectMapper();
		objmap.writeValue(new File("./project1.json"), projectobj);
		System.out.println("===DONE===");
	}
}
