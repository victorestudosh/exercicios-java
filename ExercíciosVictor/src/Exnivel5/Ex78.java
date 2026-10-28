package Exnivel5;

public class Ex78 {
	public static void main(String[] args) {
		Node node1 = new Node(13);
		Node node2 = new Node(14);
		Node node3 = new Node(17);
		
		node1.setProximovalor(node2);
		node2.setProximovalor(node3);
		node3.setProximovalor(null);
		
		percorrer(node1);
	}
	public static void percorrer(Node head) {

	    while (head != null) {

	        System.out.println(head.getValor());

	        head = head.getProximovalor();
	    }
	}
}
