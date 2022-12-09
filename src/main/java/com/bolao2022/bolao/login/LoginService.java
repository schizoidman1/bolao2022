package com.bolao2022.bolao.login;

import com.bolao2022.bolao.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    private final UserService userService;

}
