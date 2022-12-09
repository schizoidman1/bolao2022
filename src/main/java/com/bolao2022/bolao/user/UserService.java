package com.bolao2022.bolao.user;

import com.bolao2022.bolao.registration.token.TokenConfirmation;
import com.bolao2022.bolao.registration.token.TokenConfirmationService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final TokenConfirmationService tokenConfirmationService;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Usuario com email "+email+" nao encontrado."));
    }

    public String cadastraUsuario(AppUser user){
        boolean userExists = userRepository.findByEmail(user.getEmail()).isPresent();
        if (userExists) {
            //TODO if email not confirmed send confirmation email
            throw new IllegalStateException("Email já cadastrado.");
        }



        String encodedSenha = bCryptPasswordEncoder.encode(user.getPassword());

        user.setSenha(encodedSenha);

        userRepository.save(user);

        String token = UUID.randomUUID().toString();

        TokenConfirmation confirmationToken = new TokenConfirmation(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                user
        );
        tokenConfirmationService.saveTokenConfirmation(confirmationToken);



        return token;
    }

    public int enableUser(String email) {
        return userRepository.enableUser(email);
    }
}
