package cm.softwareservices.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationStatusDto {

    private String operationResult;
    private String operationName;
}
