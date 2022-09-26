import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Image;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//WE DID IT (8=D) 
//:-D we did it 

public class main extends JPanel implements ActionListener{

    public static void main(String args[]){
    
        new main();

        JFrame f = new JFrame();
        main panel = new main();

        f.add(panel);   //set up window
        f.setSize(1200, 800);   //window sizing
        f.setVisible(true); //Window visibility to see
    }

    //for button randomization
    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    
        int count = 1; //set count to 1 first bc the deck starts at 1.png

        ///creating an array with 1-52 numbers for the deck
        int cardArr[] = new int[53];

        for(int k = 0; k < 53; k++){ //for loop that goes through entire deck
            cardArr[k] = k;
        }

        //shuffling cards to random places 
        shuffle(cardArr, 52);

        //set cards into position of rows and columns
        for(int r = 0; r < 4; r++){ //goes through the rows
            for(int c = 1; c <= 13; c++) { //goes through the columns
                ImageIcon card = new ImageIcon("Cards/" + cardArr[count] + ".png"); //gets the png card from the file
                count++; //increment count to get each card
                Image img = card.getImage(); //get the image from the png card
                Image imgScale = img.getScaledInstance(70, 110, Image.SCALE_SMOOTH); //scale the picture 
                ImageIcon scaledIcon = new ImageIcon(imgScale); //scale to fit the box
                scaledIcon.paintIcon(this, g2d ,20 + (c * 80),40 + (r * 120)); //prints it
            }   
        }
        
    }

    //function to call to shuffle cards
    public void shuffle(int ar[], int cards){
        Random rand = new Random();

        for (int i = 1; i < cards; i++) { //for cards in array create random placement
            int r = i + rand.nextInt(53 - i); //randomizes the cards. 53 - i so that it wont take duplicates
            //swaps the cards positions (shuffling)
            int temp = ar[r]; 
            ar[r] = ar[i];
            ar[i] = temp;
        }
    }

    public main(){

        setBackground(new java.awt.Color(35,120,35));//set background color
        setLayout(null);    // to set button position 
        JButton b = new JButton("Randomize"); //initialize button
        b.addActionListener(this); //when user clicks
        b.setSize(300, 40);//size of button
        b.setLocation(470, 560);//button location
        add(b); //adding button to panel

    }

}
