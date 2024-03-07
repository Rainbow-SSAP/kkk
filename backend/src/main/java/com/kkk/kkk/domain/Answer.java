package com.kkk.kkk.domain;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer(String content, Question question) {
        this.content = content;
        this.question = question;
    }

    public Answer() {
    }
}
