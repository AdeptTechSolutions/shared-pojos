package org.ascend.shared.pojos.rdbms;

import java.util.Optional;

public enum DatabaseTypeEnum {

	MySQL, Postgresql, Oracle, MSSQLServer;


	public static Optional<DatabaseTypeEnum> fromString(String value) {
		try {
			return Optional.of(DatabaseTypeEnum.valueOf(value));
		}catch(Exception e) {
			return Optional.empty();
		}
	}

}
