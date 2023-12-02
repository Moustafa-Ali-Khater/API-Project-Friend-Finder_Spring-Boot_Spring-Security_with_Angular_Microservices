package com.spring.friendfinder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "friends")
public class Friend extends BaseEntity{

    @Column(name = "FriendId")
    private int idFriend;

    @ManyToOne
    @JoinColumn(name = "Users_Id")
    private User user;
}
