package com.spring.friendfinder.model;

import com.spring.friendfinder.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User extends BaseEntity{

    @Column(name = "FristName")
    private String fristName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Age")
    private String age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "Phone")
    private String phone;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date data;

    @OneToMany(mappedBy = "user")
    private List<Post>post;

    @OneToMany(mappedBy = "user")
    private List<Friend>friends;
}
