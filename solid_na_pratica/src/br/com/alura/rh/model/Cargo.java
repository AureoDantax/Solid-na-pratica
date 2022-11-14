package br.com.alura.rh.model;


//enums podem ter metódos, e assim, te ajudar com a implementação da sua regra de negócio, além de ajudar no encapsulamento.
public enum Cargo {

	ASSISTENTE{
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	public  abstract Cargo getProximoCargo();

}
