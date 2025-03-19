package org.ascend.shared.pojos.rdbms;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SchemaStatsRequestDto {

//	@NotNull(message = "Project ID is required")
//	@Schema(example = "80", description = "Project ID associated with the saved database credentials")
//	private Integer projectId;

//	@NotNull(message = "Schema ID is required")
//	private Integer schemaId;

	@NotBlank(message = "Data source cannot be blank")
	private String dataSource;

	@NotBlank(message = "Output database cannot be blank")
	private String outputDatabase;

	@NotBlank(message = "Table name cannot be blank")
	private String table;

	@NotBlank(message = "Column name cannot be blank")
	private String column;
}

