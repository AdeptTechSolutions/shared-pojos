package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignatureVersioningDTO extends SharedProperties {
    Integer projectId;
    String type;
    String unzipPathOfSignatures;
    String outputPath;
    String outputFileName;
    String status;
    String details;
    boolean isS3Job = false;
    List<Integer> fileIds;
}
