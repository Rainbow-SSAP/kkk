package com.kkk.kkk.service;

import com.kkk.kkk.domain.Answer;
import com.kkk.kkk.domain.Question;
import com.kkk.kkk.domain.Topic;
import com.kkk.kkk.dto.AnswerDto;
import com.kkk.kkk.dto.QuestionDto;
import com.kkk.kkk.dto.QuestionnaireResponseDto;
import com.kkk.kkk.exception.TopicNotFoundException;
import com.kkk.kkk.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeddingGiftService {

    private final TopicRepository topicRepository;

    @Autowired
    public WeddingGiftService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public QuestionnaireResponseDto getWeddingGiftQuestionnaire() {
        String keyword = "wedding-gift";
        Topic topic = topicRepository.findByKeyword(keyword);

        if (topic == null) {
            throw new TopicNotFoundException("주제를 찾을 수 없습니다: " + keyword);
        }

        List<QuestionDto> questions = new ArrayList<>();
        for (Question question : topic.getQuestions()) {
            List<AnswerDto> answers = new ArrayList<>();
            for (Answer answer : question.getAnswers()) {
                answers.add(new AnswerDto(answer.getId(), answer.getContent()));
            }
            questions.add(new QuestionDto(question.getId(), question.getTitle(), answers));
        }

        QuestionnaireResponseDto questionnaireResponseDto = new QuestionnaireResponseDto();
        questionnaireResponseDto.setTopic(topic.getTitle());
        questionnaireResponseDto.setQuestions(questions);
        return questionnaireResponseDto;
    }

}
