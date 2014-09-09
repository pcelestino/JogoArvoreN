
public class Main {
	
	public static void main(String[] args) {
		ArvoreN arv = new ArvoreN();
		
		NodeN a = arv.create('a');
		NodeN b = arv.create('b');
		NodeN c = arv.create('c');
		NodeN d = arv.create('d');
		NodeN e = arv.create('e');
		NodeN f = arv.create('f');
		
		arv.insert(a, b);
		arv.insert(a, c);
		arv.insert(c, d);
		arv.insert(a, e);
		arv.insert(d, f);
		
		arv.print(a);
		
		System.out.println(arv.search(a, 'd'));
		System.out.println(arv.search(e, 'd'));
		System.out.println(arv.getAltura(a));
	}
}
