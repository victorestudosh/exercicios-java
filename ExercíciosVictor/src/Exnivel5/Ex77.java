package Exnivel5;

import java.util.Queue;
import java.util.LinkedList;

public class Ex77 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Mayara");
		queue.offer("João");
		queue.offer("Miguel");
		
		System.out.println("Fila: " + queue);
		System.out.println("Fila está vazia: " + queue.isEmpty() + "\n");
		System.out.println("Mayara acabou de ser atendida e saiu da fila \n");
		
		queue.poll();
		
		System.out.println("Fila:" + queue);
		System.out.println("Fila está vazia: " + queue.isEmpty());
		
		queue.poll();
		
		System.out.println("\nJoão acabou de ser atendido e saiu da fila \n");
		System.out.println(queue);
		System.out.println("Fila está vazia: " + queue.isEmpty());
		
		queue.poll();
		
		System.out.println("\nMiguel acabou de ser atendido e saiu da fila \n");
		System.out.println(queue);
		System.out.println("Fila está vazia:" + queue.isEmpty());
		
	}
}