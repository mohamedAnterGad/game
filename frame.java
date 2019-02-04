package firstGame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame {
	screen screen;
	Ball ball;
	
	
	
	public frame (Ball ball) {
		super("game");
		setLayout(null);
		setVisible(true);
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ball = ball;
		screen = new screen();
		screen.setBounds(0,0,1000,1000);
add(screen);
		
		
	}
public class screen extends JLabel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 1000, 1000);
		
		g.drawImage(ball.play_ball, (int)ball.x_pos,(int) ball.y_pos,null);
	}
}
}
