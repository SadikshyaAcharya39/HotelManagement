
import UserInterface.LoginForm;
import UserInterface.Window;
import java.awt.Container;


public class Main {
	public static void main (String[] args) {
		try {
                    new LoginForm().setVisible(true);
              }catch (Exception e) {
			e.printStackTrace();
		}
	}
}
