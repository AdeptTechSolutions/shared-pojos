package org.ascend.shared.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FeatureEngDto extends UserResourcesDto implements Serializable {
    private Integer parentFileId;
    private Integer userId;
    String detail;
    String status;
    String engType;
    Integer fileId;
    String featureCols;
    String predictCols;
    String scalingType;
    String binningMethod;
    String binningNature;
    String outputFilePath;
    String trainingPercentage ;
    String outputFileFormat ;
    SchedulingJobDTO schedulingJobDTO;
    String targetColumn;
    String targetColType;
    String method;
    Boolean replaceWithCompliantHeaders;
}
