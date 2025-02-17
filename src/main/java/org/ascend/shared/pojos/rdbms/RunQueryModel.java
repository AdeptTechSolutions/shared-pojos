package org.ascend.shared.pojos.rdbms;

import lombok.Data;

@Data
public class RunQueryModel {

	private String databaseName;
	private Long userId;
	private String projectName;
	private Integer projectId;
	private String query;
	private Integer limit;
}
