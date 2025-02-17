package org.ascend.shared.pojos.rdbms;

import lombok.Data;

@Data
public class SchemaStatsRequestDto {
	Integer projectId;
	Integer schemaId;
	String dataSource;
	String outputDatabase;
	String table;
	String column;
}

