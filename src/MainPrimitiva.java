
public class MainPrimitiva {

	public static void main(String[] args) {
		
		Block b = new Block(0);
		System.out.println(b);

		int[] a = {1,3,18,20,45,47};
		Block b2 = new Block(a);
		
		//como nuestro "Block(int ... numbers)" tiene los 3 puntitos podemos lo de b3(Poner la lista separada con comas)
		Block b3 = new Block (5,10,36,58,51,69);
		System.out.println(b2);
		System.out.println(b3);
	}

}
