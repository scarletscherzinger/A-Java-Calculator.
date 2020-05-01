import javax.swing.*;
import java.awt.*;


public class kidsCalculator {


    private double number1=0.0;
    private double number2=0.0;
    private int operator=-1;
    private String variable1="0";
    private String variable2="0";




    private kidsCalculator() {


        JFrame frame = new JFrame("CALCULATOR");

        JPanel panel = new JPanel();

        JLabel label=new JLabel("kIdS cALcULaTOr");
        label.setBounds(10,50,50,10);
        label.setForeground(Color.RED);
        Font f=label.getFont();
        label.setFont(new Font("courier New",Font.ITALIC,40));
        label.setFont(f.deriveFont(f.getStyle()|Font.BOLD,40));


        JTextField textField = new JTextField(20);
        textField.setBounds(30, 50, 100, 70);
        textField.setFont(f.deriveFont(f.getStyle()|Font.BOLD,40));
        textField.setBackground(Color.green);
        panel.add(label);
        panel.add(textField);


        JButton button0 = new JButton("0");
        button0.setBackground(Color.magenta);
        f = button0.getFont();
        button0.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button1 = new JButton("1");
        button1.setBackground(Color.magenta);
        f = button1.getFont();
        button1.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button2 = new JButton("2");
        button2.setBackground(Color.magenta);
        f = button2.getFont();
        button2.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button3 = new JButton("3");
        button3.setBackground(Color.magenta);
        f = button3.getFont();
        button3.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button4 = new JButton("4");
        button4.setBackground(Color.magenta);
        f = button4.getFont();
        button4.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button5 = new JButton("5");
        button5.setBackground(Color.magenta);
        f = button5.getFont();
        button5.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button6 = new JButton("6");
        button6.setBackground(Color.magenta);
        f = button6.getFont();
        button6.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button7 = new JButton("7");
        button7.setBackground(Color.magenta);
        f = button7.getFont();
        button7.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button8 = new JButton("8");
        button8.setBackground(Color.magenta);
        f = button8.getFont();
        button8.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button9 = new JButton("9");
        button9.setBackground(Color.magenta);
        f = button9.getFont();
        button9.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button10 = new JButton(".");
        button10.setBackground(Color.yellow);
        f = button10.getFont();
        button10.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button11 = new JButton("+");
        button11.setBackground(Color.yellow);
        f = button11.getFont();
        button11.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button12 = new JButton("-");
        button12.setBackground(Color.yellow);
        f = button12.getFont();
        button12.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button13 = new JButton("*");
        button13.setBackground(Color.yellow);
        f = button13.getFont();
        button13.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button14 = new JButton("/");
        button14.setBackground(Color.yellow);
        f = button14.getFont();
        button14.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));

        JButton button15 = new JButton("=");
        button15.setBackground(Color.yellow);
        f = button15.getFont();
        button15.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));
        button15.setForeground(Color.black);

        JButton button16 = new JButton("DELETE");
        button16.setBackground(Color.blue);
        button16.setFont(new Font("courier New",Font.ITALIC,12));
        f = button16.getFont();
        button16.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));
        button16.setForeground(Color.green);

        JToggleButton toggleButton17 = new JToggleButton("ON/OFF");
        toggleButton17.setBackground(Color.blue);
        toggleButton17.setFont(new Font("courier New",Font.ITALIC,12));
        f = toggleButton17.getFont();
        toggleButton17.setFont(f.deriveFont(f.getStyle()|Font.BOLD,30));
        toggleButton17.setForeground(Color.green);



   /*setText() receives a string while getText() returns a string. Java lambda expressions are Java's first step to functional
     programming. They are commonly used to implement simple event listeners. Event Listeners are often defined
     as Java Interface with a single method.
    */

        button0.addActionListener(e -> {
            if (e.getSource()==button0){
                textField.setText(textField.getText().concat("0"));

                if (operator==-1)
                {
                    variable1=variable1.concat("0");
                }
                else
                {
                    variable2=variable2.concat("0");
                }

            }

        });
        button1.addActionListener(e -> {
            if(e.getSource()==button1){
                textField.setText(textField.getText().concat("1"));

                if (operator==-1)
                {
                    variable1=variable1.concat("1");
                }
                else
                {
                    variable2=variable2.concat("1");
                }

            }

        });
        button2.addActionListener(e -> {
            if(e.getSource()==button2){
                textField.setText(textField.getText().concat("2"));

                if (operator==-1)
                {
                    variable1=variable1.concat("2");
                }
                else
                {
                    variable2=variable2.concat("2");
                }
            }

        });
        button3.addActionListener(e -> {
            if(e.getSource()==button3){
                textField.setText(textField.getText().concat("3"));

                if (operator==-1)
                {
                    variable1=variable1.concat("3");
                }
                else
                {
                    variable2=variable2.concat("3");
                }
            }

        });
        button4.addActionListener(e -> {
            if(e.getSource()==button4){
                textField.setText(textField.getText().concat("4"));

                if (operator==-1)
                {
                    variable1=variable1.concat("4");
                }
                else
                {
                    variable2=variable2.concat("4");
                }
            }

        });
        button5.addActionListener(e -> {
            if(e.getSource()==button5){
                textField.setText(textField.getText().concat("5"));

                if (operator==-1)
                {
                    variable1=variable1.concat("5");
                }
                else
                {
                    variable2=variable2.concat("5");
                }
            }

        });
        button6.addActionListener(e -> {
            if(e.getSource()==button6){
                textField.setText(textField.getText().concat("6"));

                if (operator==-1)
                {
                    variable1=variable1.concat("6");
                }
                else
                {
                    variable2=variable2.concat("6");
                }
            }

        });
        button7.addActionListener(e -> {
            if(e.getSource()==button7){
                textField.setText(textField.getText().concat("7"));

                if (operator==-1)
                {
                    variable1=variable1.concat("7");
                }
                else
                {
                    variable2=variable2.concat("7");
                }
            }

        });
        button8.addActionListener(e -> {
            if(e.getSource()==button8){
                textField.setText(textField.getText().concat("8"));

                if (operator==-1)
                {
                    variable1=variable1.concat("8");
                }
                else
                {
                    variable2=variable2.concat("8");
                }

            }

        });
        button9.addActionListener(e -> {
            if(e.getSource()==button9){
                textField.setText(textField.getText().concat("9"));

                if (operator==-1)
                {
                    variable1=variable1.concat("9");
                }
                else
                {
                    variable2=variable2.concat("9");
                }

            }

        });
        button10.addActionListener(e -> {
            if(e.getSource()==button10){
                textField.setText(textField.getText().concat("."));

                if (operator==-1)
                {
                    variable1=variable1.concat(".");
                }
                else
                {
                    variable2=variable2.concat(".");
                }

            }

        });
        button11.addActionListener(e -> {
            if(e.getSource()==button11){

                number1=Double.parseDouble(textField.getText());
                variable1="0";
                operator=1;
                textField.setText(textField.getText().concat("+"));

            }

        });
        button12.addActionListener(e -> {
            if(e.getSource()==button12){

                number1=Double.parseDouble(textField.getText());
                variable1="0";
                operator=2;
                textField.setText(textField.getText().concat("-"));

            }

        });
        button13.addActionListener(e -> {
            if(e.getSource()==button13){

                number1=Double.parseDouble(textField.getText());
                variable1="0";
                operator=3;
                textField.setText(textField.getText().concat("*"));

            }

        });

        button14.addActionListener(e -> {
            if(e.getSource()==button14){

                number1=Double.parseDouble(textField.getText());
                variable1="0";
                operator=4;
                textField.setText(textField.getText().concat("/"));

            }

        });

        button15.addActionListener(e -> {

            if(e.getSource()==button15){
                if(operator==1)
                {
                    double total1;
                    number2=Double.parseDouble(variable2);
                    variable2="0";
                    total1=number1+number2;
                    textField.setText(total1+"");
                }

                if(operator==2)
                {
                    double total2;
                    number2=Double.parseDouble(variable2);
                    variable2="0";
                    total2=number1-number2;
                    textField.setText(total2+"");
                }

                if(operator==3)
                {
                    double total3;
                    number2=Double.parseDouble(variable2);
                    variable2="0";
                    total3=number1*number2;
                    textField.setText(total3+"");
                }

                if(operator==4)
                {
                    double total4;
                    number2=Double.parseDouble(variable2);
                    variable2="0";
                    total4=number1/number2;
                    textField.setText(total4+"");
                }

                number1=0;
                number2=0;
                operator=-1;

            }
        });

        button16.addActionListener(e -> {

            if(e.getSource()==button16){

                String s=textField.getText();
                textField.setText("");
                for (int i=0;i<s.length()-1;i++){
                    textField.setText(textField.getText()+s.charAt(i));
                }
            }

        });

        toggleButton17.addActionListener(e -> toggleButton17.addItemListener(e1 -> {
            if (toggleButton17.isSelected()) {

                button0.setEnabled(true);
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                button10.setEnabled(true);
                button11.setEnabled(true);
                button12.setEnabled(true);
                button13.setEnabled(true);
                button14.setEnabled(true);
                button15.setEnabled(true);
                button16.setEnabled(true);

            }

            else

            {
                button0.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
                button14.setEnabled(false);
                button15.setEnabled(false);
                button16.setEnabled(false);

            }

            //toggleButton17.getHideActionText();
        }));


        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        panel.add(button16);
        panel.add(toggleButton17);


        panel.setLayout(new GridLayout(5,5,15,15));
        panel.setBackground(Color.black);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);

    }


    public static void main(String...s) {

        SwingUtilities.invokeLater(kidsCalculator::new);
    }


}
