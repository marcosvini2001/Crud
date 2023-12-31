	package br.com.belval.crud.model;
	
	public class Produto {
		private int id;
		private String nome;
		private String descricao;
		private double preco;
	
	// Alt+Shift+S >> Generate Constructor from SuperClass
		public Produto() {
		}
		public Produto(int id, String nome, String descricao, double preco) {
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.preco = preco;
			}
		public int getId() {
			return id;
			}
		public void setId(int id) {
			this.id = id;
			}
		public String getNome() {
			return nome;
			}
		public void setNome(String nome) {
			this.nome = nome;
			}
		public String getDescricao() {
			return descricao;
			}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
			}
		public double getPreco() {
			return preco;
			}
		public void setPreco(double preco) {
			this.preco = preco;
			}
		// Alt+Shift+S >> Generate toString()
		@Override
		public String toString() {
			return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + 
			descricao + ", preco=" + preco + "]";
		}
		}
	
