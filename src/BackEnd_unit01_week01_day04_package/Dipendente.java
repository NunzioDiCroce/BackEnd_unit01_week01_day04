package BackEnd_unit01_week01_day04_package;

public class Dipendente {

	// - - - - - - - - - - - - - - - - - - - - attributi statici
	private static double stipendioBase = 1000;

	// - - - - - - - - - - - - - - - - - - - - attributi NON statici
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;

	// - - - - - - - - - - - - - - - - - - - - attributi Enum
	private LivelloTipo LivelloTipo;
	private DipartimentoTipo DipartimentoTipo;

	// - - - - - - - - - - - - - - - - - - - - costruttori
	public Dipendente(String _matricola, double _stipendio, double _importoOrarioStraordinario,
			LivelloTipo _LivelloTipo, DipartimentoTipo _DipartimentoTipo) {
		this.matricola = _matricola;
		this.stipendio = _stipendio;
		this.importoOrarioStraordinario = _importoOrarioStraordinario;
		this.LivelloTipo = _LivelloTipo;
		this.DipartimentoTipo = _DipartimentoTipo;
	}

	public Dipendente(String _matricola, DipartimentoTipo _DipartimentoTipo) {
		this.matricola = _matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.LivelloTipo = LivelloTipo.OPERAIO;
		this.DipartimentoTipo = _DipartimentoTipo;
	}

	// - - - - - - - - - - - - - - - - - - - - getters
	public double getStipendioBase() {
		return stipendioBase;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public LivelloTipo getLivelloTipo() {
		return LivelloTipo;
	}

	public DipartimentoTipo getDipartimentoTipo() {
		return DipartimentoTipo;
	}

	// - - - - - - - - - - - - - - - - - - - - setters
	public void setImportoOrarioStraordinario(double _importoOrarioStraordinario) {
		this.importoOrarioStraordinario = _importoOrarioStraordinario;
	}

	public void setDipartimentoTipo(DipartimentoTipo _DipartimentoTipo) {
		this.DipartimentoTipo = _DipartimentoTipo;
	}

	// - - - - - - - - - - - - - - - - - - - - metodi
	public void stampaDatiDipendente() {
		System.out.println("");
		System.out.println("Dati dipendente " + this.matricola);
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Stipendio base: " + stipendioBase);
		System.out.println("Stipendio: " + this.stipendio);
		System.out.println("Importo orario straordinario: " + this.importoOrarioStraordinario);
		System.out.println("Livello: " + this.LivelloTipo);
		System.out.println("Dipartimento: " + this.DipartimentoTipo);
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

	}

	public void promuovi() {
		if (this.LivelloTipo == LivelloTipo.OPERAIO) {
			this.LivelloTipo = LivelloTipo.IMPIEGATO;
			System.out.println("Il dipendente " + this.matricola + " è stato promosso da Operaio a Impiegato");
			this.stipendio = this.stipendioBase * 1.2;

		} else if (this.LivelloTipo == LivelloTipo.IMPIEGATO) {
			this.LivelloTipo = LivelloTipo.QUADRO;
			System.out.println("Il dipendente " + this.matricola + " è stato promosso da Impiegato a Quadro");
			this.stipendio = this.stipendioBase * 1.5;

		} else if (this.LivelloTipo == LivelloTipo.QUADRO) {
			this.LivelloTipo = LivelloTipo.DIRIGENTE;
			System.out.println("Il dipendente " + this.matricola + " è stato promosso da Quadro a Dirigente");
			this.stipendio = this.stipendioBase * 2;

		} else if (this.LivelloTipo == LivelloTipo.DIRIGENTE) {
			System.out.println("Errore, il dipendente " + this.matricola + " è un Dirigente.");
		}
	}

	// - - - - - - - - - - - - - - - - - - - - metodi static
	public static double calcolaPaga(Dipendente _dipendente) {
		double stipendioMensile = _dipendente.getStipendio();
		return stipendioMensile;
	}

	/*
	 * public static double calcolaPaga(Dipendente _dipendente, int
	 * _oreStraordinario) { double ordinario = _dipendente.getStipendio(); double
	 * straordinario = _dipendente.getImportoOrarioStraordinario() *
	 * _oreStraordinario; double stipendioMensile = ordinario + straordinario;
	 * return stipendioMensile; }
	 */
}
