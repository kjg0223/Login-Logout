package com.github.member.Controller;


import com.github.member.dto.JoinDTO;
import com.github.member.service.JoinService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {

        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String join(JoinDTO joinDto) {

        joinService.joinProcess(joinDto);

        return "회원가입이 완료되었습니다.";
    }
}
