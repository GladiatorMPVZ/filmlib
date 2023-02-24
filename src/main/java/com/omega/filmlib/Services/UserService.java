package com.omega.filmlib.Services;
import com.omega.filmlib.Entity.Enums.ERole;
import com.omega.filmlib.Entity.User;
import com.omega.filmlib.Exceptions.UserExistenceException;
import com.omega.filmlib.Payload.Request.SignupRequest;
import com.omega.filmlib.Repository.UserRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final static Logger LOG = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public User createUser(SignupRequest userIn) {
        User user = new User();
        user.setEmail(userIn.getEmail());
        user.setUsername(userIn.getUsername());
        user.setPassword(passwordEncoder.encode(userIn.getPassword()));
        user.getRoles().add(ERole.ROLE_USER);

        try {
            LOG.info("Saving user {}", userIn.getEmail());
            return userRepository.save(user);
        } catch (Exception e) {
            LOG.error("Error during registration. {}",e.getMessage());
            throw new UserExistenceException("The user" + userIn.getUsername() + "already exist. Please check ypur credentials");
        }


    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
