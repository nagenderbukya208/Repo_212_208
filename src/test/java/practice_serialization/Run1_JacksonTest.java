package practice_serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonPropertyOrder(
		value = { "createdBy",
				   "projectName",
				   "status",
				   "teamSize"
		}
		)
@JsonIgnoreProperties(
		value = {
				"projectName"
		},allowSetters = true
		)

class Project{   //POJO class [plain old java object]
	private String projectName;
	@JsonProperty(value="created By")
	private String createdBy;
	private int teamSize;
	private String status;
	private Project() {}
	public Project(String projectName, String createdBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
public class Run1_JacksonTest {
 public static void main(String[] args) throws Throwable, DatabindException, IOException  {
	 Project pobj= new Project("charly", "Nagender", 10, "created");
	 ObjectMapper objM= new ObjectMapper();
	 objM.writeValue(new File("./project1.json"), pobj);
	 System.out.println("===END===");
}
}
