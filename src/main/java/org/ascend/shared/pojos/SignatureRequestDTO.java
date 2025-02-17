package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignatureRequestDTO extends SharedProperties {

    Integer parentFileId;
    Integer fileId;
    Long userId;
    Integer projectId;
    String listAnon;
    String listPseudo;
    String listLinked;
    String scalingFactor;
    String outputFileName;
    String transformationType;
    String jobStatus;
    String detail;
    Integer binfunc;
    Boolean isPreviewJob = false;
    String mappedJson;
    String mappedJsonFilePath;
    String outputFileFormat;
    String inputFileFormat;
    String uploadedJsonStr;
    String uploadedJsonStrPath;
    SelectedDnaDTO selectedDnaDTO;
    String isOutputSorted;
    String isTimeSeriesData;
    String selectedIndexColumn;
    String postStatsValue;
    String selectionType;
    SchedulingJobDTO schedulingJobDTO;
    Boolean enableDnaSizeReduction;
    Boolean replaceWithCompliantHeaders;
}
