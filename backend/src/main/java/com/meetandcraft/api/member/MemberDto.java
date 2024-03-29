package com.meetandcraft.api.member;

import com.meetandcraft.api.project.Project;
import com.meetandcraft.api.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String role;
    private UUID userId;
    private UUID projectId;
}
