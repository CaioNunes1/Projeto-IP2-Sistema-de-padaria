package Negocio.seeds;

public abstract class Produtos {
    private String nome;
    private String marca;
    private double precoProduto;
    private double PrecoVenda;
    private Fornecedor fornecedor;

    //CONSTRUTOR:
    public Produtos(String nome, String marca, double precoProduto, double precoVenda, Fornecedor fornecedor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.precoProduto = precoProduto;
		PrecoVenda = precoVenda;
		this.fornecedor = fornecedor;
	}

    public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	//GETS AND SETS:
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
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public double getPrecoVenda() {
        return PrecoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        PrecoVenda = precoVenda;
    }
}
