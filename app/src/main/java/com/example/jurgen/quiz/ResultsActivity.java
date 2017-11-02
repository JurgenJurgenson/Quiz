package com.example.jurgen.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    public void seeAnswers(View view)
    {
        Intent lol = new Intent (this, AnswersActivity.class);
        startActivity(lol);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("Final score");

        mFinalScore.setText("You got " + score + "points");

        if (score == 9)
        {
            mGrade.setText("How u do dis");
        }
        if (score == 8)
        {
            mGrade.setText("Cheats.exe?");
        }
        if (score == 7)
        {
            mGrade.setText("You did ok");
        }
        if (score <= 6)
        {
            mGrade.setText("Do not try again.");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });
    }
}
