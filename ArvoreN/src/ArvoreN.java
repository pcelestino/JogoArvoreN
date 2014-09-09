public class ArvoreN {
	
	public NodeN create(char c) {
		NodeN n = new NodeN();
		n.setC(c);
		n.setPrim(null);
		n.setProx(null);
		return n;
	}

	public void insert(NodeN a, NodeN sub) {
		sub.setProx(a.getPrim());
		a.setPrim(sub);
	}

	public void print(NodeN a) {
		System.out.println(a.getC());
		for (NodeN p = a.getPrim(); p != null; p = p.getProx()) {
			print(p);
		}
	}

	public boolean search(NodeN n, char c) {
		if (n.getC() == c) {
			return true;
		} else {
			for (NodeN p = n.getPrim(); p != null; p = p.getProx()) {
				if (search(p, c)) {
					return true;
				}
			}
		}
		return false;
	}

	public int getAltura(NodeN n) {
		int hmax = -1; // Caso de arvore sem filhos
		for (NodeN p = n.getPrim(); p != null; p = p.getProx()) {
			int h = getAltura(p);
			if (h > hmax) {
				hmax = h;
			}
		}
		return hmax + 1;
	}
}
