package com.example.periodictable.game;

import com.example.periodictable.Element;
import com.example.periodictable.Elements;

import java.util.Random;

public class Question {
    private Random r = new Random();

    private String[] answers;
    private int correct_answer_i = 0;
    private String question_text = "";

    public void genQuestion() {
        int param = r.nextInt(4);
        this.genAnswersAndText(param);
    }

    private void genAnswersAndText(int param) {
        Element el = Elements.elements[r.nextInt(Elements.elements.length)];
        this.genQuestionText(el.getAtomicNumber(), param);
        this.correct_answer_i = r.nextInt(3);

        this.answers = new String[3];
        for (int i = 0; i < this.answers.length; i++) {
            Element to_add = Elements.getRandomElement();
            while(Elements.getParameterById(to_add.getAtomicNumber(), param).equals(Elements.getParameterById(el.getAtomicNumber(), param)))
                to_add = Elements.getRandomElement();
            this.answers[i] = Elements.getParameterById(to_add.getAtomicNumber(), param);
        }
        this.answers[this.correct_answer_i] = Elements.getParameterById(el.getAtomicNumber(), param);
    }

    private void genQuestionText(int elID, int param) {
        Element el = Elements.elements[elID];
        boolean f = param > 1;
        this.question_text = "Quin" + (f ? "a" : "") + " es " + (f ? "la" : "el") + " " + Elements.getParameterName(param) + " de " + el.getName() + " (" + el.getSymbol() + ")";
    }

    public static Question generateQuestion() {
        Question q = new Question();
        q.genQuestion();
        return q;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correct_answer_i;
    }

    public String getQuestionText() {
        return question_text;
    }
}
