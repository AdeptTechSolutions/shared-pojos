package org.ascend.shared.pojos;

import lombok.Data;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
public class DataDriftDTO extends SharedProperties {
	String outputPath;
	String metaPath;
	String filePath;
	String fileName;
	Integer fileId;
	Long projectId;
	Long userId;
	String detail;
	String status;
}
