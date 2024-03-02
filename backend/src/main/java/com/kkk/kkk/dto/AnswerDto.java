package com.kkk.kkk.dto;

public class AnswerDto {
    private Long id;   // 답변의 고유 식별자
    private String text; // 답변의 내용

    private AnswerDto() {}

    public AnswerDto(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
