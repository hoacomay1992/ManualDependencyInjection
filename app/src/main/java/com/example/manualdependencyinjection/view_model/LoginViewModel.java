package com.example.manualdependencyinjection.view_model;

import com.example.manualdependencyinjection.repository.UserRepository;

public class LoginViewModel {
    private final UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
