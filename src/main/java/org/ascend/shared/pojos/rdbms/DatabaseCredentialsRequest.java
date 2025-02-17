package org.ascend.shared.pojos.rdbms;

import lombok.Data;

import java.util.Date;

@Data
public class DatabaseCredentialsRequest {

	private Integer id;

	private DatabaseTypeEnum type;

	private String hostName;

	private String databaseName;

	private String userName;

	private String password;

	private int port;

	private String projectName;

	private Integer projectId;

	private String oracleSid;

	private Date createdAt;


//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public DatabaseTypeEnum getType() {
//		return type;
//	}
//
//	public void setType(DatabaseTypeEnum type) {
//		this.type = type;
//	}
//
//	public String getHostName() {
//		return hostName;
//	}
//
//	public void setHostName(String hostName) {
//		this.hostName = hostName;
//	}
//
//	public String getDatabaseName() {
//		return databaseName;
//	}
//
//	public void setDatabaseName(String databaseName) {
//		this.databaseName = databaseName;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getPort() {
//		return port;
//	}
//
//	public void setPort(int port) {
//		this.port = port;
//	}
//
//	public Integer getProjectId() {
//		return projectId;
//	}
//
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//
//	public void setProjectId(Integer projectName) {
//		this.projectId = projectName;
//	}
//
//
//	public String getOracleSid() {
//		return oracleSid;
//	}
//
//	public void setOracleSid(String oracleSid) {
//		this.oracleSid = oracleSid;
//	}
}
