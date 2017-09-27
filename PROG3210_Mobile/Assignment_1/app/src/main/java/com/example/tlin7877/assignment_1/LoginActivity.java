package com.example.tlin7877.assignment_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */


    // UI references.
    private EditText mEmail;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        // Set up the login form.
        mEmail = (EditText) findViewById(R.id.txtEmail_sign_in);
        mPasswordView = (EditText) findViewById(R.id.txtPassword_sign_in);

        Button mEmailSignInButton = (Button) findViewById(R.id.btnSignIn_sign_in);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String hardCodedEmail = "email@email.com";
                String hardCodedPwd = "password";
                if (mEmail.getText().toString().equals(hardCodedEmail) && mPasswordView.getText().toString().equals(hardCodedPwd)){
                    Toast.makeText(LoginActivity.this,"Hello", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"Username and password is NOT correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mLoginFormView = findViewById(R.id.frm_sign_in);
        mProgressView = findViewById(R.id.login_progress);
    }

}

