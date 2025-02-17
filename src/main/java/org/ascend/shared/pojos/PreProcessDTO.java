package org.ascend.shared.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
@NoArgsConstructor
public class PreProcessDTO extends SharedProperties {

    private Integer projectFileId;
    private Long userId;
    private String outputFilePath;
    private String status;
    private String detail;
}
