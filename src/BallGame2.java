
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; //小球的横坐标
	double y = 100; //小球的纵坐标
	
	double degree = 3.14/3; //弧度60度
	
	//画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被重画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		//碰到上下边界
		if(y>500-40-30||y<40+40){ //500是窗口高度 40是边框长度  最后一个40是标题栏宽度
			degree = -degree; //关于X轴对称
		}
		//碰到左右边界
		if(x<40||x>856-40-30){
			 degree = 3.14-degree; //关于Y轴对称
		}
	}
	
	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//窗口重画,每秒25次
		while(true){
			repaint();
			try{
				Thread.sleep(40);//40ms 1秒=1000毫秒，大约1秒画25次窗口
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	//main方法是程序执行的入口
	public static void main(String[] args){
		System.out.println("这是一个桌球游戏项目");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}

}
