import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class frame extends JFrame {
    frame(){
    this.setSize(500,500);
    this.setLayout(null);
    this.setBackground(Color.pink);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Button button = new Button();
    this.add(button);
    button.setBounds(200,175,100,100);
    button.setVisible(true);
    
    JLabel label = new JLabel("Press to Start");
    label.setBounds(210,100,100,100);
   
    this.add(label);
    label.setVisible(true);
    
    JLabel label1 = new JLabel("Once clicked, return to game immediately", SwingConstants.CENTER);
    label1.setVerticalAlignment(SwingConstants.CENTER);
    label1.setBounds(100,70,320,70);
    label1.setFont(new Font("Serif", Font.ITALIC, 13));
    
    
    this.add(label1);
    label1.setVisible(true);


        
    button.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            try {
                Robot robot = new Robot();
                while(true){
                    Thread.sleep(1000);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(1000);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(1000);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.delay(1000);
                }
                
            } catch (AWTException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
           
        }
    });

    }
}
