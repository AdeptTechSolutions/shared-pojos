package org.ascend.shared.pojos.rdbms;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Map;

@Data
public class RdbmsSaveConfigurationDTO {

	@Schema(example = "1", description = "ID of the saved configuration")
	private Long id;

	@NotBlank(message = "Configuration name cannot be blank")
	@Schema(example = "sample config 1", description = "Name for the configuration to save as")
	private String configName;

	@NotBlank(message = "Database name cannot be blank")
	@Schema(example = "database_name", description = "Database name of the saved database credentials to save configuration")
	private String databaseName;

	@NotNull(message = "Project ID is required")
	@Schema(example = "80", description = "Project ID associated with the saved database credentials to save configuration")
	private Long projectId;

	@NotNull(message = "User ID is required")
	@Schema(example = "10", description = "User ID of user making the request")
	private Long userId;

	@NotNull(message = "Main object cannot be null")
	@Schema(example = "{\n\t\"table_name\": [\n\t\t\"column 1\",\n\t\t\"column 2\",\n\t\t\"column 3\",\n\t\t\"column 4\"\n\t]\n}",
			description = "Original tables and columns, including all removed, unmodified, etc.")
	private Map<String, Object> mainObj;

	@NotNull(message = "Unmodified Data object cannot be null")
	@Schema(example = "{\n\t\"table_name\": [\n\t\t\"column 1\",\n\t\t\"column 2\",\n\t\t\"column 3\"\n\t]\n}",
			description = "Tables and columns that remain unchanged during transformation")
	private Map<String, Object> unmodifiedDataObj;

	@NotNull(message = "Mapped Anonymous Values object cannot be null")
	@Schema(example = "{\n\t\"table_name\": {\n\t\t\"column 1\": \"MAPPED_VALUE\",\n\t\t\"column 2\": \"MAPPED_VALUE\",\n\t\t\"column 3\": \"MAPPED_VALUE\",\n\t\t\"column 4\": \"MAPPED_VALUE\"\n\t}\n}",
			description = "Tables and columns mapped to anonymize values during transformation")
	private Map<String, Object> mappedAnonValues;

	@NotNull(message = "Tree format object cannot be null")
	@Schema(example = "{\n\t\"database_name\": [\n\t\t{\n\t\t\t\"table_name\": [\n\t\t\t\t\"column1___isKey___MAPPED_VALUE\",\n\t\t\t\t\"column2___isKey___MAPPED_VALUE\",\n\t\t\t\t\"column3___isKey___MAPPED_VALUE\",\n\t\t\t\t\"column4___isKey___MAPPED_VALUE\"\n\t\t\t]\n\t\t}\n\t]\n}",
			description = "Structure for UI tree visualization. 'isKey' indicates whether the column is a key.")
	private Map<String, Object> treeFormat;
}

