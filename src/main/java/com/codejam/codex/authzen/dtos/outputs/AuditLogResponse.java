package com.codejam.codex.authzen.dtos.outputs;

//import com.codejam.codex.authzen.models.User;

import lombok.*;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditLogResponse {
    private Long id;
    private String username;
    private String actionType;
    private String ipAddress;
    private Timestamp timestamp;
}
