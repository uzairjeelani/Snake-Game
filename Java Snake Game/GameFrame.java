import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    GameFrame() {

        // GamePanel panel = new GamePanel(); // can get rid of this by adding it in line 9

        this.add(new GamePanel()); // could use this as another shortcut as well
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // makes components fit around frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    
    
    }

}
