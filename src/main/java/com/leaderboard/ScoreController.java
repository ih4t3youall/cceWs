package com.leaderboard;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

	private Score highScore = new Score();
	
	 @RequestMapping("/highscore")
	 public Score getHighScore() {
		 System.out.println("GET called - " + LocalTime.now());
	        return highScore;
	 }
	 
	 @RequestMapping(value = "/highscore", method = RequestMethod.POST)
	 public void setHighScore(@RequestBody Score score){
		 highScore.setName(score.getName());
		 highScore.setScore(score.getScore());
		 System.out.println("POST called - Name: " + score.getName() + " Score: " + score.getScore() + " - " + LocalTime.now());
	 }
}
