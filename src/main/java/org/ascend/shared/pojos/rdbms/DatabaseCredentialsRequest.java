package org.ascend.shared.pojos.rdbms;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class DatabaseCredentialsRequest {

	private Integer id;

	@NotNull(message = "Database type is required")
	@Schema(example = "Postgresql", description = "Type of database to save and connect to")
	private DatabaseTypeEnum type;

	@NotBlank(message = "Host name is required")
	@Schema(example = "https://your-host.com", description = "Host of database to save and connect to")
	private String hostName;

	@NotBlank(message = "Database name is required")
	@Schema(example = "your_database", description = "Name of database to save and connect to")
	private String databaseName;

	@NotBlank(message = "User name is required")
	@Schema(example = "root", description = "User of database to save and connect to")
	private String userName;

	@NotBlank(message = "Password is required")
	@Schema(example = "your_password", description = "Password of database to save and connect to")
	private String password;

	@Min(value = 1, message = "Port must be greater than 0")
	@Schema(example = "3306", description = "Port of database to save and connect to")
	private int port;

//	@NotBlank(message = "Project name is required")
	@Schema(example = "DB Project", description = "Project Name to save the database credentials into")
	private String projectName;

	@NotNull(message = "Project ID is required")
	@Schema(example = "80", description = "Project ID to save database credentials into")
	private Integer projectId;

	@Schema(example = "your-sid", description = "Oracle SID")
	private String oracleSid;

	private Date createdAt;

}
