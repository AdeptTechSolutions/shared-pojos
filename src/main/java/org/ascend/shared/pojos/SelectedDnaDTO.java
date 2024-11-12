package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectedDnaDTO {
    Boolean isDnaSelected;
    String selectedDNA;
    String sparkJobId;
}
