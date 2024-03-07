package com.kkk.kkk.config;

import com.kkk.kkk.domain.Answer;
import com.kkk.kkk.domain.Question;
import com.kkk.kkk.domain.Topic;
import com.kkk.kkk.repository.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TopicRepository topicRepository;

    public DataInitializer(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public void run(String... args) {
        Topic topic = new Topic("AI 판사가 결정하는 당신의 결혼식 축의금!", "wedding-gift");

        Question question1 = new Question("우리, 얼마나 밀착 중이야?", topic);
        question1.getAnswers().addAll(Arrays.asList(
                new Answer("거의 매일 얼굴 보는 사이", question1),
                new Answer("한 달에 한 번은 꼭 보는 사이", question1),
                new Answer("반기에 한 번, 마치 크리스마스처럼", question1),
                new Answer("특별한 날에만 깜짝 등장", question1),
                new Answer("그냥 풍경 같은 존재", question1)
        ));

        Question question2 = new Question("이 친구의 생일은 언제지?", topic);
        question2.getAnswers().addAll(Arrays.asList(
                new Answer("케이크를 준비하는 날!", question2),
                new Answer("한 달 전부터 준비해", question2),
                new Answer("페이스북이 알려줘", question2),
                new Answer("생일이 있었나...?", question2),
                new Answer("그냥 지나가는 또 하루", question2)
        ));

        Question question3 = new Question("결혼 소식을 들었을 때, 너의 첫 반응은?", topic);
        question3.getAnswers().addAll(Arrays.asList(
                new Answer("이미 예견된 미래", question3),
                new Answer("와! 정말 축하해!", question3),
                new Answer("헉, 진짜? 실화야?", question3),
                new Answer("결혼이 무슨 색깔이야?", question3)
        ));

        Question question4 = new Question("우리 관계를 음식에 비유한다면?", topic);
        question4.getAnswers().addAll(Arrays.asList(
                new Answer("따뜻한 수프 같은 존재", question4),
                new Answer("간간히 생각나는 디저트", question4),
                new Answer("강렬한 매운맛 같은 인연", question4),
                new Answer("가끔 필요한 소금 같은 존재", question4),
                new Answer("음... 맛보지 않은 새로운 메뉴?", question4)
        ));

        Question question5 = new Question("결혼식 참석, 내 마음은 어때?", topic);
        question5.getAnswers().addAll(Arrays.asList(
                new Answer("결혼식? 거기에 내가 빠질 수 없지!", question5),
                new Answer("친구 따라 강남 가기", question5),
                new Answer("마음은 여기저기", question5),
                new Answer("관심 밖의 이야기", question5)
        ));

        topic.getQuestions().addAll(Arrays.asList(question1, question2, question3, question4, question5));

        topicRepository.save(topic);
    }
}

