package com.user.management.model.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.user.management.model.dto.role.RoleDto;
import com.user.management.model.enums.Language;
import com.user.management.model.enums.Scope;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expire_at")
    private String expireAt;

    @JsonProperty("refresh_token")
    private String refreshToken;

    private Set<RoleDto> roles = new HashSet();
    private boolean admin;

    private Language language;

    private Scope scope;

    public UserDto(Long userId, String accessToken, String expireAt, String refreshToken, RoleDto roleDto, boolean admin, Language language, Scope scope) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.expireAt = expireAt;
        this.refreshToken = refreshToken;
        this.admin = admin;
        this.language = language;
        this.scope = scope;
        roles.add(roleDto);
    }

}
