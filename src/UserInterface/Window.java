
package UserInterface;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Window extends JFrame {
    private Container container;
    private static Window instance = null;
    private Window(){
        super("Hotel Luton");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) (screen.getHeight() * 0.7);
        int width = (int) (screen.getWidth() * 0.7);
        setSize(new Dimension(width, height));
        this.container = getContentPane();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setResizable(false);
        setVisible(true);
    }
       
    public static Window getWindow(){
        if(instance == null){
            instance = new Window();
        }
        return instance;
    }
    
    public Container getContainer(){
        return this.container;
    }
}
