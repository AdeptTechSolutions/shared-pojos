package org.ascend.shared.pojos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RdbmsNullValuesDTO extends SqlJobDTO {

   String userName;
   String rdbmsNullJobStatus;
   String rdbmsNullJobDetails;
   String jobType;

   String dataSource;
   String dataSourceName;
   Boolean isSingleTableScript;

//   @NotNull(message = "Database user is required")
//   @Schema(example = "true", description = "Whatever to extract and save DNA of database as well")
   private Boolean shouldExtractSignatureDna;

   // Optional fields for db_dna.py advanced features
   @Schema(description = "Operating mode for db_dna.py: detailed, balanced, or efficient", example = "balanced")
   private String operatingMode;

   @Schema(description = "Scaling factor for data generation (default: 1.0)", example = "1.0")
   private Double scalingFactor;
}
