package com.example.manualdependencyinjection;

import com.example.manualdependencyinjection.data.remote_data.LoginData;
import com.example.manualdependencyinjection.repository.UserRepository;

public class LoginContainer {
    private final UserRepository userRepository;

    public LoginContainer(UserRepository userRepository) {
        this.userRepository = userRepository;
        loginViewModelFactory = new LoginViewModelFactory(userRepository);
    }

    public LoginData loginData = new LoginData();

    public LoginViewModelFactory loginViewModelFactory;
}
