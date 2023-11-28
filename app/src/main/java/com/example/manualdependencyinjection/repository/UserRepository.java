package com.example.manualdependencyinjection.repository;

import com.example.manualdependencyinjection.data.local_data.UserLocalDataSource;
import com.example.manualdependencyinjection.data.remote_data.UserRemoteDataSource;

public class UserRepository {
    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    public UserRepository(UserLocalDataSource userLocalDataSource, UserRemoteDataSource userRemoteDataSource) {
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }
}
