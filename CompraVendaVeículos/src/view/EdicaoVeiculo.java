package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import main.*;

/**
 * Tela de edição de um veículo cadastrado
 * @author Guilherme
 *
 */
public class EdicaoVeiculo {
	
	private JFrame janela = new JFrame("Editar dados");
	private JLabel cadastroVeiculo = new JLabel("Edite as Informações do seu Veículo");
	private JLabel tipoVeiculo = new JLabel("Tipo de Veículo:");
	private JLabel tipoVeiculoBanco = new JLabel();
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
		
	private JButton atualizar = new JButton("Atualizar");
	private JButton voltar = new JButton("Voltar");
	
	/**
	 * método construtor da classe
	 * @param usuario
	 * @param veiculo
	 */
	public EdicaoVeiculo(Usuario usuario, Veiculo veiculo) {
		
		janela.setSize(1250, 750);
		voltar.setBounds(25, 25, 100, 45);
		cadastroVeiculo.setBounds(500, 15, 250, 45);
		tipoVeiculo.setBounds(430, 60, 100, 45);
		tipoVeiculoBanco.setBounds(550,60,100,45);
		//para determinar que tipo de veículo está sendo editado
		Carro carroComprador = new Carro();
		Caminhao caminhaoComparador = new Caminhao();
		if(veiculo.getClass().equals(carroComprador.getClass())) {
			tipoVeiculoBanco.setText("Carro");
		}
		if(veiculo.getClass().equals(caminhaoComparador.getClass())) {
			tipoVeiculoBanco.setText("Caminhão");
		}
		marca.setBounds(430, 150, 100, 45);
		marcaBox.setBounds(430, 190, 390, 45);
		marcaBox.setText(veiculo.getMarca());
		modelo.setBounds(430, 230, 100, 45);
		modeloBox.setBounds(430, 270, 390, 45);
		modeloBox.setText(veiculo.getModelo());
		ano.setBounds(430, 330, 50, 45);
		anoBox.setBounds(470, 330, 70, 45);
		anoBox.setText(Integer.toString(veiculo.getAno()));
		valor.setBounds(550, 330, 50, 45);
		valorBox.setBounds(600, 330, 70, 45);
		valorBox.setText(Double.toString(veiculo.getValor()));
		placa.setBounds(690, 330, 70, 45);
		placaBox.setBounds(740, 330, 70, 45);
		placaBox.setText(veiculo.getPlaca());
		descricao.setBounds(430, 380, 150, 45);
		descricaoBox.setBounds(430, 420, 390, 45);
		descricaoBox.setText(veiculo.getDescricaoAdicional());
		atualizar.setBounds(1115, 650, 100, 40);
				
		janela.add(voltar);
		janela.add(cadastroVeiculo);
		janela.add(tipoVeiculo);
		janela.add(tipoVeiculoBanco);
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
		janela.add(atualizar);
		
				
		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
		//eventos
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new VeiculosCadastrados(usuario);
				janela.dispose();
			}
		});
		
		atualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//setando as possíveis alterações
				veiculo.setMarca(marcaBox.getText());
				veiculo.setModelo(modeloBox.getText());
				veiculo.setPlaca(placaBox.getText());
				veiculo.setAno(Integer.parseInt(anoBox.getText()));
				veiculo.setValor(Double.valueOf(valorBox.getText()).doubleValue());
				veiculo.setDescricaoAdicional(descricaoBox.getText());
				
				JOptionPane.showMessageDialog(null, "Alterações feiras com sucesso");
				new App(usuario);
				janela.dispose();
			}
		});
	
	}
}
