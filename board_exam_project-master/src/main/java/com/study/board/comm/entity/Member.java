package com.study.board.comm.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="memberNo")
    private Long memberNo;

    @Column(name="memberId")
    private String memberId;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;

}
