package org.ascend.shared.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FeatureEngDto extends SharedProperties implements Serializable {
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

    // for class imbalance job only
    Integer binFunc;
    String isOutputSorted;
    String isTimeSeriesData;
    String selectedIndexColumn;
    String anonColumnsMappedJson;
    String categoricalColumnsJson;
    Boolean enableDnaSizeReduction;
}
