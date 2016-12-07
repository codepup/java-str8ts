import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Str8ts {
	//Declaration.
	JFrame frm_menu, frm_str8ts, frm_help;
	JPanel pan_menuBack, pan_str8tsBack, pan_help, pan_difficulty, pan_easyLevelSelect, pan_mediumLevelSelect,
	pan_hardLevelSelect;
	JTextArea txta_gameRules;
	JButton btn_play, btn_help, btn_helpBack, btn_helpNext, btn_easy, btn_medium, btn_hard, btn_easyLevel1,
	btn_easyLevel2, btn_easyLevel3, btn_mediumLevel1, btn_mediumLevel2, btn_mediumLevel3, btn_hardLevel1,
	btn_hardLevel2, btn_hardLevel3,
	btn_A1, btn_A2, btn_A3, btn_A4, btn_A5, btn_A6, btn_A7, btn_A8, btn_A9, 
	btn_B1, btn_B2, btn_B3, btn_B4, btn_B5, btn_B6, btn_B7, btn_B8, btn_B9,
	btn_C1, btn_C2, btn_C3, btn_C4, btn_C5, btn_C6, btn_C7, btn_C8, btn_C9,
	btn_D1, btn_D2, btn_D3, btn_D4, btn_D5, btn_D6, btn_D7, btn_D8, btn_D9,
	btn_E1, btn_E2, btn_E3, btn_E4, btn_E5, btn_E6, btn_E7, btn_E8, btn_E9,
	btn_F1, btn_F2, btn_F3, btn_F4, btn_F5, btn_F6, btn_F7, btn_F8, btn_F9,
	btn_G1, btn_G2, btn_G3, btn_G4, btn_G5, btn_G6, btn_G7, btn_G8, btn_G9,
	btn_H1, btn_H2, btn_H3, btn_H4, btn_H5, btn_H6, btn_H7, btn_H8, btn_H9,
	btn_I1, btn_I2, btn_I3, btn_I4, btn_I5, btn_I6, btn_I7, btn_I8, btn_I9;
	
	int num_A1=0,num_A2=0,num_A3=0,num_A4=0,num_A5=0,num_A6=0,num_A7=0,num_A8=0,num_A9=0,
	num_B1=0,num_B2=0,num_B3=0,num_B4=0,num_B5=0,num_B6=0,num_B7=0,num_B8=0,num_B9=0,
	num_C1=0,num_C2=0,num_C3=0,num_C4=0,num_C5=0,num_C6=0,num_C7=0,num_C8=0,num_C9=0,
	num_D1=0,num_D2=0,num_D3=0,num_D4=0,num_D5=0,num_D6=0,num_D7=0,num_D8=0,num_D9=0,
	num_E1=0,num_E2=0,num_E3=0,num_E4=0,num_E5=0,num_E6=0,num_E7=0,num_E8=0,num_E9=0,
	num_F1=0,num_F2=0,num_F3=0,num_F4=0,num_F5=0,num_F6=0,num_F7=0,num_F8=0,num_F9=0,
	num_G1=0,num_G2=0,num_G3=0,num_G4=0,num_G5=0,num_G6=0,num_G7=0,num_G8=0,num_G9=0,
	num_H1=0,num_H2=0,num_H3=0,num_H4=0,num_H5=0,num_H6=0,num_H7=0,num_H8=0,num_H9=0,
	num_I1=0,num_I2=0,num_I3=0,num_I4=0,num_I5=0,num_I6=0,num_I7=0,num_I8=0,num_I9=0;
	
	public Str8ts(){
	//==================================Main Menu==================================
	
	//Main menu Frame.
	frm_menu = new JFrame("Str8ts");
	frm_menu.setSize(500,400);
	frm_menu.setLocationRelativeTo(null);
	frm_menu.setResizable(false);
	frm_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//Main menu Background.
	pan_menuBack = new JPanel();
	pan_menuBack.setSize(500,400);
	pan_menuBack.setBackground(Color.BLUE);
	pan_menuBack.setLayout(null);
	frm_menu.getContentPane().add(pan_menuBack);
	
	//Play button.
	btn_play = new JButton("Play");
	btn_play.setBounds(155,210,180,40);
	btn_play.addActionListener(new play_buttonListener());
	pan_menuBack.add(btn_play);
	
	//Help button.
	btn_help = new JButton("Help");
	btn_help.setBounds(155,280,180,40);
	btn_help.addActionListener(new help_buttonListener());
	pan_menuBack.add(btn_help);
	
	//==================================Main Menu====================================	
	
	//==================================Difficulty Select====================================
	
	//Difficulty Select Screen.
	pan_difficulty = new JPanel();
	pan_difficulty.setSize(500,400);
	pan_difficulty.setBackground(Color.BLUE);
	pan_difficulty.setLayout(null);
	frm_menu.getContentPane().add(pan_difficulty);
	
	//Easy Difficulty.
	btn_easy = new JButton("Easy");
	btn_easy.setBounds(155,80,180,40);
	btn_easy.addActionListener(new easy_buttonListener());
	pan_difficulty.add(btn_easy);
	
	//Medium Difficulty.
	btn_medium = new JButton("Medium");
	btn_medium.setBounds(155,170,180,40);
	btn_medium.addActionListener(new medium_buttonListener());
	pan_difficulty.add(btn_medium);
	
	//Hard Difficulty.
	btn_hard = new JButton("Hard");
	btn_hard.setBounds(155,260,180,40);
	btn_hard.addActionListener(new hard_buttonListener());
	pan_difficulty.add(btn_hard);
	
	//==================================Difficulty Select====================================
	
	//==================================Easy Level Select====================================
	
	//Easy Level Select Screen.
	pan_easyLevelSelect = new JPanel();
	pan_easyLevelSelect.setSize(500,400);
	pan_easyLevelSelect.setBackground(Color.BLUE);
	pan_easyLevelSelect.setLayout(null);
	frm_menu.getContentPane().add(pan_easyLevelSelect);
	
	//Level 1.
	btn_easyLevel1 = new JButton("Level 1");
	btn_easyLevel1.setBounds(155,80,180,40);
	//btn_easyLevel1.addActionListener(new easyLevel1_buttonListener());
	pan_easyLevelSelect.add(btn_easyLevel1);
	
	//Level 2.
	btn_easyLevel2 = new JButton("Level 2");
	btn_easyLevel2.setBounds(155,170,180,40);
	//btn_easyLevel2.addActionListener(new easyLevel2_buttonListener());
	pan_easyLevelSelect.add(btn_easyLevel2);
	
	//Level 3.
	btn_easyLevel3 = new JButton("Level 3");
	btn_easyLevel3.setBounds(155,260,180,40);
	//btn_easyLevel3.addActionListener(new easyLevel3_buttonListener());
	pan_easyLevelSelect.add(btn_easyLevel3);
	
	//==================================Easy Level Select====================================
	
	//==================================Medium Level Select====================================
	
	//medium Level Select Screen.
	pan_mediumLevelSelect = new JPanel();
	pan_mediumLevelSelect.setSize(500,400);
	pan_mediumLevelSelect.setBackground(Color.BLUE);
	pan_mediumLevelSelect.setLayout(null);
	frm_menu.getContentPane().add(pan_mediumLevelSelect);
	
	//Level 1.
	btn_mediumLevel1 = new JButton("Level 1");
	btn_mediumLevel1.setBounds(155,80,180,40);
	//btn_mediumLevel1.addActionListener(new mediumLevel1_buttonListener());
	pan_mediumLevelSelect.add(btn_mediumLevel1);
	
	//Level 2.
	btn_mediumLevel2 = new JButton("Level 2");
	btn_mediumLevel2.setBounds(155,170,180,40);
	//btn_mediumLevel2.addActionListener(new mediumLevel2_buttonListener());
	pan_mediumLevelSelect.add(btn_mediumLevel2);
	
	//Level 3.
	btn_mediumLevel3 = new JButton("Level 3");
	btn_mediumLevel3.setBounds(155,260,180,40);
	//btn_mediumLevel3.addActionListener(new mediumLevel3_buttonListener());
	pan_mediumLevelSelect.add(btn_mediumLevel3);
	
	//==================================Medium Level Select====================================
	
	//==================================Hard Level Select====================================
	
	//Hard Level Select Screen.
	pan_hardLevelSelect = new JPanel();
	pan_hardLevelSelect.setSize(500,400);
	pan_hardLevelSelect.setBackground(Color.BLUE);
	pan_hardLevelSelect.setLayout(null);
	frm_menu.getContentPane().add(pan_hardLevelSelect);
	
	//Level 1.
	btn_hardLevel1 = new JButton("Level 1");
	btn_hardLevel1.setBounds(155,80,180,40);
	//btn_hardLevel1.addActionListener(new hardLevel1_buttonListener());
	pan_hardLevelSelect.add(btn_hardLevel1);
	
	//Level 2.
	btn_hardLevel2 = new JButton("Level 2");
	btn_hardLevel2.setBounds(155,170,180,40);
	//btn_hardLevel2.addActionListener(new hardLevel2_buttonListener());
	pan_hardLevelSelect.add(btn_hardLevel2);
	
	//Level 3.
	btn_hardLevel3 = new JButton("Level 3");
	btn_hardLevel3.setBounds(155,260,180,40);
	//btn_hardLevel3.addActionListener(new hardLevel3_buttonListener());
	pan_hardLevelSelect.add(btn_hardLevel3);
	
	//==================================Hard Level Select====================================
	
	//==================================Help====================================
	String rules;
	
	rules = "  Rows and columns are divided into compartments of \n" +
	"  white squares. Look at the diagram on the right \n" + 
	"  which has two 'straights' filled in and highlighted. The \n" +
	"  black cells separate the compartments. \n" +
	"  Compartments can be both vertical and horizontal. \n" +
	"\n" +
	"  Squares in compartments need to be filled in with \n" +
	"  single numbers. These must complete a 'straight'. A \n" +
	"  straight is a set of numbers with no gaps and in any \n" +
	"  order, such as [6,8,7] or [3,2,4,5], as shown on the \n" +
	"  diagram. \n" +
	"\n" +
	"  No single number can repeat in any row or column - \n" +
	"  same rule as Sudoku. \n" +
	"\n" +
	"  Clues in black cells remove that number as an option \n" +
	"  in that row and column, and are not part of any \n" +
	"  straight.";
	
	//Help frame.
	frm_help = new JFrame("Str8ts");
	frm_help.setSize(650,400);
	frm_help.setLocationRelativeTo(null);
	frm_help.setResizable(false);
	frm_help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Help screen.
	pan_help = new JPanel();
	pan_help.setSize(650,400);
	pan_help.setBackground(Color.BLUE);
	pan_help.setLayout(null);
	frm_help.getContentPane().add(pan_help);
	
	//Game rules.
	txta_gameRules = new JTextArea(rules);
	txta_gameRules.setEditable(false);
	txta_gameRules.setBounds(30, 25, 300, 300);
	pan_help.add(txta_gameRules);

	//Back button.
	btn_helpBack = new JButton("Back");
	btn_helpBack.setBounds(30,337,110,25);
	btn_helpBack.addActionListener(new helpBack_buttonListener());
	pan_help.add(btn_helpBack);
	
	//Next button.
	btn_helpNext = new JButton("Next");
	btn_helpNext.setBounds(500, 337, 110, 25);
	//btn_helpGoForward.addActionListener(new helpNext_buttonListener());
	pan_help.add(btn_helpNext);
	
	//==================================Help====================================
	
	//==================================Str8ts====================================
	//Str8ts Frame.
	frm_str8ts = new JFrame("Str8ts");
	frm_str8ts.setSize(600,600);
	frm_str8ts.setLocationRelativeTo(null);
	frm_str8ts.setResizable(false);
	frm_str8ts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm_str8ts.setVisible(false);
	
	//Str8ts Background.
	pan_str8tsBack = new JPanel();
	pan_str8tsBack.setSize(600,600);
	pan_str8tsBack.setBackground(Color.BLUE);
	pan_str8tsBack.setLayout(new GridLayout(9,9));
	pan_str8tsBack.setVisible(true);
	frm_str8ts.getContentPane().add(pan_str8tsBack);
	
	//===============================Button Grid=================================
	//Row A.
	//Cell A1.
	btn_A1 = new JButton();
	btn_A1.addActionListener(new A1_buttonListener());
	btn_A1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A1);
	
	//Cell A2.
	btn_A2 = new JButton();
	btn_A2.addActionListener(new A2_buttonListener());
	btn_A2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A2);
	
	//Cell A3.
	btn_A3 = new JButton();
	btn_A3.addActionListener(new A3_buttonListener());
	btn_A3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A3);
	
	//Cell A4.
	btn_A4 = new JButton();
	btn_A4.addActionListener(new A4_buttonListener());
	btn_A4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A4);
	
	//Cell A5.
	btn_A5 = new JButton();
	btn_A5.addActionListener(new A5_buttonListener());
	btn_A5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A5);
	
	//Cell A6.
	btn_A6 = new JButton();
	btn_A6.addActionListener(new A6_buttonListener());
	btn_A6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A6);
	
	//Cell A7.
	btn_A7 = new JButton();
	btn_A7.addActionListener(new A7_buttonListener());
	btn_A7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A7);
	
	//Cell A8.
	btn_A8 = new JButton();
	btn_A8.addActionListener(new A8_buttonListener());
	btn_A8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A8);
	
	//Cell A9.
	btn_A9 = new JButton();
	btn_A9.addActionListener(new A9_buttonListener());
	btn_A9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_A9);
	
	//Row B.
	//Cell B1.
	btn_B1 = new JButton();
	btn_B1.addActionListener(new B1_buttonListener());
	btn_B1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B1);
	
	//Cell B2.
	btn_B2 = new JButton();
	btn_B2.addActionListener(new B2_buttonListener());
	btn_B2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B2);
	
	//Cell B3.
	btn_B3 = new JButton();
	btn_B3.addActionListener(new B3_buttonListener());
	btn_B3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B3);
	
	//Cell B4.
	btn_B4 = new JButton();
	btn_B4.addActionListener(new B4_buttonListener());
	btn_B4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B4);
	
	//Cell B5.
	btn_B5 = new JButton();
	btn_B5.addActionListener(new B5_buttonListener());
	btn_B5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B5);
	
	//Cell B6.
	btn_B6 = new JButton();
	btn_B6.addActionListener(new B6_buttonListener());
	btn_B6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B6);
	
	//Cell B7.
	btn_B7 = new JButton();
	btn_B7.addActionListener(new B7_buttonListener());
	btn_B7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B7);
	
	//Cell B8.
	btn_B8 = new JButton();
	btn_B8.addActionListener(new B8_buttonListener());
	btn_B8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B8);
	
	//Cell B9.
	btn_B9 = new JButton();
	btn_B9.addActionListener(new B9_buttonListener());
	btn_B9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_B9);
	
	//Row C.
	//Cell C1.
	btn_C1 = new JButton();
	btn_C1.addActionListener(new C1_buttonListener());
	btn_C1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C1);
	
	//Cell C2.
	btn_C2 = new JButton();
	btn_C2.addActionListener(new C2_buttonListener());
	btn_C2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C2);
	
	//Cell C3.
	btn_C3 = new JButton();
	btn_C3.addActionListener(new C3_buttonListener());
	btn_C3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C3);
	
	//Cell C4.
	btn_C4 = new JButton();
	btn_C4.addActionListener(new C4_buttonListener());
	btn_C4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C4);
	
	//Cell C5.
	btn_C5 = new JButton();
	btn_C5.addActionListener(new C5_buttonListener());
	btn_C5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C5);
	
	//Cell C6.
	btn_C6 = new JButton();
	btn_C6.addActionListener(new C6_buttonListener());
	btn_C6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C6);
	
	//Cell C7.
	btn_C7 = new JButton();
	btn_C7.addActionListener(new C7_buttonListener());
	btn_C7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C7);
	
	//Cell C8.
	btn_C8 = new JButton();
	btn_C8.addActionListener(new C8_buttonListener());
	btn_C8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C8);
	
	//Cell C9.
	btn_C9 = new JButton();
	btn_C9.addActionListener(new C9_buttonListener());
	btn_C9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_C9);
	
	//Row D.
	//Cell D1.
	btn_D1 = new JButton();
	btn_D1.addActionListener(new D1_buttonListener());
	btn_D1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D1);
	
	//Cell D2.
	btn_D2 = new JButton();
	btn_D2.addActionListener(new D2_buttonListener());
	btn_D2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D2);
	
	//Cell D3.
	btn_D3 = new JButton();
	btn_D3.addActionListener(new D3_buttonListener());
	btn_D3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D3);
	
	//Cell D4.
	btn_D4 = new JButton();
	btn_D4.addActionListener(new D4_buttonListener());
	btn_D4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D4);
	
	//Cell D5.
	btn_D5 = new JButton();
	btn_D5.addActionListener(new D5_buttonListener());
	btn_D5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D5);
	
	//Cell D6.
	btn_D6 = new JButton();
	btn_D6.addActionListener(new D6_buttonListener());
	btn_D6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D6);
	
	//Cell D7.
	btn_D7 = new JButton();
	btn_D7.addActionListener(new D7_buttonListener());
	btn_D7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D7);
	
	//Cell D8.
	btn_D8 = new JButton();
	btn_D8.addActionListener(new D8_buttonListener());
	btn_D8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D8);
	
	//Cell D9.
	btn_D9 = new JButton();
	btn_D9.addActionListener(new D9_buttonListener());
	btn_D9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_D9);
	
	//Row E.
	//Cell E1.
	btn_E1 = new JButton();
	btn_E1.addActionListener(new E1_buttonListener());
	btn_E1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E1);
	
	//Cell E2.
	btn_E2 = new JButton();
	btn_E2.addActionListener(new E2_buttonListener());
	btn_E2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E2);
	
	//Cell E3.
	btn_E3 = new JButton();
	btn_E3.addActionListener(new E3_buttonListener());
	btn_E3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E3);
	
	//Cell E4.
	btn_E4 = new JButton();
	btn_E4.addActionListener(new E4_buttonListener());
	btn_E4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E4);
	
	//Cell E5.
	btn_E5 = new JButton();
	btn_E5.addActionListener(new E5_buttonListener());
	btn_E5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E5);
	
	//Cell E6.
	btn_E6 = new JButton();
	btn_E6.addActionListener(new E6_buttonListener());
	btn_E6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E6);
	
	//Cell E7.
	btn_E7 = new JButton();
	btn_E7.addActionListener(new E7_buttonListener());
	btn_E7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E7);
	
	//Cell E8.
	btn_E8 = new JButton();
	btn_E8.addActionListener(new E8_buttonListener());
	btn_E8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E8);
	
	//Cell E9.
	btn_E9 = new JButton();
	btn_E9.addActionListener(new E9_buttonListener());
	btn_E9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_E9);
	
	//Row F.
	//Cell F1.
	btn_F1 = new JButton();
	btn_F1.addActionListener(new F1_buttonListener());
	btn_F1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F1);
	
	//Cell F2.
	btn_F2 = new JButton();
	btn_F2.addActionListener(new F2_buttonListener());
	btn_F2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F2);
	
	//Cell F3.
	btn_F3 = new JButton();
	btn_F3.addActionListener(new F3_buttonListener());
	btn_F3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F3);
	
	//Cell F4.
	btn_F4 = new JButton();
	btn_F4.addActionListener(new F4_buttonListener());
	btn_F4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F4);
	
	//Cell F5.
	btn_F5 = new JButton();
	btn_F5.addActionListener(new F5_buttonListener());
	btn_F5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F5);
	
	//Cell F6.
	btn_F6 = new JButton();
	btn_F6.addActionListener(new F6_buttonListener());
	btn_F6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F6);
	
	//Cell F7.
	btn_F7 = new JButton();
	btn_F7.addActionListener(new F7_buttonListener());
	btn_F7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F7);
	
	//Cell F8.
	btn_F8 = new JButton();
	btn_F8.addActionListener(new F8_buttonListener());
	btn_F8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F8);
	
	//Cell F9.
	btn_F9 = new JButton();
	btn_F9.addActionListener(new F9_buttonListener());
	btn_F9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_F9);
	
	//Row G.
	//Cell G1.
	btn_G1 = new JButton();
	btn_G1.addActionListener(new G1_buttonListener());
	btn_G1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G1);
	
	//Cell G2.
	btn_G2 = new JButton();
	btn_G2.addActionListener(new G2_buttonListener());
	btn_G2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G2);
	
	//Cell G3.
	btn_G3 = new JButton();
	btn_G3.addActionListener(new G3_buttonListener());
	btn_G3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G3);
	
	//Cell G4.
	btn_G4 = new JButton();
	btn_G4.addActionListener(new G4_buttonListener());
	btn_G4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G4);
	
	//Cell G5.
	btn_G5 = new JButton();
	btn_G5.addActionListener(new G5_buttonListener());
	btn_G5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G5);
	
	//Cell G6.
	btn_G6 = new JButton();
	btn_G6.addActionListener(new G6_buttonListener());
	btn_G6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G6);
	
	//Cell G7.
	btn_G7 = new JButton();
	btn_G7.addActionListener(new G7_buttonListener());
	btn_G7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G7);
	
	//Cell G8.
	btn_G8 = new JButton();
	btn_G8.addActionListener(new G8_buttonListener());
	btn_G8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G8);
	
	//Cell G9.
	btn_G9 = new JButton();
	btn_G9.addActionListener(new G9_buttonListener());
	btn_G9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_G9);
	
	//Row H.
	//Cell H1.
	btn_H1 = new JButton();
	btn_H1.addActionListener(new H1_buttonListener());
	btn_H1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H1);
	
	//Cell H2.
	btn_H2 = new JButton();
	btn_H2.addActionListener(new H2_buttonListener());
	btn_H2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H2);
	
	//Cell H3.
	btn_H3 = new JButton();
	btn_H3.addActionListener(new H3_buttonListener());
	btn_H3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H3);
	
	//Cell H4.
	btn_H4 = new JButton();
	btn_H4.addActionListener(new H4_buttonListener());
	btn_H4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H4);
	
	//Cell H5.
	btn_H5 = new JButton();
	btn_H5.addActionListener(new H5_buttonListener());
	btn_H5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H5);
	
	//Cell H6.
	btn_H6 = new JButton();
	btn_H6.addActionListener(new H6_buttonListener());
	btn_H6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H6);
	
	//Cell H7.
	btn_H7 = new JButton();
	btn_H7.addActionListener(new H7_buttonListener());
	btn_H7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H7);
	
	//Cell H8.
	btn_H8 = new JButton();
	btn_H8.addActionListener(new H8_buttonListener());
	btn_H8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H8);
	
	//Cell H9.
	btn_H9 = new JButton();
	btn_H9.addActionListener(new H9_buttonListener());
	btn_H9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_H9);
	
	//Row I.
	//Cell I1.
	btn_I1 = new JButton();
	btn_I1.addActionListener(new I1_buttonListener());
	btn_I1.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I1);
	
	//Cell I2.
	btn_I2 = new JButton();
	btn_I2.addActionListener(new I2_buttonListener());
	btn_I2.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I2);
	
	//Cell I3.
	btn_I3 = new JButton();
	btn_I3.addActionListener(new I3_buttonListener());
	btn_I3.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I3);
	
	//Cell I4.
	btn_I4 = new JButton();
	btn_I4.addActionListener(new I4_buttonListener());
	btn_I4.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I4);
	
	//Cell I5.
	btn_I5 = new JButton();
	btn_I5.addActionListener(new I5_buttonListener());
	btn_I5.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I5);
	
	//Cell I6.
	btn_I6 = new JButton();
	btn_I6.addActionListener(new I6_buttonListener());
	btn_I6.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I6);
	
	//Cell I7.
	btn_I7 = new JButton();
	btn_I7.addActionListener(new I7_buttonListener());
	btn_I7.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I7);
	
	//Cell I8.
	btn_I8 = new JButton();
	btn_I8.addActionListener(new I8_buttonListener());
	btn_I8.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I8);
	
	//Cell I9.
	btn_I9 = new JButton();
	btn_I9.addActionListener(new I9_buttonListener());
	btn_I9.setFont(new Font("Arial",Font.BOLD,30));
	pan_str8tsBack.add(btn_I9);
	//===============================Button Grid=================================
	
	//==================================Str8ts====================================
	frm_menu.setVisible(true);
	pan_menuBack.setVisible(true);
	pan_difficulty.setVisible(false);
	pan_easyLevelSelect.setVisible(false);
	pan_mediumLevelSelect.setVisible(false);
	pan_hardLevelSelect.setVisible(false);
	frm_help.setVisible(false);
	}
	
	//==================================A1 Button Listener=======================================
	private class A1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A1){
				String text_A1;
				if (num_A1 == 9){
					num_A1 = 0;
				}
				num_A1++;
				text_A1 = Integer.toString(num_A1);
				btn_A1.setText(text_A1);
			}
		}
	}
	//==================================A1 Button Listener=======================================
	
	//==================================A2 Button Listener=======================================
	private class A2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A2){
				String text_A2;
				if (num_A2 == 9){
					num_A2 = 0;
				}
				num_A2++;
				text_A2 = Integer.toString(num_A2);
				btn_A2.setText(text_A2);
			}
		}
	}
	//==================================A2 Button Listener=======================================
	
	//==================================A3 Button Listener=======================================
	private class A3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A3){
				String text_A3;
				if (num_A3 == 9){
					num_A3 = 0;
				}
				num_A3++;
				text_A3 = Integer.toString(num_A3);
				btn_A3.setText(text_A3);
			}
		}
	}
	//==================================A3 Button Listener=======================================
	
	//==================================A4 Button Listener=======================================
	private class A4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A4){
				String text_A4;
				if (num_A4 == 9){
					num_A4 = 0;
				}
				num_A4++;
				text_A4 = Integer.toString(num_A4);
				btn_A4.setText(text_A4);
			}
		}
	}
	//==================================A4 Button Listener=======================================
	
	//==================================A5 Button Listener=======================================
	private class A5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A5){
				String text_A5;
				if (num_A5 == 9){
					num_A5 = 0;
				}
				num_A5++;
				text_A5 = Integer.toString(num_A5);
				btn_A5.setText(text_A5);
			}
		}
	}
	//==================================A5 Button Listener=======================================
	
	//==================================A6 Button Listener=======================================
	private class A6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A6){
				String text_A6;
				if (num_A6 == 9){
					num_A6 = 0;
				}
				num_A6++;
				text_A6 = Integer.toString(num_A6);
				btn_A6.setText(text_A6);
			}
		}
	}
	//==================================A6 Button Listener=======================================
	
	//==================================A7 Button Listener=======================================
	private class A7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A7){
				String text_A7;
				if (num_A7 == 9){
					num_A7 = 0;
				}
				num_A7++;
				text_A7 = Integer.toString(num_A7);
				btn_A7.setText(text_A7);
			}
		}
	}
	//==================================A7 Button Listener=======================================
	
	//==================================A8 Button Listener=======================================
	private class A8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A8){
				String text_A8;
				if (num_A8 == 9){
					num_A8 = 0;
				}
				num_A8++;
				text_A8 = Integer.toString(num_A8);
				btn_A8.setText(text_A8);
			}
		}
	}
	//==================================A8 Button Listener=======================================
	
	//==================================A9 Button Listener=======================================
	private class A9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_A9){
				String text_A9;
				if (num_A9 == 9){
					num_A9 = 0;
				}
				num_A9++;
				text_A9 = Integer.toString(num_A9);
				btn_A9.setText(text_A9);
			}
		}
	}
	//==================================A9 Button Listener=======================================
	
	//==================================B1 Button Listener=======================================
	private class B1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B1){
				String text_B1;
				if (num_B1 == 9){
					num_B1 = 0;
				}
				num_B1++;
				text_B1 = Integer.toString(num_B1);
				btn_B1.setText(text_B1);
			}
		}
	}
	//==================================B1 Button Listener=======================================
	
	//==================================B2 Button Listener=======================================
	private class B2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B2){
				String text_B2;
				if (num_B2 == 9){
					num_B2 = 0;
				}
				num_B2++;
				text_B2 = Integer.toString(num_B2);
				btn_B2.setText(text_B2);
			}
		}
	}
	//==================================B2 Button Listener=======================================
	
	//==================================B3 Button Listener=======================================
	private class B3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B3){
				String text_B3;
				if (num_B3 == 9){
					num_B3 = 0;
				}
				num_B3++;
				text_B3 = Integer.toString(num_B3);
				btn_B3.setText(text_B3);
			}
		}
	}
	//==================================B3 Button Listener=======================================
	
	//==================================B4 Button Listener=======================================
	private class B4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B4){
				String text_B4;
				if (num_B4 == 9){
					num_B4 = 0;
				}
				num_B4++;
				text_B4 = Integer.toString(num_B4);
				btn_B4.setText(text_B4);
			}
		}
	}
	//==================================B4 Button Listener=======================================
	
	//==================================B5 Button Listener=======================================
	private class B5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B5){
				String text_B5;
				if (num_B5 == 9){
					num_B5 = 0;
				}
				num_B5++;
				text_B5 = Integer.toString(num_B5);
				btn_B5.setText(text_B5);
			}
		}
	}
	//==================================B5 Button Listener=======================================
	
	//==================================B6 Button Listener=======================================
	private class B6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B6){
				String text_B6;
				if (num_B6 == 9){
					num_B6 = 0;
				}
				num_B6++;
				text_B6 = Integer.toString(num_B6);
				btn_B6.setText(text_B6);
			}
		}
	}
	//==================================B6 Button Listener=======================================
	
	//==================================B7 Button Listener=======================================
	private class B7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B7){
				String text_B7;
				if (num_B7 == 9){
					num_B7 = 0;
				}
				num_B7++;
				text_B7 = Integer.toString(num_B7);
				btn_B7.setText(text_B7);
			}
		}
	}
	//==================================B7 Button Listener=======================================
	
	//==================================B8 Button Listener=======================================
	private class B8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B8){
				String text_B8;
				if (num_B8 == 9){
					num_B8 = 0;
				}
				num_B8++;
				text_B8 = Integer.toString(num_B8);
				btn_B8.setText(text_B8);
			}
		}
	}
	//==================================B8 Button Listener=======================================
	
	//==================================B9 Button Listener=======================================
	private class B9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_B9){
				String text_B9;
				if (num_B9 == 9){
					num_B9 = 0;
				}
				num_B9++;
				text_B9 = Integer.toString(num_B9);
				btn_B9.setText(text_B9);
			}
		}
	}
	//==================================B9 Button Listener=======================================
	
	//==================================C1 Button Listener=======================================
	private class C1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C1){
				String text_C1;
				if (num_C1 == 9){
					num_C1 = 0;
				}
				num_C1++;
				text_C1 = Integer.toString(num_C1);
				btn_C1.setText(text_C1);
			}
		}
	}
	//==================================C1 Button Listener=======================================
	
	//==================================C2 Button Listener=======================================
	private class C2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C2){
				String text_C2;
				if (num_C2 == 9){
					num_C2 = 0;
				}
				num_C2++;
				text_C2 = Integer.toString(num_C2);
				btn_C2.setText(text_C2);
			}
		}
	}
	//==================================C2 Button Listener=======================================
	
	//==================================C3 Button Listener=======================================
	private class C3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C3){
				String text_C3;
				if (num_C3 == 9){
					num_C3 = 0;
				}
				num_C3++;
				text_C3 = Integer.toString(num_C3);
				btn_C3.setText(text_C3);
			}
		}
	}
	//==================================C3 Button Listener=======================================
	
	//==================================C4 Button Listener=======================================
	private class C4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C4){
				String text_C4;
				if (num_C4 == 9){
					num_C4 = 0;
				}
				num_C4++;
				text_C4 = Integer.toString(num_C4);
				btn_C4.setText(text_C4);
			}
		}
	}
	//==================================C4 Button Listener=======================================
	
	//==================================C5 Button Listener=======================================
	private class C5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C5){
				String text_C5;
				if (num_C5 == 9){
					num_C5 = 0;
				}
				num_C5++;
				text_C5 = Integer.toString(num_C5);
				btn_C5.setText(text_C5);
			}
		}
	}
	//==================================C5 Button Listener=======================================
	
	//==================================C6 Button Listener=======================================
	private class C6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C6){
				String text_C6;
				if (num_C6 == 9){
					num_C6 = 0;
				}
				num_C6++;
				text_C6 = Integer.toString(num_C6);
				btn_C6.setText(text_C6);
			}
		}
	}
	//==================================C6 Button Listener=======================================
	
	//==================================C7 Button Listener=======================================
	private class C7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C7){
				String text_C7;
				if (num_C7 == 9){
					num_C7 = 0;
				}
				num_C7++;
				text_C7 = Integer.toString(num_C7);
				btn_C7.setText(text_C7);
			}
		}
	}
	//==================================C7 Button Listener=======================================
	
	//==================================C8 Button Listener=======================================
	private class C8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C8){
				String text_C8;
				if (num_C8 == 9){
					num_C8 = 0;
				}
				num_C8++;
				text_C8 = Integer.toString(num_C8);
				btn_C8.setText(text_C8);
			}
		}
	}
	//==================================C8 Button Listener=======================================
	
	//==================================C9 Button Listener=======================================
	private class C9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_C9){
				String text_C9;
				if (num_C9 == 9){
					num_C9 = 0;
				}
				num_C9++;
				text_C9 = Integer.toString(num_C9);
				btn_C9.setText(text_C9);
			}
		}
	}
	//==================================C9 Button Listener=======================================
	
	//==================================D1 Button Listener=======================================
	private class D1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D1){
				String text_D1;
				if (num_D1 == 9){
					num_D1 = 0;
				}
				num_D1++;
				text_D1 = Integer.toString(num_D1);
				btn_D1.setText(text_D1);
			}
		}
	}
	//==================================D1 Button Listener=======================================
	
	//==================================D2 Button Listener=======================================
	private class D2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D2){
				String text_D2;
				if (num_D2 == 9){
					num_D2 = 0;
				}
				num_D2++;
				text_D2 = Integer.toString(num_D2);
				btn_D2.setText(text_D2);
			}
		}
	}
	//==================================D2 Button Listener=======================================
	
	//==================================D3 Button Listener=======================================
	private class D3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D3){
				String text_D3;
				if (num_D3 == 9){
					num_D3 = 0;
				}
				num_D3++;
				text_D3 = Integer.toString(num_D3);
				btn_D3.setText(text_D3);
			}
		}
	}
	//==================================D3 Button Listener=======================================
	
	//==================================D4 Button Listener=======================================
	private class D4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D4){
				String text_D4;
				if (num_D4 == 9){
					num_D4 = 0;
				}
				num_D4++;
				text_D4 = Integer.toString(num_D4);
				btn_D4.setText(text_D4);
			}
		}
	}
	//==================================D4 Button Listener=======================================
	
	//==================================D5 Button Listener=======================================
	private class D5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D5){
				String text_D5;
				if (num_D5 == 9){
					num_D5 = 0;
				}
				num_D5++;
				text_D5 = Integer.toString(num_D5);
				btn_D5.setText(text_D5);
			}
		}
	}
	//==================================D5 Button Listener=======================================
	
	//==================================D6 Button Listener=======================================
	private class D6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D6){
				String text_D6;
				if (num_D6 == 9){
					num_D6 = 0;
				}
				num_D6++;
				text_D6 = Integer.toString(num_D6);
				btn_D6.setText(text_D6);
			}
		}
	}
	//==================================D6 Button Listener=======================================
	
	//==================================D7 Button Listener=======================================
	private class D7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D7){
				String text_D7;
				if (num_D7 == 9){
					num_D7 = 0;
				}
				num_D7++;
				text_D7 = Integer.toString(num_D7);
				btn_D7.setText(text_D7);
			}
		}
	}
	//==================================D7 Button Listener=======================================
	
	//==================================D8 Button Listener=======================================
	private class D8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D8){
				String text_D8;
				if (num_D8 == 9){
					num_D8 = 0;
				}
				num_D8++;
				text_D8 = Integer.toString(num_D8);
				btn_D8.setText(text_D8);
			}
		}
	}
	//==================================D8 Button Listener=======================================
	
	//==================================D9 Button Listener=======================================
	private class D9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_D9){
				String text_D9;
				if (num_D9 == 9){
					num_D9 = 0;
				}
				num_D9++;
				text_D9 = Integer.toString(num_D9);
				btn_D9.setText(text_D9);
			}
		}
	}
	//==================================D9 Button Listener=======================================
	
	//==================================E1 Button Listener=======================================
	private class E1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E1){
				String text_E1;
				if (num_E1 == 9){
					num_E1 = 0;
				}
				num_E1++;
				text_E1 = Integer.toString(num_E1);
				btn_E1.setText(text_E1);
			}
		}
	}
	//==================================E1 Button Listener=======================================
	
	//==================================E2 Button Listener=======================================
	private class E2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E2){
				String text_E2;
				if (num_E2 == 9){
					num_E2 = 0;
				}
				num_E2++;
				text_E2 = Integer.toString(num_E2);
				btn_E2.setText(text_E2);
			}
		}
	}
	//==================================E2 Button Listener=======================================
	
	//==================================E3 Button Listener=======================================
	private class E3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E3){
				String text_E3;
				if (num_E3 == 9){
					num_E3 = 0;
				}
				num_E3++;
				text_E3 = Integer.toString(num_E3);
				btn_E3.setText(text_E3);
			}
		}
	}
	//==================================E3 Button Listener=======================================
	
	//==================================E4 Button Listener=======================================
	private class E4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E4){
				String text_E4;
				if (num_E4 == 9){
					num_E4 = 0;
				}
				num_E4++;
				text_E4 = Integer.toString(num_E4);
				btn_E4.setText(text_E4);
			}
		}
	}
	//==================================E4 Button Listener=======================================
	
	//==================================E5 Button Listener=======================================
	private class E5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E5){
				String text_E5;
				if (num_E5 == 9){
					num_E5 = 0;
				}
				num_E5++;
				text_E5 = Integer.toString(num_E5);
				btn_E5.setText(text_E5);
			}
		}
	}
	//==================================E5 Button Listener=======================================
	
	//==================================E6 Button Listener=======================================
	private class E6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E6){
				String text_E6;
				if (num_E6 == 9){
					num_E6 = 0;
				}
				num_E6++;
				text_E6 = Integer.toString(num_E6);
				btn_E6.setText(text_E6);
			}
		}
	}
	//==================================E6 Button Listener=======================================
	
	//==================================E7 Button Listener=======================================
	private class E7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E7){
				String text_E7;
				if (num_E7 == 9){
					num_E7 = 0;
				}
				num_E7++;
				text_E7 = Integer.toString(num_E7);
				btn_E7.setText(text_E7);
			}
		}
	}
	//==================================E7 Button Listener=======================================
	
	//==================================E8 Button Listener=======================================
	private class E8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E8){
				String text_E8;
				if (num_E8 == 9){
					num_E8 = 0;
				}
				num_E8++;
				text_E8 = Integer.toString(num_E8);
				btn_E8.setText(text_E8);
			}
		}
	}
	//==================================E8 Button Listener=======================================
	
	//==================================E9 Button Listener=======================================
	private class E9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_E9){
				String text_E9;
				if (num_E9 == 9){
					num_E9 = 0;
				}
				num_E9++;
				text_E9 = Integer.toString(num_E9);
				btn_E9.setText(text_E9);
			}
		}
	}
	//==================================E9 Button Listener=======================================
	
	//==================================F1 Button Listener=======================================
	private class F1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F1){
				String text_F1;
				if (num_F1 == 9){
					num_F1 = 0;
				}
				num_F1++;
				text_F1 = Integer.toString(num_F1);
				btn_F1.setText(text_F1);
			}
		}
	}
	//==================================F1 Button Listener=======================================
	
	//==================================F2 Button Listener=======================================
	private class F2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F2){
				String text_F2;
				if (num_F2 == 9){
					num_F2 = 0;
				}
				num_F2++;
				text_F2 = Integer.toString(num_F2);
				btn_F2.setText(text_F2);
			}
		}
	}
	//==================================F2 Button Listener=======================================
	
	//==================================F3 Button Listener=======================================
	private class F3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F3){
				String text_F3;
				if (num_F3 == 9){
					num_F3 = 0;
				}
				num_F3++;
				text_F3 = Integer.toString(num_F3);
				btn_F3.setText(text_F3);
			}
		}
	}
	//==================================F3 Button Listener=======================================
	
	//==================================F4 Button Listener=======================================
	private class F4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F4){
				String text_F4;
				if (num_F4 == 9){
					num_F4 = 0;
				}
				num_F4++;
				text_F4 = Integer.toString(num_F4);
				btn_F4.setText(text_F4);
			}
		}
	}
	//==================================F4 Button Listener=======================================
	
	//==================================F5 Button Listener=======================================
	private class F5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F5){
				String text_F5;
				if (num_F5 == 9){
					num_F5 = 0;
				}
				num_F5++;
				text_F5 = Integer.toString(num_F5);
				btn_F5.setText(text_F5);
			}
		}
	}
	//==================================F5 Button Listener=======================================
	
	//==================================F6 Button Listener=======================================
	private class F6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F6){
				String text_F6;
				if (num_F6 == 9){
					num_F6 = 0;
				}
				num_F6++;
				text_F6 = Integer.toString(num_F6);
				btn_F6.setText(text_F6);
			}
		}
	}
	//==================================F6 Button Listener=======================================
	
	//==================================F7 Button Listener=======================================
	private class F7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F7){
				String text_F7;
				if (num_F7 == 9){
					num_F7 = 0;
				}
				num_F7++;
				text_F7 = Integer.toString(num_F7);
				btn_F7.setText(text_F7);
			}
		}
	}
	//==================================F7 Button Listener=======================================
	
	//==================================F8 Button Listener=======================================
	private class F8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F8){
				String text_F8;
				if (num_F8 == 9){
					num_F8 = 0;
				}
				num_F8++;
				text_F8 = Integer.toString(num_F8);
				btn_F8.setText(text_F8);
			}
		}
	}
	//==================================F8 Button Listener=======================================
	
	//==================================F9 Button Listener=======================================
	private class F9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_F9){
				String text_F9;
				if (num_F9 == 9){
					num_F9 = 0;
				}
				num_F9++;
				text_F9 = Integer.toString(num_F9);
				btn_F9.setText(text_F9);
			}
		}
	}
	//==================================F9 Button Listener=======================================
	
	//==================================G1 Button Listener=======================================
	private class G1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G1){
				String text_G1;
				if (num_G1 == 9){
					num_G1 = 0;
				}
				num_G1++;
				text_G1 = Integer.toString(num_G1);
				btn_G1.setText(text_G1);
			}
		}
	}
	//==================================G1 Button Listener=======================================
	
	//==================================G2 Button Listener=======================================
	private class G2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G2){
				String text_G2;
				if (num_G2 == 9){
					num_G2 = 0;
				}
				num_G2++;
				text_G2 = Integer.toString(num_G2);
				btn_G2.setText(text_G2);
			}
		}
	}
	//==================================G2 Button Listener=======================================
	
	//==================================G3 Button Listener=======================================
	private class G3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G3){
				String text_G3;
				if (num_G3 == 9){
					num_G3 = 0;
				}
				num_G3++;
				text_G3 = Integer.toString(num_G3);
				btn_G3.setText(text_G3);
			}
		}
	}
	//==================================G3 Button Listener=======================================
	
	//==================================G4 Button Listener=======================================
	private class G4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G4){
				String text_G4;
				if (num_G4 == 9){
					num_G4 = 0;
				}
				num_G4++;
				text_G4 = Integer.toString(num_G4);
				btn_G4.setText(text_G4);
			}
		}
	}
	//==================================G4 Button Listener=======================================
	
	//==================================G5 Button Listener=======================================
	private class G5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G5){
				String text_G5;
				if (num_G5 == 9){
					num_G5 = 0;
				}
				num_G5++;
				text_G5 = Integer.toString(num_G5);
				btn_G5.setText(text_G5);
			}
		}
	}
	//==================================G5 Button Listener=======================================
	
	//==================================G6 Button Listener=======================================
	private class G6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G6){
				String text_G6;
				if (num_G6 == 9){
					num_G6 = 0;
				}
				num_G6++;
				text_G6 = Integer.toString(num_G6);
				btn_G6.setText(text_G6);
			}
		}
	}
	//==================================G6 Button Listener=======================================
	
	//==================================G7 Button Listener=======================================
	private class G7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G7){
				String text_G7;
				if (num_G7 == 9){
					num_G7 = 0;
				}
				num_G7++;
				text_G7 = Integer.toString(num_G7);
				btn_G7.setText(text_G7);
			}
		}
	}
	//==================================G7 Button Listener=======================================
	
	//==================================G8 Button Listener=======================================
	private class G8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G8){
				String text_G8;
				if (num_G8 == 9){
					num_G8 = 0;
				}
				num_G8++;
				text_G8 = Integer.toString(num_G8);
				btn_G8.setText(text_G8);
			}
		}
	}
	//==================================G8 Button Listener=======================================
	
	//==================================G9 Button Listener=======================================
	private class G9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_G9){
				String text_G9;
				if (num_G9 == 9){
					num_G9 = 0;
				}
				num_G9++;
				text_G9 = Integer.toString(num_G9);
				btn_G9.setText(text_G9);
			}
		}
	}
	//==================================G9 Button Listener=======================================
	
	//==================================H1 Button Listener=======================================
	private class H1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H1){
				String text_H1;
				if (num_H1 == 9){
					num_H1 = 0;
				}
				num_H1++;
				text_H1 = Integer.toString(num_H1);
				btn_H1.setText(text_H1);
			}
		}
	}
	//==================================H1 Button Listener=======================================
	
	//==================================H2 Button Listener=======================================
	private class H2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H2){
				String text_H2;
				if (num_H2 == 9){
					num_H2 = 0;
				}
				num_H2++;
				text_H2 = Integer.toString(num_H2);
				btn_H2.setText(text_H2);
			}
		}
	}
	//==================================H2 Button Listener=======================================
	
	//==================================H3 Button Listener=======================================
	private class H3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H3){
				String text_H3;
				if (num_H3 == 9){
					num_H3 = 0;
				}
				num_H3++;
				text_H3 = Integer.toString(num_H3);
				btn_H3.setText(text_H3);
			}
		}
	}
	//==================================H3 Button Listener=======================================
	
	//==================================H4 Button Listener=======================================
	private class H4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H4){
				String text_H4;
				if (num_H4 == 9){
					num_H4 = 0;
				}
				num_H4++;
				text_H4 = Integer.toString(num_H4);
				btn_H4.setText(text_H4);
			}
		}
	}
	//==================================H4 Button Listener=======================================
	
	//==================================H5 Button Listener=======================================
	private class H5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H5){
				String text_H5;
				if (num_H5 == 9){
					num_H5 = 0;
				}
				num_H5++;
				text_H5 = Integer.toString(num_H5);
				btn_H5.setText(text_H5);
			}
		}
	}
	//==================================H5 Button Listener=======================================
	
	//==================================H6 Button Listener=======================================
	private class H6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H6){
				String text_H6;
				if (num_H6 == 9){
					num_H6 = 0;
				}
				num_H6++;
				text_H6 = Integer.toString(num_H6);
				btn_H6.setText(text_H6);
			}
		}
	}
	//==================================H6 Button Listener=======================================
	
	//==================================H7 Button Listener=======================================
	private class H7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H7){
				String text_H7;
				if (num_H7 == 9){
					num_H7 = 0;
				}
				num_H7++;
				text_H7 = Integer.toString(num_H7);
				btn_H7.setText(text_H7);
			}
		}
	}
	//==================================H7 Button Listener=======================================
	
	//==================================H8 Button Listener=======================================
	private class H8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H8){
				String text_H8;
				if (num_H8 == 9){
					num_H8 = 0;
				}
				num_H8++;
				text_H8 = Integer.toString(num_H8);
				btn_H8.setText(text_H8);
			}
		}
	}
	//==================================H8 Button Listener=======================================
	
	//==================================H9 Button Listener=======================================
	private class H9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_H9){
				String text_H9;
				if (num_H9 == 9){
					num_H9 = 0;
				}
				num_H9++;
				text_H9 = Integer.toString(num_H9);
				btn_H9.setText(text_H9);
			}
		}
	}
	//==================================H9 Button Listener=======================================
	
	//==================================I1 Button Listener=======================================
	private class I1_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I1){
				String text_I1;
				if (num_I1 == 9){
					num_I1 = 0;
				}
				num_I1++;
				text_I1 = Integer.toString(num_I1);
				btn_I1.setText(text_I1);
			}
		}
	}
	//==================================I1 Button Listener=======================================
	
	//==================================I2 Button Listener=======================================
	private class I2_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I2){
				String text_I2;
				if (num_I2 == 9){
					num_I2 = 0;
				}
				num_I2++;
				text_I2 = Integer.toString(num_I2);
				btn_I2.setText(text_I2);
			}
		}
	}
	//==================================I2 Button Listener=======================================
	
	//==================================I3 Button Listener=======================================
	private class I3_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I3){
				String text_I3;
				if (num_I3 == 9){
					num_I3 = 0;
				}
				num_I3++;
				text_I3 = Integer.toString(num_I3);
				btn_I3.setText(text_I3);
			}
		}
	}
	//==================================I3 Button Listener=======================================
	
	//==================================I4 Button Listener=======================================
	private class I4_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I4){
				String text_I4;
				if (num_I4 == 9){
					num_I4 = 0;
				}
				num_I4++;
				text_I4 = Integer.toString(num_I4);
				btn_I4.setText(text_I4);
			}
		}
	}
	//==================================I4 Button Listener=======================================
	
	//==================================I5 Button Listener=======================================
	private class I5_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I5){
				String text_I5;
				if (num_I5 == 9){
					num_I5 = 0;
				}
				num_I5++;
				text_I5 = Integer.toString(num_I5);
				btn_I5.setText(text_I5);
			}
		}
	}
	//==================================I5 Button Listener=======================================
	
	//==================================I6 Button Listener=======================================
	private class I6_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I6){
				String text_I6;
				if (num_I6 == 9){
					num_I6 = 0;
				}
				num_I6++;
				text_I6 = Integer.toString(num_I6);
				btn_I6.setText(text_I6);
			}
		}
	}
	//==================================I6 Button Listener=======================================
	
	//==================================I7 Button Listener=======================================
	private class I7_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I7){
				String text_I7;
				if (num_I7 == 9){
					num_I7 = 0;
				}
				num_I7++;
				text_I7 = Integer.toString(num_I7);
				btn_I7.setText(text_I7);
			}
		}
	}
	//==================================I7 Button Listener=======================================
	
	//==================================I8 Button Listener=======================================
	private class I8_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I8){
				String text_I8;
				if (num_I8 == 9){
					num_I8 = 0;
				}
				num_I8++;
				text_I8 = Integer.toString(num_I8);
				btn_I8.setText(text_I8);
			}
		}
	}
	//==================================I8 Button Listener=======================================
	
	//==================================I9 Button Listener=======================================
	private class I9_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_I9){
				String text_I9;
				if (num_I9 == 9){
					num_I9 = 0;
				}
				num_I9++;
				text_I9 = Integer.toString(num_I9);
				btn_I9.setText(text_I9);
			}
		}
	}
	//==================================I9 Button Listener=======================================
	
	//==================================Play Button Listener=======================================
	private class play_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_play){
				pan_menuBack.setVisible(false);
				pan_difficulty.setVisible(true);
			}
		}
	}
	//==================================Play Button Listener=======================================
	
	//==================================Easy Button Listener=======================================
	private class easy_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_play){
				pan_difficulty.setVisible(false);
				pan_easyLevelSelect.setVisible(true);
			}
		}
	}
	//==================================Easy Button Listener=======================================
	
	//==================================Medium Button Listener=======================================
	private class medium_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_play){
				pan_difficulty.setVisible(false);
				pan_mediumLevelSelect.setVisible(true);
			}
		}
	}
	//==================================Medium Button Listener=======================================
	
	//==================================Hard Button Listener=======================================
	private class hard_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_play){
				pan_difficulty.setVisible(false);
				pan_hardLevelSelect.setVisible(true);
			}
		}
	}
	//==================================Hard Button Listener=======================================
	
	//==================================Help Button Listener=======================================
	private class help_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_help){
				frm_menu.setVisible(false);
				frm_help.setVisible(true);
			}
		}
	}
	//==================================Help Button Listener=======================================
	
	//==================================Go Back Button Listener=======================================
	private class helpBack_buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			if (click.getSource() == btn_helpBack){
				frm_help.setVisible(false);
				frm_menu.setVisible(true);
			}
		}
	}
	//==================================Go Back Button Listener=======================================
	
	//==================================Main Method====================================
	public static void main (String[] args){
		new Str8ts();
	}
	//==================================Main Method====================================
}
