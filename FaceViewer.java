/**
* Test calss.
* @author Eyad AL-‘Amawi
*/ 
import javax.swing.JFrame;

public class FaceViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(450, 350);
        frame.setTitle("Face :)\n");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);

    }

}
