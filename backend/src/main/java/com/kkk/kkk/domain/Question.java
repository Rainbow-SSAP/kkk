package com.kkk.kkk.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    private Topic topic;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Answer> answers = new ArrayList<>();

    public Question() {}

    public Question(String title, Topic topic) {
        this.title = title;
        this.topic = topic;
    }

}
