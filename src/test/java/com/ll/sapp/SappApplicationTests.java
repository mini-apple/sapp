package com.ll.sapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class SappApplicationTests {

  @Autowired
  private QuestionRepository questionRepository;

  @Autowired
  private AnswerRepository answerRepository;

  @Test
  @Transactional
    // 테스트 환경에서는 트랜젹션이 달린 테스트케이스는 기본적으로 자동롤백 됨
    // @Rollback(false) 이렇게 하면 트랜잭션 성공 후 자동롤백이 되지 않음
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

    // 7th
//    Optional<Question> oq = this.questionRepository.findById(1);
//    assertTrue(oq.isPresent());
//    Question q = oq.get();
//    q.setSubject("수정된 제목");
//    this.questionRepository.save(q);

    // 8th
//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());

    // 9th
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);

    // 10th
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());

    // 11th
  Optional<Question> oq = this.questionRepository.findById(2);
  assertTrue(oq.isPresent());
  Question q = oq.get();

  List<Answer> answerList = q.getAnswerList();

  assertEquals(1, answerList.size());
  assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
  }
}
