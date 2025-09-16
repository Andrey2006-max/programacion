import java.util.Stack;

public class pilaS441 {
    public static void main(String[] args) {
        
       
        Stack<Integer> pila = new Stack<>();

       
        pila.push(8);
        pila.push(4);
        pila.push(9);
        pila.push(10);
        pila.push(6);

        
        System.out.println(pila);

        
        System.out.println("Tope de la pila: " + pila.peek());

        
        System.out.println("Elemento removido del tope de la pila: " + pila.pop());

        
        System.out.println(pila);

       
        System.out.println(pila.search(10));
        System.out.println(pila.search(9));
        System.out.println(pila.search(4));
        System.out.println(pila.search(8));
        System.out.println(pila.search(50));
    }
}