package com.asad.loginandsignup_cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button mSignUpButton,mSignInButton;
    private LinearLayout mSignInLayout,mSignupLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSignUpButton = findViewById(R.id.signup_id);
        mSignInButton = findViewById(R.id.sign_in_id);
        mSignInLayout = findViewById(R.id.signIn_linear_layout);
        mSignupLayout = findViewById(R.id.signUp_linear_layout);


        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignUpButton.setBackground(getResources().getDrawable(R.drawable.login));
                mSignUpButton.setTextColor(getResources().getColor(R.color.white));
                mSignInButton.setBackground(getResources().getDrawable(R.drawable.login_button_back_two_side_round));
                mSignInButton.setTextColor(getResources().getColor(R.color.white_50));

                mSignupLayout.setVisibility(View.VISIBLE);
                mSignInLayout.setVisibility(View.GONE);
            }
        });

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignUpButton.setBackground(getResources().getDrawable(R.drawable.white_rectangle));
                mSignUpButton.setTextColor(getResources().getColor(R.color.white_50));
                mSignInButton.setBackground(getResources().getDrawable(R.drawable.login));
                mSignInButton.setTextColor(getResources().getColor(R.color.white));

                mSignupLayout.setVisibility(View.GONE);
                mSignInLayout.setVisibility(View.VISIBLE);
            }
        });

    }
}