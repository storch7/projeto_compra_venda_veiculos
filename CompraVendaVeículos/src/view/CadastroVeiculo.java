package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Usuario;
import main.Carro;
import main.TipoCaminhao;
import main.Caminhao;
import main.Cambio;
import main.Tracao;

/**
 * Tela de cadastro de veículos na aplicação
 * @author Guilherme
 *
 */
public class CadastroVeiculo {
	
	private JFrame janela = new JFrame();
	private JLabel cadastroVeiculo = new JLabel("Cadastre o seu veículo");
	private JLabel tipoVeiculo = new JLabel("Escolha o tipo de veículo:");
	private JCheckBox carro = new JCheckBox("Carro");
	private JCheckBox caminhao = new JCheckBox("Caminhão");
	private JLabel marca = new JLabel("Marca:");
	private JTextField marcaBox = new JTextField();
	private JLabel modelo = new JLabel("Modelo:");
	private JTextField modeloBox = new JTextField();
	private JLabel placa = new JLabel("Placa:");
	private JTextField placaBox = new JTextField();
	private JLabel ano = new JLabel("Ano:");
	private JTextField anoBox = new JTextField();
	private JLabel valor = new JLabel("Valor:");
	private JTextField valorBox = new JTextField();
	private JLabel descricao = new JLabel("Descrição adicional:");
	private JTextField descricaoBox = new JTextField();
	private JPanel itensCarro = new JPanel();
	private JCheckBox direcaoHidraulica = new JCheckBox("Direção Hidráulica");
	private JLabel cambio = new JLabel("Câmbio:");
	private JLabel tracao = new JLabel("Tração:");
	private JPanel itensCaminhao = new JPanel();
	private JLabel qntEixos = new JLabel("Quantidade de Eixos:");
	private JTextField qntEixosBox = new JTextField();
	private JLabel capacidadeCarga = new JLabel("Capacidade de Carga:");
	private JTextField capacidadeCargaBox = new JTextField();
	private JLabel comprimento = new JLabel("Comprimento:");
	private JTextField comprimentoBox = new JTextField();
	private JLabel tipoCaminhao = new JLabel("Tipo:");
	
	private JButton cadastro = new JButton("Cadastrar");
	private JButton voltar = new JButton("Voltar");
	
