package interfejs;

import java.util.List;

import domen.Autor;
import domen.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public List<Knjiga> vratiSveKnjige();
	
	public List<Knjiga> pronadjiKnjigu(Autor autor,
			String isbn, String naslov, String izdavac);
	
}
