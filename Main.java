package firstGame;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
	public static void main(String[] args) {
	BufferedImage play_ball = null;
	try {
		play_ball = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("firstGame/ball_1.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	Ball ball =new Ball(play_ball,100,900,1000,1000);
	frame frame = new frame(ball);
	long lastFrame = System.currentTimeMillis();
	while (true) {
		long thisFrameTime = System.currentTimeMillis();
		float timeSinceLastFrame =(float) (thisFrameTime-lastFrame)/1000;
		lastFrame = thisFrameTime;
		ball.update(timeSinceLastFrame);
		frame.screen.repaint();
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	}
	}}
