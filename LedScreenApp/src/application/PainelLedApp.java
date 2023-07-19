package application;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PainelLedApp {

	private JFrame PainelLed;
	private JTextField txtPesoPlaca;
	private JTextField txtConsumoPlaca;
	private JTextField txtLargura;
	private JTextField txtAltura;
	private JButton btnCalcular;
	private JLabel lblResultadoTamanhoPainel;
	private JLabel lblResultadoQuantidadePlacas;
	private JLabel lblResultadoConsumo;
	private JLabel lblResultadoPeso;
	private JTextField peso;
	private JTextField consumoWatts;
	private JTextField tamanhoPainel_lar;
	private JTextField tamanhoPainel_alt;
	private JLabel lblResultadoResolucaoPixels;
	private JTextField txtDevelopedBythiagoribeiro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelLedApp window = new PainelLedApp();
					window.PainelLed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PainelLedApp() {
		initialize();
	}

	private void initialize() {
		PainelLed = new JFrame();
		PainelLed.setResizable(false);
		PainelLed.setTitle("Led Screen");
		PainelLed.setBounds(100, 100, 643, 377);
		PainelLed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PainelLed.getContentPane().setLayout(null);

		txtPesoPlaca = new JTextField();
		txtPesoPlaca.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPesoPlaca.setBounds(445, 11, 150, 25);
		PainelLed.getContentPane().add(txtPesoPlaca);

		txtConsumoPlaca = new JTextField();
		txtConsumoPlaca.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtConsumoPlaca.setBounds(445, 41, 150, 25);
		PainelLed.getContentPane().add(txtConsumoPlaca);

		txtLargura = new JTextField();
		txtLargura.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtLargura.setBounds(445, 71, 150, 25);
		PainelLed.getContentPane().add(txtLargura);

		txtAltura = new JTextField();
		txtAltura.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtAltura.setBounds(445, 101, 150, 25);
		PainelLed.getContentPane().add(txtAltura);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnCalcular.setBounds(445, 131, 150, 25);
		PainelLed.getContentPane().add(btnCalcular);

		lblResultadoTamanhoPainel = new JLabel();
		lblResultadoTamanhoPainel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultadoTamanhoPainel.setBounds(10, 168, 340, 25);
		PainelLed.getContentPane().add(lblResultadoTamanhoPainel);

		lblResultadoQuantidadePlacas = new JLabel();
		lblResultadoQuantidadePlacas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultadoQuantidadePlacas.setBounds(10, 198, 385, 25);
		PainelLed.getContentPane().add(lblResultadoQuantidadePlacas);

		lblResultadoConsumo = new JLabel();
		lblResultadoConsumo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultadoConsumo.setBounds(10, 258, 325, 25);
		PainelLed.getContentPane().add(lblResultadoConsumo);

		lblResultadoPeso = new JLabel();
		lblResultadoPeso.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultadoPeso.setBounds(10, 288, 325, 25);
		PainelLed.getContentPane().add(lblResultadoPeso);

		peso = new JTextField();
		peso.setEditable(false);
		peso.setFont(new Font("Segoe UI", Font.BOLD, 15));
		peso.setText("Qual o peso da placa? ");
		peso.setBounds(10, 11, 189, 25);
		PainelLed.getContentPane().add(peso);
		peso.setColumns(10);

		consumoWatts = new JTextField();
		consumoWatts.setEditable(false);
		consumoWatts.setFont(new Font("Segoe UI", Font.BOLD, 15));
		consumoWatts.setHorizontalAlignment(SwingConstants.LEFT);
		consumoWatts.setText("Quanto consome cada placa em Watts?");
		consumoWatts.setColumns(10);
		consumoWatts.setBounds(10, 41, 311, 25);
		PainelLed.getContentPane().add(consumoWatts);

		tamanhoPainel_lar = new JTextField();
		tamanhoPainel_lar.setEditable(false);
		tamanhoPainel_lar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		tamanhoPainel_lar.setText("Qual o tamanho do painel (largura) metros? ");
		tamanhoPainel_lar.setHorizontalAlignment(SwingConstants.LEFT);
		tamanhoPainel_lar.setColumns(10);
		tamanhoPainel_lar.setBounds(10, 71, 340, 25);
		PainelLed.getContentPane().add(tamanhoPainel_lar);

		tamanhoPainel_alt = new JTextField();
		tamanhoPainel_alt.setEditable(false);
		tamanhoPainel_alt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		tamanhoPainel_alt.setText("Qual o tamanho do painel (altura) metros? ");
		tamanhoPainel_alt.setHorizontalAlignment(SwingConstants.LEFT);
		tamanhoPainel_alt.setColumns(10);
		tamanhoPainel_alt.setBounds(10, 101, 340, 25);
		PainelLed.getContentPane().add(tamanhoPainel_alt);

		lblResultadoResolucaoPixels = new JLabel();
		lblResultadoResolucaoPixels.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResultadoResolucaoPixels.setBounds(10, 228, 325, 25);
		PainelLed.getContentPane().add(lblResultadoResolucaoPixels);

		txtDevelopedBythiagoribeiro = new JTextField();
		txtDevelopedBythiagoribeiro.setEditable(false);
		txtDevelopedBythiagoribeiro.setText("Developed by @thiago-ribeiro1");
		txtDevelopedBythiagoribeiro.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtDevelopedBythiagoribeiro.setBounds(424, 307, 171, 20);
		PainelLed.getContentPane().add(txtDevelopedBythiagoribeiro);
		txtDevelopedBythiagoribeiro.setColumns(10);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pesoPlaca = Integer.parseInt(txtPesoPlaca.getText());
				int consumoPlaca = Integer.parseInt(txtConsumoPlaca.getText());
				int largura = Integer.parseInt(txtLargura.getText());
				int altura = Integer.parseInt(txtAltura.getText());

				int tamanhoPainel = largura * altura;
				int tamanhoTotalPlacas = tamanhoPainel * 2;
				int consumoTotal = tamanhoTotalPlacas * consumoPlaca;
				int pesoTotal = tamanhoTotalPlacas * pesoPlaca;
				int totalPixelsHorizontal = (largura * 104) * 2;
				int totalPixelsVertical = altura * 208;

				lblResultadoTamanhoPainel.setText("Tamanho do painel: " + tamanhoPainel + " m²");
				lblResultadoQuantidadePlacas.setText("Quantidade de placas: " + tamanhoTotalPlacas);
				lblResultadoResolucaoPixels
						.setText("Resolução pixels: " + totalPixelsHorizontal + "x" + totalPixelsVertical);
				lblResultadoConsumo.setText("Consumo total: " + consumoTotal + " Watts");
				lblResultadoPeso.setText("Peso total: " + pesoTotal + " kg");
			}
		});

	}
}
