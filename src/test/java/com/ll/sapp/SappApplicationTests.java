package com.ll.sapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SappApplicationTests {

  @Autowired
  private QuestionRepository questionRepository;

  @Test
  void testJpa() {
    // 1st
//        Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // 두번째 질문 저장

    // 하나씩 주석해제하고 실행시키기
    // 2nd
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Question q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());

    // 3rd
    // Optional: 0~1개의 자료를 가질 수 있는 자료구조
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if (oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }

    // 4th
//        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1, q.getId());

    // 5th
//        Question q = this.questionRepository.findBySubjectAndContent(
//                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//        assertEquals(1, q.getId());

    // 6th
//    List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//    Question q = qList.get(0);
//    assertEquals("sbb가 무엇인가요?", q.getSubject());
  }

}
