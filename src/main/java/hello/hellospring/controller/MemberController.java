package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//스프링 빈으로 자동 등록
@Controller
public class MemberController {
    private final MemberService memberService;

    //멤버컨트롤러가 생성될때 스프링 빈에 등록되어있는 멤버서비스 객체를 넣어줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
