package org.ascend.shared.pojos.rdbms;

import java.util.Date;

public class DatabaseCredentialsModel {

	private final Integer id;
	private final Long userId;

	private final DatabaseTypeEnum type;

//	@NotBlank(message = "Host Name cannot be blank")
	private final String hostName;

	private final String databaseName;

//	@NotBlank(message = "User Name cannot be blank")
	private final String userName;

//	@NotBlank(message = "password cannot be blank")
	private final String password;

	private final String projectName;

	private final Integer projectId;

	private final String oracleSid;

	private final int port;

	private final Date createdAt;

	public DatabaseCredentialsModel(Integer id, Long userId, DatabaseTypeEnum type, String hostName, String databaseName, String userName, String password, int port, String projectName, String oracleSid, Integer projectId, Date createdAt) {
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.hostName = hostName;
		this.databaseName = databaseName;
		this.userName = userName;
		this.password = password;
		this.port = port;
		this.projectName = projectName;
		this.projectId = projectId;
		this.oracleSid = oracleSid;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public Long getUserId() {
		return userId;
	}

	public DatabaseTypeEnum getType() {
		return type;
	}

	public String getHostName() {
		return hostName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public int getPort() {
		return port;
	}

	public String getProjectName() {
		return projectName;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public String getOracleSid() {
		return oracleSid;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

}
