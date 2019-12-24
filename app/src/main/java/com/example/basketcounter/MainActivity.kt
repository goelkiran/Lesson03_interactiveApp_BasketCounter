package com.example.basketcounter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun displayScoreTeamA() {
        txt_vw_team_a_score.text = "" + scoreA
    }

    fun addForTeamA3(view: View) {
        scoreA += 3
        displayScoreTeamA()
    }

    fun addForTeamA2(view: View) {
        scoreA += 2
        displayScoreTeamA()
    }

    fun addForTeamA1(view: View) {
        scoreA += 1
        displayScoreTeamA()
    }

    private fun displayScoreTeamB() {
        txt_vw_team_b_score.text = "" + scoreB
    }

    fun addForTeamB3(view: View) {
        scoreB += 3
        displayScoreTeamB()
    }

    fun addForTeamB2(view: View) {
        scoreB += 2
        displayScoreTeamB()
    }

    fun addForTeamB1(view: View) {
        scoreB += 1
        displayScoreTeamB()
    }

    fun resetScore(view: View) {
        scoreA = 0
        scoreB = 0
        displayScoreTeamA()
        displayScoreTeamB()
    }

}
