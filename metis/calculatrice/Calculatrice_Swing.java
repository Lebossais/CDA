package calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Calculatrice_Swing {

	private JFrame frmCalculatrice;
	private final static String LOOKANDFEEL = "Nimbus";
	private double chiffre1;
	private boolean clicOperateur = false, update = false;
	private double temp, temp1, result, a;
	private String operateur = "";
	private JTextField console;
	private char operation;
	private int z=0, x=0, y=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		initLookAndFeel();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice_Swing window = new Calculatrice_Swing();
					window.frmCalculatrice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice_Swing() {
		initialize();
	}
	
	private static void initLookAndFeel() {
		String lookAndFeel = null;

		if (LOOKANDFEEL != null) {
			switch (LOOKANDFEEL) {
			case "Metal":
				lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
				break;
			case "System":
				lookAndFeel = UIManager.getSystemLookAndFeelClassName();
				break;
			case "Motif":
				lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
				break;
			case "Nimbus":
				lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
				break;		
			}

			try {
				UIManager.setLookAndFeel(lookAndFeel);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatrice = new JFrame();
		frmCalculatrice.setTitle("Calculatrice");
		frmCalculatrice.setBounds(100, 100, 433, 356);
		frmCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelbutton = new JPanel();
		frmCalculatrice.getContentPane().add(panelbutton, BorderLayout.CENTER);
		panelbutton.setLayout(new GridLayout(5, 4, 2, 2));
		
		JPanel panel = new JPanel();
		panelbutton.add(panel);
		
		JPanel panel_1 = new JPanel();
		panelbutton.add(panel_1);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		clear.setForeground(new Color(220, 20, 60));
		panelbutton.add(clear);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		
		JButton soustraction = new JButton("-");
		soustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(soustraction);
		panelbutton.add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(nine);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(division);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(six);
		
		JButton multiplication = new JButton("*");
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(multiplication);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(three);
		
		JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(addition);
		
		JButton plusorless = new JButton("+/-");
		plusorless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(plusorless);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(zero);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(dot);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul(e);
			}
		});
		panelbutton.add(equal);
		
		JPanel paneltext = new JPanel();
		paneltext.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCalculatrice.getContentPane().add(paneltext, BorderLayout.NORTH);
		
		console = new JTextField();
		console.setHorizontalAlignment(SwingConstants.RIGHT);
		console.setColumns(25);
		console.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent keyevent) {
	                char c = keyevent.getKeyChar();
	                if (c >= '0' && c <= '9') {
	                } else {
	                    keyevent.consume();
	                }
	            }
	        });
		JPanel panEcran = new JPanel();
		paneltext.add(console);
	}
	
	public void calcul(ActionEvent e) {
		String s = e.getActionCommand();
        if (s.equals("Quitter")) {
            System.exit(0);
	}
        if (s.equals("1")) {
            if (z == 0) {
                console.setText(console.getText() + "1");
            } else {
                console.setText("");
                console.setText(console.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                console.setText(console.getText() + "2");
            } else {
                console.setText("");
                console.setText(console.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                console.setText(console.getText() + "3");
            } else {
                console.setText("");
                console.setText(console.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                console.setText(console.getText() + "4");
            } else {
                console.setText("");
                console.setText(console.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                console.setText(console.getText() + "5");
            } else {
                console.setText("");
                console.setText(console.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                console.setText(console.getText() + "6");
            } else {
                console.setText("");
                console.setText(console.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                console.setText(console.getText() + "7");
            } else {
                console.setText("");
                console.setText(console.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                console.setText(console.getText() + "8");
            } else {
                console.setText("");
                console.setText(console.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                console.setText(console.getText() + "9");
            } else {
                console.setText("");
                console.setText(console.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                console.setText(console.getText() + "0");
            } else {
                console.setText("");
                console.setText(console.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("Clear")) {
            console.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("+/-")) {
            if (x == 0) {
                console.setText("-" + console.getText());
                x = 1;
            } else {
                console.setText(console.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                console.setText(console.getText() + ".");
                y = 1;
            } else {
                console.setText(console.getText());
            }
        }
        if (s.equals("+")) {
            if (console.getText().equals("")) {
                console.setText("");
                temp = 0;
                operation = '+';
            } else {
                temp = Double.parseDouble(console.getText());
                console.setText("");
                operation = '+';
                y = 0;
                x = 0;
            }
            console.requestFocus();
        }
        if (s.equals("-")) {
            if (console.getText().equals("")) {
                console.setText("");
                temp = 0;
                operation = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(console.getText());
                console.setText("");
                operation = '-';
            }
            console.requestFocus();
        }
        if (s.equals("/")) {
            if (console.getText().equals("")) {
                console.setText("");
                temp = 1;
                operation = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(console.getText());
                operation = '/';
                console.setText("");
            }
            console.requestFocus();
        }
        if (s.equals("*")) {
            if (console.getText().equals("")) {
                console.setText("");
                temp = 1;
                operation = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(console.getText());
                operation = '*';
                console.setText("");
            }
            console.requestFocus();
        }
        if (s.equals("=")) {
            if (console.getText().equals("")) {
                console.setText("");
            } else {
                temp1 = Double.parseDouble(console.getText());
                switch (operation) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                console.setText("");
                console.setText(console.getText() + result);
                z = 1;
            }
        }
        console.requestFocus();
    }
}
