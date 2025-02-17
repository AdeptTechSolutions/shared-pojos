package org.ascend.shared.pojos.rdbms;

import lombok.Data;

import java.util.Map;

@Data
public class RdbmsSaveConfigurationDTO {
	private Long id;
	private String configName;
	private String databaseName;
	private Long projectId;
	private Long userId;
	private Map<String, Object> mainObj;
	private Map<String, Object> unmodifiedDataObj;
	private Map<String, Object> mappedAnonValues;
	private Map<String, Object> treeFormat;
}
