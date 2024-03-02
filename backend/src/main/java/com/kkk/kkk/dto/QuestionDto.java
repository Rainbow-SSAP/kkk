package com.kkk.kkk.dto;

import java.util.List;

public class QuestionDto {
    private Long id;
    private String question;
    private List<AnswerDto> answers;

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<AnswerDto> getAnswers() {
        return answers;
    }

    public QuestionDto(Long id, String question, List<AnswerDto> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

}
