package application;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LedScreenApp {

	private JFrame LedScreen;
	private JTextField txtWeightLedDisplay;
	private JTextField txtConsumption;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JButton btnCalculate;
	private JLabel lblResultScreenSize;
	private JLabel lblResultAmountLedDisplay;
	private JLabel lblResultConsumption;
	private JLabel lblResultWeight;
	private JTextField weight;
	private JTextField consumptionWatts;
	private JTextField sizeWidth;
	private JTextField sizeHeight;
	private JLabel lblResultResolutionPixels;
	private JTextField txtDevelopedBythiagoribeiro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LedScreenApp window = new LedScreenApp();
					window.LedScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LedScreenApp() {
		initialize();
	}

	private void initialize() {
		LedScreen = new JFrame();
		LedScreen.setResizable(false);
		LedScreen.setTitle("Led Screen");
		LedScreen.setBounds(100, 100, 643, 377);
		LedScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LedScreen.getContentPane().setLayout(null);

		txtWeightLedDisplay = new JTextField();
		txtWeightLedDisplay.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtWeightLedDisplay.setBounds(445, 11, 150, 25);
		LedScreen.getContentPane().add(txtWeightLedDisplay);

		txtConsumption = new JTextField();
		txtConsumption.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtConsumption.setBounds(445, 41, 150, 25);
		LedScreen.getContentPane().add(txtConsumption);

		txtWidth = new JTextField();
		txtWidth.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtWidth.setBounds(445, 71, 150, 25);
		LedScreen.getContentPane().add(txtWidth);

		txtHeight = new JTextField();
		txtHeight.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtHeight.setBounds(445, 101, 150, 25);
		LedScreen.getContentPane().add(txtHeight);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnCalculate.setBounds(445, 131, 150, 25);
		LedScreen.getContentPane().add(btnCalculate);

		lblResultScreenSize = new JLabel();
		lblResultScreenSize.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultScreenSize.setBounds(10, 168, 340, 25);
		LedScreen.getContentPane().add(lblResultScreenSize);

		lblResultAmountLedDisplay = new JLabel();
		lblResultAmountLedDisplay.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultAmountLedDisplay.setBounds(10, 198, 385, 25);
		LedScreen.getContentPane().add(lblResultAmountLedDisplay);

		lblResultConsumption = new JLabel();
		lblResultConsumption.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultConsumption.setBounds(10, 258, 325, 25);
		LedScreen.getContentPane().add(lblResultConsumption);

		lblResultWeight = new JLabel();
		lblResultWeight.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultWeight.setBounds(10, 288, 325, 25);
		LedScreen.getContentPane().add(lblResultWeight);

		weight = new JTextField();
		weight.setEditable(false);
		weight.setFont(new Font("Segoe UI", Font.BOLD, 15));
		weight.setText("What is the weight of each led display?");
		weight.setBounds(10, 11, 340, 25);
		LedScreen.getContentPane().add(weight);
		weight.setColumns(10);

		consumptionWatts = new JTextField();
		consumptionWatts.setEditable(false);
		consumptionWatts.setFont(new Font("Segoe UI", Font.BOLD, 15));
		consumptionWatts.setHorizontalAlignment(SwingConstants.LEFT);
		consumptionWatts.setText("How much is the consumption of each display?");
		consumptionWatts.setColumns(10);
		consumptionWatts.setBounds(10, 41, 340, 25);
		LedScreen.getContentPane().add(consumptionWatts);

		sizeWidth = new JTextField();
		sizeWidth.setEditable(false);
		sizeWidth.setFont(new Font("Segoe UI", Font.BOLD, 15));
		sizeWidth.setText("What is the size of the panel (width) meters?");
		sizeWidth.setHorizontalAlignment(SwingConstants.LEFT);
		sizeWidth.setColumns(10);
		sizeWidth.setBounds(10, 71, 340, 25);
		LedScreen.getContentPane().add(sizeWidth);

		sizeHeight = new JTextField();
		sizeHeight.setEditable(false);
		sizeHeight.setFont(new Font("Segoe UI", Font.BOLD, 15));
		sizeHeight.setText("What is the size of the panel (height) meters?");
		sizeHeight.setHorizontalAlignment(SwingConstants.LEFT);
		sizeHeight.setColumns(10);
		sizeHeight.setBounds(10, 101, 340, 25);
		LedScreen.getContentPane().add(sizeHeight);

		lblResultResolutionPixels = new JLabel();
		lblResultResolutionPixels.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultResolutionPixels.setBounds(10, 228, 325, 25);
		LedScreen.getContentPane().add(lblResultResolutionPixels);

		txtDevelopedBythiagoribeiro = new JTextField();
		txtDevelopedBythiagoribeiro.setEditable(false);
		txtDevelopedBythiagoribeiro.setText("Developed by @thiago-ribeiro1");
		txtDevelopedBythiagoribeiro.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtDevelopedBythiagoribeiro.setBounds(424, 307, 171, 20);
		LedScreen.getContentPane().add(txtDevelopedBythiagoribeiro);
		txtDevelopedBythiagoribeiro.setColumns(10);

		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int weightLedDisplay = Integer.parseInt(txtWeightLedDisplay.getText());
				int consumption = Integer.parseInt(txtConsumption.getText());
				int width = Integer.parseInt(txtWidth.getText());
				int height = Integer.parseInt(txtHeight.getText());

				int panelSize = width * height;
				int ledDisplayTotalSize = panelSize * 2;
				int totalConsumption = ledDisplayTotalSize * consumption;
				int totalWeight = ledDisplayTotalSize * weightLedDisplay;
				int totalPixelsHorizontal = (width * 104) * 2;
				int totalPixelsVertical = height * 208;

				lblResultScreenSize.setText("Panel size in square meters: " + panelSize + " m²");
				lblResultAmountLedDisplay.setText("Amount of led displays: " + ledDisplayTotalSize);
				lblResultResolutionPixels
						.setText("Pixels resolution: " + totalPixelsHorizontal + "x" + totalPixelsVertical);
				lblResultConsumption.setText("Total consumption: " + totalConsumption + " Watts");
				lblResultWeight.setText("Total weight: " + totalWeight + " kg");
			}
		});

	}
}
