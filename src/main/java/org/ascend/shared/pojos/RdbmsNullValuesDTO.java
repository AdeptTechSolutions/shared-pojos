package org.ascend.shared.pojos;

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
}
