import java.awt.*;  
import java.awt.event.*;  

public class AddTwoNumbersAWT {  
    public static void main(String[] args) {  
        // Create a frame
        Frame frame = new Frame("Add Two Numbers");

        // Create components
        Label label1 = new Label("Enter first number:");
        Label label2 = new Label("Enter second number:");
        Label resultLabel = new Label("Result: ");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button addButton = new Button("Add");

        // Set positions and sizes
        label1.setBounds(50, 50, 150, 30);
        textField1.setBounds(200, 50, 100, 30);

        label2.setBounds(50, 100, 150, 30);
        textField2.setBounds(200, 100, 100, 30);

        addButton.setBounds(120, 150, 80, 30);

        resultLabel.setBounds(50, 200, 250, 30);

        // Add components to frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);

        // Add button action listener
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Handle window close
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }  
}