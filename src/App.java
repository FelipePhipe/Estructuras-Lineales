import java.util.Queue;

import Models.Persona;
import controllers.QuequeG;
import controllers.Stack;
import controllers.StackG;

public class App {
    public static void main(String[] args) throws Exception {

        /* 
        System.out.println(stack.pop());
        System.out.println(stack.peek());*/


        /*Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
       System.out.println("Tam= "+ stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam= "+ stack.size());
        stack.printStack();*/



        /*StackG<Integer> pilaG = new StackG<Integer>();
        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tam= "+pilaG.size());
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tam= "+pilaG.size());
        pilaG.printStack();*/

        Persona p1= new Persona("Juan");
        Persona p2= new Persona("Maria");
        Persona p3= new Persona ("Pedro");

        QuequeG<Persona> colaPersonas= new QuequeG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.printCola;
        System.out.println("Persona atendida: "+ colaPersonas.remove());
        colaPersonas.printCola;
        
    }
}
