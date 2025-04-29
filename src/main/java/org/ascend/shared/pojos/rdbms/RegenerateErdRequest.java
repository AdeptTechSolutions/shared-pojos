package org.ascend.shared.pojos.rdbms;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegenerateErdRequest {

	private Integer id;

	@NotNull(message = "Database type is required")
	@Schema(example = "Postgresql", description = "Type of database")
	private DatabaseTypeEnum type;

	@NotBlank(message = "Host Name cannot be blank")
	@Schema(example = "https://your-host.com", description = "Host of database")
	private String hostName;

	@NotBlank(message = "Database Name cannot be blank")
	@Schema(example = "your_database", description = "Name of database")
	private String databaseName;

	@NotBlank(message = "User Name cannot be blank")
	@Schema(example = "root", description = "User of database")
	private String userName;

	@NotBlank(message = "Password cannot be blank")
	@Schema(example = "your_password", description = "Password of database")
	private String password;

	@Min(value = 1, message = "Port must be greater than 0")
	@Schema(example = "3306", description = "Port of database")
	private int port;

	@Schema(example = "your-sid", description = "Oracle SID")
	private String oracleSid;

}
