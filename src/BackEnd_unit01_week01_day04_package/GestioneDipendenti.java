package BackEnd_unit01_week01_day04_package;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente operaio1 = new Dipendente("0001", 1000, 30, LivelloTipo.OPERAIO, DipartimentoTipo.PRODUZIONE);
		Dipendente operaio2 = new Dipendente("0002", 1000, 30, LivelloTipo.OPERAIO, DipartimentoTipo.PRODUZIONE);
		Dipendente impiegato1 = new Dipendente("0011", 1500, 35, LivelloTipo.IMPIEGATO,
				DipartimentoTipo.AMMINISTRAZIONE);
		Dipendente dirigente1 = new Dipendente("0021", 3000, 0, LivelloTipo.DIRIGENTE, DipartimentoTipo.VENDITE);

		System.out.println("");
		System.out.println("Sono stati creati i seguenti dipendenti:");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + operaio1.getMatricola());
		System.out.println("Stipendio: " + operaio1.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + operaio1.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + operaio1.getLivelloTipo());
		System.out.println("Dipartimento: " + operaio1.getDipartimentoTipo());

		System.out.println("Sono stati creati i seguenti dipendenti:");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + operaio2.getMatricola());
		System.out.println("Stipendio: " + operaio2.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + operaio2.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + operaio2.getLivelloTipo());
		System.out.println("Dipartimento: " + operaio2.getDipartimentoTipo());

		System.out.println("Sono stati creati i seguenti dipendenti:");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + impiegato1.getMatricola());
		System.out.println("Stipendio: " + impiegato1.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + impiegato1.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + impiegato1.getLivelloTipo());
		System.out.println("Dipartimento: " + impiegato1.getDipartimentoTipo());

		System.out.println("Sono stati creati i seguenti dipendenti:");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + dirigente1.getMatricola());
		System.out.println("Stipendio: " + dirigente1.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + dirigente1.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + dirigente1.getLivelloTipo());
		System.out.println("Dipartimento: " + dirigente1.getDipartimentoTipo());
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		System.out.println("");
		System.out.println("");
		System.out.println("Promozioni:");

		operaio1.promuovi();
		impiegato1.promuovi();

		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + operaio1.getMatricola());
		System.out.println("Stipendio: " + operaio1.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + operaio1.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + operaio1.getLivelloTipo());
		System.out.println("Dipartimento: " + operaio1.getDipartimentoTipo());

		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Matricola: " + impiegato1.getMatricola());
		System.out.println("Stipendio: " + impiegato1.getStipendio() + " €");
		System.out.println("Importo orario straordinario: " + impiegato1.getImportoOrarioStraordinario() + " €");
		System.out.println("Livello: " + impiegato1.getLivelloTipo());
		System.out.println("Dipartimento: " + impiegato1.getDipartimentoTipo());

		System.out.println("");
		System.out.println("");
		System.out.println("Totale stipendi mensili:");
	}

}
