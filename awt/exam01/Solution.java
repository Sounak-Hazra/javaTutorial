import java.awt.*;
import java.awt.event.*;

class Solution{
    public static void main(String args[]) {
        new myFrame();
    }
}


// class MyFrame extends Frame implements ActionListener {

//     Label l;
//     Label ll;
//     Button b;
//     TextField tf;

//     MyFrame() {
        
//         Panel inputPanel = new Panel();
//         inputPanel.setLayout(new FlowLayout());


//         ll = new Label("Enter Your Name :");
//         tf = new TextField(20);
//         b = new Button("Ok");
//         b.addActionListener(this);
//         inputPanel.add(ll);
//         inputPanel.add(b);
//         inputPanel.add(tf);


//         Panel namePanel = new Panel();
//         l = new Label("Enter Your name to show");
//         namePanel.setLayout(new FlowLayout());
//         namePanel.add(l);


//         setVisible(true);
//         setSize(200, 200);

//         add(inputPanel);
//         add(namePanel);
//         setLayout(new FlowLayout());
//     }
    
//     public void actionPerformed(ActionEvent e) {
//         System.out.println(tf.getText());
//         l.setText("Your name is :" + tf.getText());
//     }
// }


class myFrame extends Frame implements ActionListener {

    TextField tf;
    Button b;
    
    myFrame() {

        b = new Button("Ok");
        tf = new TextField();
        b.addActionListener(this);



        add(b);
        add(tf);



        setVisible(true);
        setSize(300, 300);
        setTitle("Hello");
        setLayout(new FlowLayout());
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println(Integer.parseInt(tf.getText()) + 0);
    }
}