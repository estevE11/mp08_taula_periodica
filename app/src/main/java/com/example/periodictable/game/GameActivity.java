package com.example.periodictable.game;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.periodictable.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private int score = 0;
    private Question current_question;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setTitle("Game");
        this.nextQuestion();
    }

    @SuppressLint("SetTextI18n")
    private void nextQuestion() {
        current_question = Question.generateQuestion();
        ((TextView)findViewById(R.id.textView_question)).setText(current_question.getQuestionText() + "?");

        String[] answers = current_question.getAnswers();
        ((RadioButton)findViewById(R.id.radioBtn1)).setText(answers[0]);
        ((RadioButton)findViewById(R.id.radioBtn2)).setText(answers[1]);
        ((RadioButton)findViewById(R.id.radioBtn3)).setText(answers[2]);
        this.uncheck();

        findViewById(R.id.btn_submit).setOnClickListener(this);
    }

    public void checkAnswer(int i) {
        if(current_question.getCorrectAnswerIndex() == i) {
            this.scoreUp();
            this.nextQuestion();
        } else {
            Intent intent = new Intent(getApplicationContext(), GameResultActivity.class);
            intent.putExtra("score", this.score);
            this.score = 0;
            startActivity(intent);
        }
    }

    public void onClick(View v) {
        RadioGroup rb = ((RadioGroup)findViewById(R.id.radioGroup_answer));
        int id = ((RadioButton)findViewById(rb.getCheckedRadioButtonId())).getId();

        int idx = -1;

        if(id == findViewById(R.id.radioBtn1).getId()) idx = 0;
        if(id == findViewById(R.id.radioBtn2).getId()) idx = 1;
        if(id == findViewById(R.id.radioBtn3).getId()) idx = 2;

        checkAnswer(idx);
    }

    private void uncheck() {
        ((RadioButton)findViewById(R.id.radioBtn1)).setChecked(false);
        ((RadioButton)findViewById(R.id.radioBtn2)).setChecked(false);
        ((RadioButton)findViewById(R.id.radioBtn3)).setChecked(false);
    }

    private void scoreUp() {
        this.score++;
        ((TextView)findViewById(R.id.textView_score)).setText(this.score + "");
    }
}
