package com.github.member.service;


import com.github.member.dto.JoinDTO;
import com.github.member.entity.UserEntity;
import com.github.member.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void joinProcess(JoinDTO joinDTO){

        String email = joinDTO.getEmail();
        String password = joinDTO.getPassword();

        Boolean isExist = userRepository.existsByemail(email);

        if (isExist) {

            return;
        }

        UserEntity data = new UserEntity();
        data.setEmail(email);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        userRepository.save(data);


    }
}
