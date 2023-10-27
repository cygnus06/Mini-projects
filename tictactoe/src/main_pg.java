import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class main_pg{
    public static void main(String args[]){
       xo obj = new xo(); 
    }
}
class xo implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel TitlePanel = new JPanel();
    JPanel ButtonPanel = new JPanel();
    JLabel text = new JLabel();
    JButton[] button = new JButton[9];
    boolean p1;
    xo(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800,800);
    frame.getContentPane().setBackground(new Color(46,2,60));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    text.setBackground(new Color(34,28,29));
    text.setForeground(new Color(239,255,7));
    text.setFont(new Font("Forte",Font.ITALIC,75));
    text.setHorizontalAlignment(JLabel.CENTER);
    text.setText("TIC-TAC-TOE");
    text.setOpaque(true);

    ButtonPanel.setLayout(new GridLayout(3,3));
    ButtonPanel.setBackground(new Color(180,250,255));
    
    for(int i=0;i<9;i++){
       button[i] = new JButton(); 
       ButtonPanel.add(button[i]);
       button[i].setFont(new Font("TimesRoman",Font.ITALIC,120));
       button[i].setFocusable(false);
       button[i].addActionListener(this);

    }
    TitlePanel.setLayout(new BorderLayout());
    TitlePanel.setBounds(0,0,800,100);
    TitlePanel.add(text);
    frame.add(TitlePanel,BorderLayout.NORTH);
    frame.add(ButtonPanel);

    Turn();
    }
    void Turn(){
    try{
    Thread.sleep(1500);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    if(random.nextInt(2)==0){
      p1 = true; 
      text.setText("X turn"); 
    }else{
      p1 = false; 
      text.setText("O turn");  
    }
    }
    void check(){
        if((button[0].getText()=="X") && (button[1].getText()=="X")&& (button[2].getText()=="X")) {
            x_winner(0,1,2);
        }
        if((button[3].getText()=="X") && (button[4].getText()=="X")&& (button[5].getText()=="X")) {
            x_winner(3,4,5);
        }
        if((button[8].getText()=="X") && (button[6].getText()=="X")&& (button[7].getText()=="X")) {
            x_winner(6,7,8);

        }
        if((button[0].getText()=="X") && (button[3].getText()=="X")&& (button[6].getText()=="X")) {
            x_winner(0,3,6);
        }
        if((button[1].getText()=="X") && (button[4].getText()=="X")&& (button[7].getText()=="X")) {
            x_winner(1,4,7);
        }
        if((button[2].getText()=="X") && (button[5].getText()=="X")&& (button[8].getText()=="X")) {
            x_winner(2,5,8);
        }
        if((button[0].getText()=="X") && (button[4].getText()=="X")&& (button[8].getText()=="X")) {
            x_winner(0,4,8);
        }
        if((button[2].getText()=="X") && (button[4].getText()=="X")&& (button[6].getText()=="X")) {
            x_winner(2,4,6);
        }
        if((button[0].getText()=="O") && (button[1].getText()=="O")&& (button[2].getText()=="O")) {
            o_winner(0,1,2);
        }
        if((button[3].getText()=="O") && (button[4].getText()=="O")&& (button[5].getText()=="O")) {
            o_winner(3,4,5);
        }
        if((button[8].getText()=="O") && (button[6].getText()=="O")&& (button[7].getText()=="O")) {
            o_winner(6,7,8);
        }
        if((button[0].getText()=="O") && (button[3].getText()=="O")&& (button[6].getText()=="O")) {
            o_winner(0,3,6);
        }
        if((button[1].getText()=="O") && (button[4].getText()=="O")&& (button[7].getText()=="O")) {
            o_winner(1,4,7);
        }
        if((button[2].getText()=="O") && (button[5].getText()=="O")&& (button[8].getText()=="O")) {
            o_winner(2,5,8);
        }
        if((button[0].getText()=="O") && (button[4].getText()=="O")&& (button[8].getText()=="O")) {
            o_winner(0,4,8);
        }
        if((button[2].getText()=="O") && (button[4].getText()=="O")&& (button[6].getText()=="O")) {
            o_winner(2,4,6);
        }

    }
    void x_winner(int a, int b, int c){
        button[a].setBackground(new Color(143,255,7));
        button[b].setBackground(new Color(143,255,7));
        button[c].setBackground(new Color(143,255,7));
        text.setText("X WINS");
        for(int i=0;i<9;i++){
            button[i].setEnabled(false);
        }
    }
    void o_winner(int a, int b, int c){
        button[a].setBackground(new Color(143,255,7));
        button[b].setBackground(new Color(143,255,7));
        button[c].setBackground(new Color(143,255,7));
        text.setText("O WINS");
        for(int i=0;i<9;i++){
            button[i].setEnabled(false);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++){
            if(e.getSource()==button[i]){
                if(p1){
                    if(button[i].getText()==""){
                        button[i].setForeground(new Color(131,222,232));
                        button[i].setBackground(new Color(11,37,40));
                        button[i].setText("X");
                        p1=false;
                        text.setText("O turn");
                        check();
                    }
                }else{
                    if(button[i].getText()==""){
                        button[i].setForeground(new Color(8,141,30));
                        button[i].setBackground(new Color(11,37,40));
                        button[i].setText("O");
                        p1=true;
                        text.setText("X turn");
                        check();
                    }

                }
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}