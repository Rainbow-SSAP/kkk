package com.kkk.kkk.controller;

import com.kkk.kkk.dto.QuestionnaireResponseDto;
import com.kkk.kkk.service.WeddingGiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class WeddingGiftController {

    private final WeddingGiftService weddingGiftService;

    @Autowired
    public WeddingGiftController(WeddingGiftService weddingGiftService) {
        this.weddingGiftService = weddingGiftService;
    }

    @GetMapping("/wedding-gift")
    public ResponseEntity<?> getWeddingGiftQuestionnaire() {
        QuestionnaireResponseDto questionnaire = weddingGiftService.getWeddingGiftQuestionnaire();
        if (questionnaire == null || questionnaire.getQuestions().isEmpty()) {
            return new ResponseEntity<>("데이터를 찾을 수 없습니다.", HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(questionnaire);
        }
    }
}
