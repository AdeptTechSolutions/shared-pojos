package org.ascend.shared.pojos;

import lombok.Data;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
public class PostStatsJobDTO extends SharedProperties {
	Long userId;
	Integer projectId;
	Integer projectsFileId;
	String projectsFileName;
	String status;
	String detail;
	Long s3CredentialsId;

	String originalSourceFilePath;
	String originalSourceFileMetaPath;

	String generatedFilePath;
	String generatedFileMetaPath;

	String generatedOutputPath;
}
