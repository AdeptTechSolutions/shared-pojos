package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GatewayActivityDto {
	private String userId;
	private String method;
	private String path;
	private long duration;
	private int statusCode;
	private String ipAddress;
	private String userAgent;
	private LocalDateTime timestamp;
	private String errorMessage;
}
