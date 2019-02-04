package firstGame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Ball {
	AudioClip sound;
	float x_pos;
	float y_pos;
	float x_speed;
	float y_speed;
	BufferedImage play_ball;
	public Ball (BufferedImage play_ball,float x_pos,float y_pos,float x_speed,float y_speed) {
		this.x_pos = x_pos;
		this.y_pos =y_pos;
	    this.x_speed =x_speed;
	    this.y_speed = y_speed;
	    this.play_ball = play_ball;
	    URL url = Ball.class.getResource("miss.au");
	    sound =Applet.newAudioClip(url);
	}
void update (float time) {
	x_pos = x_pos + x_speed*time;
	y_pos = y_pos+y_speed*time;
	//if(x_pos > 1000) x_pos = -1000;
	//if(y_pos > 1000) y_pos = -50;
	if (x_pos<0 ||x_pos>1000- play_ball.getWidth()) {
		sound.play();
		x_speed*=-1;
	}
	if (y_pos<0 || y_pos>960-play_ball.getHeight()) {
		sound.play();
		y_speed*=-1;
	}
	
}
}
