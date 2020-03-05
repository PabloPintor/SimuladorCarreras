import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class VentanaPpal extends JFrame {

	private JPanel contentPane;
	private Principal controlador;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JButton btnListarTodo;
	private JScrollPane scrollPane;
	private JTextPane areaTexto;
	private JLabel lblCorredor;
	private JLabel lblCorredor_1;
	private JTextField campoCorredor1;
	private JTextField campoCorredor2;
	private JButton btnCrearCarrera;
	private JButton btnCrearCarreraAleatoria;
	private JRadioButton rdbtnCoche;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_6;
	private PanelCarrera panel_5;

	public VentanaPpal(Principal controlador) {
		setResizable(false);
		
		this.controlador = controlador;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("Hacer prueba de velocidad", null, panel, null);
		
		lblCorredor = new JLabel("Corredor 1:");
		
		lblCorredor_1 = new JLabel("Corredor 2:");
		
		campoCorredor1 = new JTextField();
		campoCorredor1.setColumns(10);
		
		campoCorredor2 = new JTextField();
		campoCorredor2.setColumns(10);
		
		btnCrearCarrera = new JButton("Carrera");
		btnCrearCarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				botonCrearCarreraPulsado();
				
			}
		});
		
		btnCrearCarreraAleatoria = new JButton("Carrera aleatoria");
		btnCrearCarreraAleatoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				botonCarreraAleatoriaPulsado();
				
			}
		});
		
		panel_5 = new PanelCarrera();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblCorredor_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblCorredor, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(campoCorredor1)
								.addComponent(campoCorredor2, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnCrearCarrera, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCrearCarreraAleatoria, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCorredor)
								.addComponent(campoCorredor1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCorredor_1)
								.addComponent(campoCorredor2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCrearCarreraAleatoria, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
								.addComponent(btnCrearCarrera, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Elegir coches", null, panel_1, null);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Corredor 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Corredor 2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		radioButton_4 = new JRadioButton("Coche:");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (radioButton_4.isSelected()) {
					
					panel_5.ponerCoche2(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")).getImage());
					
				}
				
			}
		});
		radioButton_4.setSelected(true);
		buttonGroup_3.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("Coche:");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_5.isSelected()) {
					
					panel_5.ponerCoche2(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-amarillo.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_3.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("Coche:");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_6.isSelected()) {
					
					panel_5.ponerCoche2(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-azul.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_3.add(radioButton_6);
		
		radioButton_7 = new JRadioButton("Coche:");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_7.isSelected()) {
					
					panel_5.ponerCoche2(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-rojo.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_3.add(radioButton_7);
		
		radioButton_8 = new JRadioButton("Coche:");
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_8.isSelected()) {
					
					panel_5.ponerCoche2(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-verde.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_3.add(radioButton_8);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")));
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-amarillo.png")));
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-azul.png")));
		
		label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-rojo.png")));
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-verde.png")));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton_6, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_4, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_7, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_8, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(33))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_4.createSequentialGroup()
								.addComponent(radioButton_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addGap(28)
								.addComponent(radioButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_panel_4.createSequentialGroup()
								.addGap(47)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
						.addComponent(radioButton_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(8))
		);
		panel_4.setLayout(gl_panel_4);
		
		rdbtnCoche = new JRadioButton("Coche:");
		rdbtnCoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (rdbtnCoche.isSelected()) {
					
					panel_5.ponerCoche1(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")).getImage());
				}
				
			}
		});
		rdbtnCoche.setSelected(true);
		buttonGroup_2.add(rdbtnCoche);
		
		radioButton = new JRadioButton("Coche:");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton.isSelected()) {
					
					panel_5.ponerCoche1(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-verde.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_2.add(radioButton);
		
		radioButton_1 = new JRadioButton("Coche:");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_1.isSelected()) {
					
					panel_5.ponerCoche1(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-azul.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_2.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("Coche:");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_2.isSelected()) {
					
					panel_5.ponerCoche1(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-amarillo.png")).getImage());
					
				}
				
			}
		});
		buttonGroup_2.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("Coche:");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioButton_3.isSelected()) {
					
					panel_5.ponerCoche1(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-rojo.png")).getImage());
					
				}
				
				
			}
		});
		buttonGroup_2.add(radioButton_3);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")));
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-amarillo.png")));
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-azul.png")));
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-rojo.png")));
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-verde.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(rdbtnCoche, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(radioButton_3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(17)
							.addComponent(rdbtnCoche)
							.addGap(28)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(radioButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)))
					.addGap(21)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(radioButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(20)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(radioButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(radioButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(19))
		);
		panel_3.setLayout(gl_panel_3);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Listar registro", null, panel_2, null);
		
		btnListarTodo = new JButton("Listar todo");
		btnListarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				botonListarPulsado();
				
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(215)
					.addComponent(btnListarTodo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(223))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnListarTodo)
					.addGap(6))
		);
		
		areaTexto = new JTextPane();
		areaTexto.setEditable(false);
		scrollPane.setViewportView(areaTexto);
		panel_2.setLayout(gl_panel_2);
		
		panel_6 = new JPanel();
		tabbedPane.addTab("Administracion", null, panel_6, null);
		
		JButton btnNewButton = new JButton("Guardar registros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardarFichero();
				
			}
		});
		
		JButton btnCargarRegistros = new JButton("Cargar registros");
		btnCargarRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cargarFichero();
				
			}
		});
		
		JLabel etiquetaFicheroGuardar = new JLabel("");
		
		JLabel etiquetaFicheroCargar = new JLabel("");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(etiquetaFicheroGuardar, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(btnCargarRegistros, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(etiquetaFicheroCargar, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(etiquetaFicheroGuardar))
					.addGap(18)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCargarRegistros, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(etiquetaFicheroCargar))
					.addContainerGap(210, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
	}

	protected void cargarFichero() {
		
		this.controlador.cargarFichero();
		
	}

	protected void guardarFichero() {
		
		this.controlador.guardarFichero();
		
	}

	protected void botonCarreraAleatoriaPulsado() {
		
		generarDatos();
		
		new Thread(() -> moverCoches()).start();
		
	}

	private void moverCoches() {
		
		float velocidadCoche1 = this.controlador.getRegistro().get(this.controlador.getCarreraActual()).getFirst();
		float velocidadCoche2 = this.controlador.getRegistro().get(this.controlador.getCarreraActual()).getLast();
		
		float acumuladorCoche1 = 0F;
		float acumuladorCoche2 = 0F;
		
		int posicionCoche1 = 0;
		int posicionCoche2 = 0;

		this.panel_5.setX1(0);
		this.panel_5.setX2(0);
		
		this.btnCrearCarrera.setEnabled(false);
		this.btnCrearCarreraAleatoria.setEnabled(false);
		
		while (this.panel_5.getX1() < 445 && this.panel_5.getX2() < 445) {
			
			this.panel_5.setX1(posicionCoche1);
			this.panel_5.setX2(posicionCoche2);
			
			this.panel_5.validate();
			this.panel_5.repaint();
			
			acumuladorCoche1 += velocidadCoche1 *2/100;
			acumuladorCoche2 += velocidadCoche2 *2/100;
			
			posicionCoche1 = (int) acumuladorCoche1;
			posicionCoche2 = (int) acumuladorCoche2;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		this.btnCrearCarrera.setEnabled(true);
		this.btnCrearCarreraAleatoria.setEnabled(true);
		
	}

	private void generarDatos() {
		
		float corredor1=0F;
		float corredor2=0F;
		
		String textoCorredor1="";
		String textoCorredor2="";
		
		Random aleatorio = new Random();
		corredor1 = aleatorio.nextFloat() * (100 - 0) + 0;
		corredor2 = aleatorio.nextFloat() * (100 - 0) + 0;		
		
		this.controlador.crearCarrera(corredor1, corredor2);
		
		textoCorredor1 += corredor1;
		textoCorredor2 += corredor2;
		
		this.campoCorredor1.setText(textoCorredor1);
		this.campoCorredor2.setText(textoCorredor2);
		
	}

	protected void botonCrearCarreraPulsado() {
		
		this.controlador.crearCarrera(Float.parseFloat(this.campoCorredor1.getText()), Float.parseFloat(this.campoCorredor2.getText()));
		new Thread(() -> moverCoches()).start();
		
	}

	protected void botonListarPulsado() {
		
		this.areaTexto.setText(this.controlador.getListadoCarreras());
		
	}

	public void mostrarVentana() {
		
		this.setVisible(true);
		
	}
}
