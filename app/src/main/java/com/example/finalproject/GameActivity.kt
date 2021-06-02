package com.example.finalproject

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class GameActivity : AppCompatActivity() {
    var answer1: Button? = null
    var answer2: Button? = null
    var answer3: Button? = null
    //var answer4: Button? = null
    var score: TextView? = null
    var question: TextView? = null
    private val mQuestions: Questions = Questions()

    // 問題答案
    private var mAnswer: String? = null

    // 初始分數
    private var mScore = 0

    private var mCount = 0

    //private var questionsList: String? = null
    // 問題題目數
    private val mQuestionsLength: Int = mQuestions.mQuestions.size
    var r: Random? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        r = Random()

        //var qlist : Array<Int>? = null

        answer1 = findViewById(R.id.answer1)
        answer2 = findViewById(R.id.answer2)
        answer3 = findViewById(R.id.answer3)
        //answer4 = findViewById(R.id.answer4)
        score = findViewById(R.id.score)
        question = findViewById(R.id.question)
        score?.setText("Score: $mScore")
        updateQuestion(r!!.nextInt(mQuestionsLength))
        answer1?.setOnClickListener(View.OnClickListener {
            mCount++
            if (mScore == 10 || mCount == 10) {
                gameOver()
            }
            if (answer1?.getText() === mAnswer) {
                mScore++
                score?.setText("Score: $mScore")
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答對", Toast.LENGTH_SHORT).show()
            } else {
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答錯", Toast.LENGTH_SHORT).show()
            }
        })
        answer2?.setOnClickListener(View.OnClickListener {
            mCount++
            if (mScore == 10 || mCount == 10) {
                gameOver()
            }
            if (answer2?.getText() === mAnswer) {
                mScore++
                score?.setText("Score: $mScore")
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答對", Toast.LENGTH_SHORT).show()
            } else {
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答錯", Toast.LENGTH_SHORT).show()
            }
        })
        answer3?.setOnClickListener(View.OnClickListener {
            mCount++
            if (mScore == 10 || mCount == 10) {
                gameOver()
            }
            if (answer3?.getText() === mAnswer) {
                mScore++
                score?.setText("Score: $mScore")
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答對", Toast.LENGTH_SHORT).show()
            } else {
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答錯", Toast.LENGTH_SHORT).show()
            }
        })
        /*answer4?.setOnClickListener(View.OnClickListener {
            mCount++
            if(mScore == 10 || mCount == 10){
                gameOver()
            }
            if (answer4?.getText() === mAnswer) {
                mScore++
                score?.setText("Score: $mScore")
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答對", Toast.LENGTH_SHORT).show()
                //gameOver()
            } else {
                updateQuestion(r!!.nextInt(mQuestionsLength))
                Toast.makeText(this, "答錯", Toast.LENGTH_SHORT).show()
                //gameOver()
            }
        })*/
        //gameOver()
    }

    /**
     * 取得題庫中的問題、選項與答案
     * @param num
     */
    private fun updateQuestion(num: Int) {
        question?.setText(mQuestions.getQuestion(num))
        answer1?.setText(mQuestions.getChoice1(num))
        answer2?.setText(mQuestions.getChoice2(num))
        answer3?.setText(mQuestions.getChoice3(num))
        //answer4?.setText(mQuestions.getChoice4(num))
        mAnswer = mQuestions.getCorrectAnswer(num)
    }
    //    @Override
    //    public void onClick(View view) {
    //        switch (view.getId()) {
    //            case R.id.answer1:
    //                if (answer1.getText() == mAnswer) {
    //                    mScore++;
    //                    score.setText("Score: " + mScore);
    //                    updateQuestion(r.nextInt(mQuestionsLength));
    //                } else {
    //                    gameOver();
    //                }
    //                break;
    //
    //            case R.id.answer2:
    //                if (answer2.getText() == mAnswer) {
    //                    mScore++;
    //                    score.setText("Score: " + mScore);
    //                    updateQuestion(r.nextInt(mQuestionsLength));
    //                } else {
    //                    gameOver();
    //                }
    //                break;
    //
    //            case R.id.answer3:
    //                if (answer3.getText() == mAnswer) {
    //                    mScore++;
    //                    score.setText("Score: " + mScore);
    //                    updateQuestion(r.nextInt(mQuestionsLength));
    //                } else {
    //                    gameOver();
    //                }
    //                break;
    //
    //            case R.id.answer4:
    //                if (answer4.getText() == mAnswer) {
    //                    mScore++;
    //                    score.setText("Score: " + mScore);
    //                    updateQuestion(r.nextInt(mQuestionsLength));
    //                } else {
    //                    gameOver();
    //                }
    //                break;
    //
    //        }
    //    }
    /**
     * 遊戲結束後，顯示詢問視窗，
     * 選擇要重新開始或是離開遊戲
     */
    private fun gameOver() {
        val alertDialogBuilder: AlertDialog.Builder = AlertDialog.Builder(this@GameActivity)
        alertDialogBuilder
            .setMessage("遊戲結束! 你的分數是$mScore 分")
            .setCancelable(false)
            .setPositiveButton("再玩一次",
                DialogInterface.OnClickListener { dialogInterface, i -> startActivity(Intent(applicationContext, GameActivity::class.java)) })
        //.setNegativeButton("EXIT",
        //DialogInterface.OnClickListener { dialogInterface, i -> finish() })
        val alertDialog: AlertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}