package com.sha.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", unique = true,nullable=false,length = 100)
    private String username;

    @Column(name="password", nullable = false, length = 100)
    private String password;

    @Column(name="name",nullable = false,length = 100)
    private String name;

    @Column(name="create_time")
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;

    @Transient //this won't be stored in the database. It will be used on-the-fly instances.
    private String token;
}
