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
}
