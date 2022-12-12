package main;

public class Principal {

	public static void main(String...Args) {
		
		Usuario storch = new Usuario();
		storch.setCpf("123456789");
		storch.setSenha("OrientaObjetos1");
		storch.setNome("Guilherme Storch");
		storch.setEndereco("Rua Belmiro Borchardt, 33. Bairro Cachoeira da Onça, São Gabriel da Palha - ES");
		storch.setContato("(12) 34567-8910");
		
		Carro meuCorolla = new Carro();
		meuCorolla.setModelo("Corolla");
		meuCorolla.setMarca("Toyota");
		meuCorolla.setAno(2021);
		meuCorolla.setQuilometragem(5000);
		meuCorolla.setCor("Branco");
		meuCorolla.setValor(115.000);
		meuCorolla.setDirecaoHidraulica(true);
		meuCorolla.setCambio(Cambio.Manual);
		meuCorolla.setFlex(true);
		meuCorolla.setDescricaoAdicional("Corolla seminovo; também negocio troca.");
		
		storch.addCarro(meuCorolla);
		
		Caminhao meuMercedes = new Caminhao();
		meuMercedes.setModelo("Mb Atego 2428");
		meuMercedes.setMarca("Mercedes Benz");
		meuMercedes.setAno(2016);
		meuMercedes.setQuilometragem(30000);
		meuMercedes.setValor(150000);
		meuMercedes.setTipoCaminhao(TipoCaminhao.Truck);
		meuMercedes.setCapacidadeCarga(20000.0);
		meuMercedes.setDescricaoAdicional("8x2 Caçamba Basculante");
		
		storch.addCaminhao(meuMercedes);
				
		System.out.println(storch.getNome());
		System.out.println(storch.getCpf());
		System.out.println(storch.getContato());
		System.out.println(storch.getEndereco());
		System.out.println(storch.getListaCarros());
		System.out.println(storch.getListaCaminhoes());
				
		storch.checarCpf();
		storch.checarContato();
	}
}
