package com.kkk.kkk.dto;

import java.util.List;

public class QuestionnaireResponseDto {
    private String topic;
    private List<QuestionDto> questions;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }
}
