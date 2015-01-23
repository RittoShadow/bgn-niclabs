package niclabs.lolhowdoibgn;

import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.jpbc.Field;
import it.unisa.dia.gas.plaf.jpbc.pairing.map.PairingMap;

import java.math.BigInteger;

public class PublicKey {
	private PairingMap map;
	private Element P, Q;
	private BigInteger n;
	private Field<?> f;

	public PublicKey(PairingMap e, Field<?> field, Element gen, Element point,
			BigInteger order) {
		map = e;
		P = gen.set(gen);
		Q = point.set(point);
		n = order;
		f = field;
	}

	public PairingMap getMap() {
		return this.map;
	}

	public Element getP() {
		return this.P;
	}

	public Element getQ() {
		return this.Q;
	}

	public BigInteger getN() {
		return this.n;
	}

	public Field<?> getField() {
		return this.f;
	}
}
