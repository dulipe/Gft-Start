
public class Veiculo {
	private String nome;
	private String marca;
	int capacidadeDoTanque = 70;
	int litrosNoTanque = 0;
	
	public void abastecer(double valor) {
		litrosNoTanque += valor;
		System.out.println(litrosNoTanque);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
