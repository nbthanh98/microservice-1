package com.thanhnb.authservice.controller;

import com.thanhnb.authservice.dto.UserSignupForm;
import com.thanhnb.authservice.model.UserEntity;
import com.thanhnb.authservice.model.UserRole;
import com.thanhnb.authservice.repository.UserRepository;
import com.thanhnb.authservice.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @RequestMapping(value = {"/signup"}, method = RequestMethod.POST)
    public ResponseEntity<?> signup(@RequestBody UserSignupForm userSignupForm) {
        // check email exist

        // create new user
        // Creating user's account
        UserEntity user = new UserEntity(userSignupForm.getUserName(), userSignupForm.getEmail(),
                new BCryptPasswordEncoder().encode(userSignupForm.getPassword()));

        user = userRepository.save(user);

        // default ROLE USER
        UserRole userRole = new UserRole();
        userRole.setUserId(user.getId());
        userRole.setRoleId(1L);

        userRoleRepository.save(userRole);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
}
