package com.example.Forum_WebApp.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "privatemessages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrivateMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //TODO: sender_id, receiver_id(users)

    @Column(nullable = false)
    private String content;

    private LocalDateTime sendTime;
}
