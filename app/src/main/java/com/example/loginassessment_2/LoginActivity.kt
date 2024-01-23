package com.example.loginassessment_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginassessment_2.interfaces.LoginForm
import com.example.loginassessment_2.ui.theme.LoginAssessment_2Theme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoginAssessment_2Theme {
                LoginForm()
            }

        }
    }
}