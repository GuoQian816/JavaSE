
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; //С��ĺ�����
	double y = 100; //С���������
	boolean right = true; //����
	
	//�����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ��ػ���һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right){
			x = x + 10;
		}else{
			x = x - 10;
		}
		
		if(x>856-30-40){ //30��С���ֱ�� 40�����ӱ߿�ĳ���
			right = false;
		}
		if(x<40){
			right = true;
		}
		
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�����ػ�,ÿ��25��
		while(true){
			repaint();
			try{
				Thread.sleep(40);//40ms 1��=1000���룬��Լ1�뻭25�δ���
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	//main�����ǳ���ִ�е����
	public static void main(String[] args){
		System.out.println("����һ��������Ϸ��Ŀ");
		BallGame game = new BallGame();
		game.launchFrame();
	}

	

}