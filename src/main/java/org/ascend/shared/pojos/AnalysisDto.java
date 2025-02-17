package org.ascend.shared.pojos;

import lombok.*;
import org.ascend.shared.pojos.shared.SharedProperties;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnalysisDto extends SharedProperties {
    private Integer parentFileId;
    private Integer userId;
    String detail;
    String status;
    Integer fileId;
    String outputFilePath;

    String analysisType;
    String explorativeConstraints;
    String correlationType;
    String correlationFileName;
    String covarianceCols;
    String windowStatisticType;
    String windowDataFeaturesCol ;
    String windowPivotFeaturesCol;
    String inferentialType;
    String featureCol;
    String std;
    String mean;
    String chiDependentFeatureCols;
    String chiIndependentFeatureCols;
    String outputFileFormat;
    SchedulingJobDTO schedulingJobDTO;
    Boolean replaceWithCompliantHeaders;
}
