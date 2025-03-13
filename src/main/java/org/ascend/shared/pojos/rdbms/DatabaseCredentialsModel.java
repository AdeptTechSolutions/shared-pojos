package org.ascend.shared.pojos.rdbms;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DatabaseCredentialsModel {

	@Schema(example = "4", description = "Database Credentials ID")
	private final Integer id;

	@NotNull(message = "User ID is required")
	@Schema(example = "10", description = "ID of user associated with the saved database credentials")
	private final Long userId;

	@NotNull(message = "Database type is required")
	@Schema(example = "Postgresql", description = "Type of database")
	private final DatabaseTypeEnum type;

	@NotBlank(message = "Host Name cannot be blank")
	@Schema(example = "https://your-host.com", description = "Host of database")
	private final String hostName;

	@NotBlank(message = "Database Name cannot be blank")
	@Schema(example = "your_database", description = "Name of database")
	private final String databaseName;

	@NotBlank(message = "User Name cannot be blank")
	@Schema(example = "root", description = "User of database")
	private final String userName;

	@NotBlank(message = "Password cannot be blank")
	@Schema(example = "your_password", description = "Password of database")
	private final String password;

	@Min(value = 1, message = "Port must be greater than 0")
	@Schema(example = "3306", description = "Port of database")
	private final int port;

	@NotBlank(message = "Project Name cannot be blank")
	@Schema(example = "DB Project", description = "Project Name associated with the saved database credentials")
	private final String projectName;

	@NotNull(message = "Project ID is required")
	@Schema(example = "80", description = "Project ID associated with database credentials")
	private final Integer projectId;

	@Schema(example = "your-sid", description = "Oracle SID")
	private final String oracleSid;

	private final Date createdAt;

}