	/**
	 * método construtor da classe
	 * @param usuario
	 */
	public CadastroVeiculo(Usuario usuario) {
		
		janela.setSize(1250, 750);
		voltar.setBounds(25, 25, 100, 45);
		cadastroVeiculo.setBounds(550, 15, 150, 45);
		tipoVeiculo.setBounds(430, 70, 150, 45);
		carro.setBounds(450, 100, 100, 45);
		caminhao.setBounds(650, 100, 100, 45);
		marca.setBounds(430, 150, 100, 45);
		marcaBox.setBounds(430, 190, 390, 45);
		modelo.setBounds(430, 230, 100, 45);
		modeloBox.setBounds(430, 270, 390, 45);
		ano.setBounds(430, 330, 50, 45);
		anoBox.setBounds(470, 330, 70, 45);
		valor.setBounds(550, 330, 50, 45);
		valorBox.setBounds(600, 330, 70, 45);
		placa.setBounds(690, 330, 70, 45);
		placaBox.setBounds(740, 330, 70, 45);
		descricao.setBounds(430, 380, 150, 45);
		descricaoBox.setBounds(430, 420, 390, 45);
		
		itensCarro.setBounds(430, 480, 390, 150);
		//itensCarro.setBorder(BorderFactory.createLineBorder(Color.black));
		direcaoHidraulica.setBounds(0, 0, 150, 35);
		cambio.setBounds(0, 40, 100, 35);
		
		String[] cambios = {"Manual", "Automático"};
		JComboBox cambiosList = new JComboBox(cambios);
		cambiosList.setBounds(0, 80,100, 35);
		
		tracao.setBounds(250, 40, 100, 35);
		String[] tracaoOptions = {"4x2", "4x4", "AWD"};
		JComboBox tracaoList = new JComboBox(tracaoOptions);
		tracaoList.setBounds(250, 80, 100, 35);
		
		itensCaminhao.setBounds(430, 480, 390, 180);
		//itensCaminhao.setBorder(BorderFactory.createLineBorder(Color.black));
		qntEixos.setBounds(0,0, 150, 45);
		qntEixosBox.setBounds(130, 0, 60, 45);
		capacidadeCarga.setBounds(200, 0, 150, 45);
		capacidadeCargaBox.setBounds(330, 0, 60, 40);
		comprimento.setBounds(0, 50, 100, 40);
		comprimentoBox.setBounds(110, 50, 60, 40);
		
		String[] tiposCaminhao = {"VUC", "TOCO", "TRUCK", "Cavalo mecânico simples", "Cavalo mecânico trucado", "Conjunto carreta dois eixos", "Conjunto Carreta três eixos", "Bitrem", "Rodotrem", "Outro"};
		JComboBox caminhoesList = new JComboBox(tiposCaminhao);
		tipoCaminhao.setBounds(0,100, 60, 45);
		caminhoesList.setBounds(40, 100, 250, 40);
		cadastro.setBounds(1115, 650, 100, 40);
		
		janela.add(voltar);
		janela.add(cadastroVeiculo);
		janela.add(tipoVeiculo);
		janela.add(carro);
		janela.add(caminhao);
		janela.add(marca);
		janela.add(marcaBox);
		janela.add(modelo);
		janela.add(modeloBox);
		janela.add(ano);
		janela.add(anoBox);
		janela.add(valor);
		janela.add(valorBox);
		janela.add(placa);
		janela.add(placaBox);
		janela.add(descricao);
		janela.add(descricaoBox);
		
		itensCarro.setLayout(null);
		itensCarro.setVisible(false);
		itensCarro.add(direcaoHidraulica);
		itensCarro.add(cambio);
		itensCarro.add(cambiosList);
		itensCarro.add(tracao);
		itensCarro.add(tracaoList);
		janela.add(itensCarro);
		
		itensCaminhao.setLayout(null);
		itensCaminhao.setVisible(false);
		itensCaminhao.add(qntEixos);
		itensCaminhao.add(qntEixosBox);
		itensCaminhao.add(capacidadeCarga);
		itensCaminhao.add(capacidadeCargaBox);
		itensCaminhao.add(comprimento);
		itensCaminhao.add(comprimentoBox);
		itensCaminhao.add(tipoCaminhao);
		itensCaminhao.add(caminhoesList);
		janela.add(itensCaminhao);
		
		janela.add(cadastro);
		
		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	
		//EVENTOS
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new App(usuario);
				janela.dispose();
			}
		});
		
		carro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(carro.isSelected() == true) {
					caminhao.setSelected(false);
					itensCarro.setVisible(true);
					itensCaminhao.setVisible(false);
				}
				
			}
		});
		
		caminhao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(caminhao.isSelected() == true) {
					carro.setSelected(false);
					itensCaminhao.setVisible(true);
					itensCarro.setVisible(false);
				}
				
			}
		});
		
		cadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(carro.isSelected() == true) {
					
					Carro carro = new Carro();
					
					carro.setMarca(marcaBox.getText());
					carro.setModelo(modeloBox.getText());
					carro.setPlaca(placaBox.getText());
					carro.setAno(Integer.parseInt(anoBox.getText()));
					carro.setValor(Double.valueOf(valorBox.getText()).doubleValue());
					carro.setDescricaoAdicional(descricaoBox.getText());
					carro.setDirecaoHidraulica(direcaoHidraulica.isSelected());
					
					if(cambiosList.getSelectedItem().toString() == "Manual") {
						carro.setCambio(Cambio.Manual);
					}
					
					if(cambiosList.getSelectedItem().toString() == "Automático") {
						carro.setCambio(Cambio.Automatico);
					}
					
					if(tracaoList.getSelectedItem().toString() == "4x2") {
						carro.setTracao(Tracao.QUATROxDOIS);
					}
					
					if(tracaoList.getSelectedItem().toString() == "4x4") {
						carro.setTracao(Tracao.QUATROxQUATRO);
					}
					
					if(tracaoList.getSelectedItem().toString() == "AWD") {
						carro.setTracao(Tracao.AWD);
					}
					
					usuario.AnunciarVeiculo(carro);
					
				}
				
				if(caminhao.isSelected() == true) {
					Caminhao caminhao = new Caminhao();
					
					caminhao.setMarca(marcaBox.getText());
					caminhao.setModelo(modeloBox.getText());
					caminhao.setPlaca(placaBox.getText());
					caminhao.setAno(Integer.parseInt(anoBox.getText()));
					caminhao.setValor(Double.valueOf(valorBox.getText()).doubleValue());
					caminhao.setDescricaoAdicional(descricaoBox.getText());
					
					caminhao.setQuantidadeEixos(Integer.parseInt(qntEixosBox.getText()));
					caminhao.setCapacidadeCarga(Double.valueOf(capacidadeCargaBox.getText()).doubleValue());
					caminhao.setComprimento(Double.valueOf(comprimentoBox.getText()).doubleValue());
					
					if(caminhoesList.getSelectedItem().toString() == "VUC") {
						caminhao.setTipoCaminhao(TipoCaminhao.VUC);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "TOCO") {
						caminhao.setTipoCaminhao(TipoCaminhao.Toco);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "TRUCK") {
						caminhao.setTipoCaminhao(TipoCaminhao.Truck);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Cavalo mecânico simples") {
						caminhao.setTipoCaminhao(TipoCaminhao.CavaloMecanicoSimples);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Cavalo mecânico trucado") {
						caminhao.setTipoCaminhao(TipoCaminhao.CavaloMecanicoTrucado);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Conjunto carreta dois eixos") {
						caminhao.setTipoCaminhao(TipoCaminhao.ConjuntoCarretaDoisEixos);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Conjunto Carreta três eixos") {
						caminhao.setTipoCaminhao(TipoCaminhao.ConjuntoCarretaTresEixos);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Bitrem") {
						caminhao.setTipoCaminhao(TipoCaminhao.Bitrem);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Rodotrem") {
						caminhao.setTipoCaminhao(TipoCaminhao.Rodotrem);
					}
					
					if(caminhoesList.getSelectedItem().toString() == "Outro") {
						caminhao.setTipoCaminhao(TipoCaminhao.Outro);
					}
					
					usuario.AnunciarVeiculo(caminhao);
				}
				
				JOptionPane.showMessageDialog(null, "Veículo Adicionado com sucesso");
				new App(usuario);
				janela.dispose();
			}
		});
		
	}
}
