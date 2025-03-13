package org.ascend.shared.pojos.rdbms;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RunQueryModel {

	@NotNull(message = "Target database name is required")
	@Schema(example = "finance_db", description = "Name of the database to query")
	private String databaseName;

	@NotNull(message = "User ID is required")
	@Schema(example = "4", description = "User ID executing the query")
	private Long userId;

	@NotNull(message = "Project ID is required")
	@Schema(example = "80", description = "Project ID associated with the saved database credentials to query")
	private Integer projectId;

	@NotNull(message = "Database query is required")
	@Schema(example = "SELECT * FROM benefits", description = "SQL query to execute")
	private String query;

	@Schema(example = "5", description = "Limit the number of records returned")
	private Integer limit;
}
