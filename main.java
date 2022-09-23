import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.lang.Object;
import java.util.ArrayList;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Random;
import java.awt.PointerInfo;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLabel; 
import java.io.File;

public class main {

    BufferedImage[] allImages;

    public static void main(String args[]){
    
        new main();
    }

public main(){
    File path =  new File("PNG-cards-1.3");

    File[] allFiles = path.listFiles();

    allImages = new BufferedImage[allFiles.length];

    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new GridLayout(1,1));
    window.setSize(1000,1000);

    JLabel label[] = new JLabel[allFiles.length];

    for (int i = 0; i < allFiles.length; i++){
        try{
            allImages[i] = ImageIO.read(allFiles[i]);
            label[i] = new JLabel();

            ImageIcon icon = new ImageIcon(allImages[i]);
            //label[i].setHorizontalAlignment(10);
            label[i].setIcon(icon);
            window.add(label[i]);
        } catch(IOException e) {

        }
        window.pack();
        window.setVisible(true);
    }
    }
    }
    
    /* 
    @Override 
    public void paint(Graphics g){
        super.paint(g);

      int xImagePlace= (int)Math.floor(Math.random() * 255); 
      int yImagePlace= (int)Math.floor(Math.random() * 255); 
    }
*/
  /*  public static void main(String args[]){
    
        new main();

        System.out.println("TUAN LOVES DICKS");


            //old code from bar graph 
            JButton b = new JButton("Randomize");

            b.setSize(300, 40);
            b.setLocation(200, 500);

            JFrame f = new JFrame();
            main panel = new main();
            f.add(b);
            f.add(panel);
            f.setSize(700,700);
            f.setVisible(true);
            ///////////////////
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    } */
 
//}


    

