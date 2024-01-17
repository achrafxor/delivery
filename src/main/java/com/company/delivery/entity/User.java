package com.company.delivery.entity;
import com.company.delivery.enmus.AuthorityEnum;
import jakarta.persistence.*;

import lombok.*;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;


    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private AuthorityEnum authority;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    @Lob
    private String image;

}

