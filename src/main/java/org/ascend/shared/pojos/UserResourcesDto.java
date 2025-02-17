package org.ascend.shared.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
@NoArgsConstructor
public class UserResourcesDto {

    protected  String exec_core;
    protected String exec_memory;
    protected String exec_instance;
    protected String driver_core;
    protected String driver_memory;
}
