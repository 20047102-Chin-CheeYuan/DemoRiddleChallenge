package sg.edu.rp.c346.id20047102.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        String msg = "";
        if (questionsSelected.equals("Q1")) {
            msg = questionsSelected + " answer is: Queue";
        } else {
            msg = questionsSelected + " answer is: Gone";
        }
        tvAnswer.setText(msg);

    }
}