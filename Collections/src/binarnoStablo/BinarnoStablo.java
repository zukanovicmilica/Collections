package binarnoStablo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class BinarnoStablo<E> implements Map<Integer, E> {
	
	private CvorBinarnogStabla<E> koren;
	
	public BinarnoStablo(CvorBinarnogStabla<E> koren) {
		this.koren=koren;
	}
	
	@SuppressWarnings("unused")
	private E pretraga(CvorBinarnogStabla<E> k, int kljuc) {
		if (k == null)
			return null;
		if (k.kljuc == kljuc)
			return k.podatak;
		if (k.kljuc > kljuc)
			return pretraga(k.levo, kljuc);
		return pretraga(k.desno, kljuc);
}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<Integer, E>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E put(Integer arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends E> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<E> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public CvorBinarnogStabla<E> getKoren() {
		return koren;
	}

	public void setKoren(CvorBinarnogStabla<E> koren) {
		this.koren = koren;
	}
	
}
