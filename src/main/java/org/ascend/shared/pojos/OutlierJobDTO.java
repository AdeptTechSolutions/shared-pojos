package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutlierJobDTO extends SharedProperties {
    Integer parentFileId;
    Integer fileId;
    String method;
    String nature;
    String transformationType;
    String status;
    String detail;
    Integer stringLimit;
    String forbiddenChars;
    String listOfColumns;
    String precisionOfColumns;
    String outputFilePath;
    String outputFileFormat;
    String knnKthValue;

    String dateColumns;
    String timeColumns;
    String loglist;
    String sqlist;
    String autoMapping;
    String outputTimeFormat;
    String outputDateFormat;
    String filter;
    SchedulingJobDTO schedulingJobDTO;
    Long workflowId;
    String taskName;
    String jobType;
    String isOutputSorted;
    String isTimeSeriesData;
    String selectedIndexColumn;

    Object unexpectedCategoriesToRemove;
    Object inconsistantLabelingToCorrect;
    String categoricalAnalysisJobId;

    Boolean replaceWithCompliantHeaders;

}
