package com.user.management.model.user;

import com.user.management.model.BaseEntity;
import com.user.management.model.enums.Language;
import com.user.management.model.enums.Scope;
import com.user.management.model.userrole.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "admin")
    private boolean admin;

    @Column(name = "language")
    @Enumerated(EnumType.STRING)
    private Language language;

    @Column(name = "scope")
    @Enumerated(EnumType.STRING)
    private Scope scope;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<UserRole> roles = new HashSet();

    public User(String name, String loginName, String password, String email, String mobilePhone, boolean admin, Language language, Scope scope, boolean active) {
        super(active);
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.admin = admin;
        this.language = language;
        this.scope = scope;
    }
}
