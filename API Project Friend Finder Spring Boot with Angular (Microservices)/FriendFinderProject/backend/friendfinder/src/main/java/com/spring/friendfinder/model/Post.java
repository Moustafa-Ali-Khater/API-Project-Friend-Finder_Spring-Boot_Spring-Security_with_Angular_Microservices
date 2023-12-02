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
@Entity(name = "posts")
public class Post extends BaseEntity{

    @Column(name = "text")
    private String text;

    @Column(name = "image")
    private String image;

    @Column(name = "likes")
    private int like;

    @ManyToOne
    @JoinColumn(name = "Users_Id")
    private User user;
}
