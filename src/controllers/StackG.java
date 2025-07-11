package controllers;

import java.util.EmptyStackException;

import Models.NodeGeneric;

public class StackG<T> {

    private NodeGeneric<T> top;
    private int size;

    public StackG(){
        this.top=null;
        this.size=0;
    }

    public void push(T value){
        NodeGeneric<T> newNode= new NodeGeneric<T>(value);
        newNode.setNext(top);
        top=newNode;

    }

    public T pop(){

        if (isEmpty()){
            throw new EmptyStackException();
        }
        T value=top.getValue();
        top=top.getNext();
        return value;

    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T value= top.getValue();
        return value;
    }

    public void printStack(){
        NodeGeneric<T> aux=top;
        while (aux!=null) {
            System.out.print(aux.getValue()+" | ");
            aux=aux.getNext();
            
        }
        System.out.println();
        
    }

    public int size(){
        NodeGeneric<T> aux=top;
        int cont=0;
        while(aux!=null){
            cont++;
            aux=aux.getNext();
        }

        return cont;
    }

    public boolean isEmpty(){
        return top==null;
    }

    
}
