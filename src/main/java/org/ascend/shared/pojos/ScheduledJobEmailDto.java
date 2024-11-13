package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledJobEmailDto {
    String userName;
    String projectName;
    String sourceName;
    String jobType;
    String method;
    SchedulingJobDTO schedulingJobDTO;
}
