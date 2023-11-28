package com.example.manualdependencyinjection;

import com.example.manualdependencyinjection.data.local_data.UserLocalDataSource;
import com.example.manualdependencyinjection.data.remote_data.UserRemoteDataSource;
import com.example.manualdependencyinjection.repository.UserRepository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppContainer {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private UserLocalDataSource userLocalDataSource = new UserLocalDataSource();
    private UserRemoteDataSource userRemoteDataSource = new UserRemoteDataSource(retrofit);
    public UserRepository userRepository = new UserRepository(userLocalDataSource, userRemoteDataSource);
    
    // LoginContainer will be null when the user is NOT in the login flow
    public LoginContainer loginContainer;
}
