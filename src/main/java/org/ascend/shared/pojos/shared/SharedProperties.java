package org.ascend.shared.pojos.shared;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.UserResourcesDto;

@Data
@NoArgsConstructor
public class SharedProperties extends UserResourcesDto {
	String source;
}
