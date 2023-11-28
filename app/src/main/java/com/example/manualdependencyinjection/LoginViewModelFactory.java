package com.example.manualdependencyinjection;

import com.example.manualdependencyinjection.repository.UserRepository;
import com.example.manualdependencyinjection.view_model.LoginViewModel;

public class LoginViewModelFactory implements Factory<LoginViewModel> {
    private final UserRepository userRepository;

    public LoginViewModelFactory(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginViewModel create() {
        return new LoginViewModel(userRepository);
    }
}
