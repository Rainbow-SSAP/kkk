package com.kkk.kkk.repository;

import com.kkk.kkk.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    Topic findByKeyword(String keyword);
}
