package com.example.manualdependencyinjection.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.manualdependencyinjection.AppContainer;
import com.example.manualdependencyinjection.LoginContainer;
import com.example.manualdependencyinjection.R;
import com.example.manualdependencyinjection.application.DeApplication;
import com.example.manualdependencyinjection.data.local_data.UserLocalDataSource;
import com.example.manualdependencyinjection.data.remote_data.LoginData;
import com.example.manualdependencyinjection.data.remote_data.LoginService;
import com.example.manualdependencyinjection.data.remote_data.UserRemoteDataSource;
import com.example.manualdependencyinjection.repository.UserRepository;
import com.example.manualdependencyinjection.view_model.LoginViewModel;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {
    private LoginViewModel loginViewModel;
    private LoginData loginData;
    private AppContainer appContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        appContainer = ((DeApplication) getApplication()).appContainer;
        // Login flow has started. Populate loginContainer in AppContainer
        appContainer.loginContainer = new LoginContainer(appContainer.userRepository);
        loginViewModel = appContainer.loginContainer.loginViewModelFactory.create();
        loginData = appContainer.loginContainer.loginData;
    }

    @Override
    protected void onDestroy() {
        // Login flow is finishing
        // Removing the instance of loginContainer in the AppContainer
        appContainer.loginContainer = null;
        super.onDestroy();
    }
}