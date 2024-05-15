package com.github.member.Controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginoutController {

    @PostMapping("/logout")
    public void logout(HttpServletResponse response) {
        // 클라이언트 측에서 JWT 삭제를 요청합니다.
        // 쿠키에서 JWT 삭제
        response.addHeader("Set-Cookie", "token=; HttpOnly; Path=/; Expires=Thu, 01 Jan 1970 00:00:00 GMT");

        // 추가적인 로그아웃 처리를 여기에 추가할 수 있습니다.
        // 예를 들어, 로그아웃 로그 기록, 보안 로그 남기기 등

        response.setStatus(HttpServletResponse.SC_OK);
    }
}

