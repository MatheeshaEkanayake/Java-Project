package com.codejam.codex.authzen.dtos.inputs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleRequest {
    @NotEmpty(message = "At least one role must be specified")
    private String roleName;

    @NotBlank(message = "Description is required")
    private String description;

}
