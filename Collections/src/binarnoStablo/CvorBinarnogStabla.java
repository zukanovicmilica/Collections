package binarnoStablo;

public class CvorBinarnogStabla<E> {
	
	int kljuc;
	E podatak;
	CvorBinarnogStabla<E> levo;
	CvorBinarnogStabla<E> desno;
	
	public CvorBinarnogStabla(int kljuc, E podatak, CvorBinarnogStabla<E> levo, CvorBinarnogStabla<E> desno) {
		this.kljuc = kljuc;
		this.podatak = podatak;
		this.levo = levo;
		this.desno = desno;
	}
	
	public CvorBinarnogStabla(int kljuc, E podatak) {
		this.kljuc = kljuc;
		this.podatak = podatak;
		this.levo = null;
		this.desno = null;
	}

}
