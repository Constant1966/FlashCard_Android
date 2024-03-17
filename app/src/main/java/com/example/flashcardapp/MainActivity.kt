package com.example.flashcardapp

import android.annotation.SuppressLint
import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import com.example.flashcardapp.R.id.flashcard_question

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(flashcard_question)
        val flashcardAnswer_1 = findViewById<TextView>(R.id.flashcard_answer_1)
        val flashcardAnswer_2 = findViewById<TextView>(R.id.flashcard_answer_2)
        val flashcardAnswer_3 = findViewById<TextView>(R.id.flashcard_answer_3)

        val icon_eye_1 = findViewById<ImageView>(R.id.toggle_choices_visibility)
        val icon_eye_2 = findViewById<ImageView>(R.id.toggle_choices_visibility_2)

        val isShowingAnswers = true


        flashcardAnswer_1.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            findViewById<View>(R.id.flashcard_answer_1).setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
            findViewById<View>(R.id.flashcard_answer_3).setBackgroundColor(getResources().getColor(R.color.my_green, null))

        }

        flashcardAnswer_2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer_2).setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
            findViewById<View>(R.id.flashcard_answer_3).setBackgroundColor(getResources().getColor(R.color.my_green, null))
        }

        flashcardAnswer_3.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer_3).setBackgroundColor(getResources().getColor(R.color.my_green, null))

        }


        if (isShowingAnswers)
        {
            icon_eye_2.setOnClickListener {
                icon_eye_1.visibility = View.VISIBLE
                icon_eye_2.visibility = View.INVISIBLE
                findViewById<ImageView>(R.id.toggle_choices_visibility_2).setImageResource(R.drawable.iconmonstr_eye_off_filled)
                flashcardAnswer_1.visibility = View.INVISIBLE
                flashcardAnswer_2.visibility = View.INVISIBLE
                flashcardAnswer_3.visibility = View.INVISIBLE

                findViewById<View>(R.id.flashcard_answer_1).setBackgroundColor(getResources().getColor(R.color.background_text, null))
                findViewById<View>(R.id.flashcard_answer_2).setBackgroundColor(getResources().getColor(R.color.background_text, null))
                findViewById<View>(R.id.flashcard_answer_3).setBackgroundColor(getResources().getColor(R.color.background_text, null))
            }

        }

        if (isShowingAnswers)
            {
                icon_eye_1.setOnClickListener {
                    findViewById<ImageView>(R.id.toggle_choices_visibility).setImageResource(R.drawable.iconmonstr_eye_lined)
                    icon_eye_1.visibility = View.INVISIBLE
                    icon_eye_2.visibility = View.VISIBLE
                    flashcardAnswer_1.visibility = View.VISIBLE
                    flashcardAnswer_2.visibility = View.VISIBLE
                    flashcardAnswer_3.visibility = View.VISIBLE


                    findViewById<View>(R.id.flashcard_answer_1).setBackgroundColor(getResources().getColor(R.color.background_text, null))
                    findViewById<View>(R.id.flashcard_answer_2).setBackgroundColor(getResources().getColor(R.color.background_text, null))
                    findViewById<View>(R.id.flashcard_answer_3).setBackgroundColor(getResources().getColor(R.color.background_text, null))
                }
            }






    }


}