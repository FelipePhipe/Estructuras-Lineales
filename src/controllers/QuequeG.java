package controllers;

import java.util.EmptyStackException;
import Models.Persona;
import Models.NodeGeneric;

public class QuequeG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;
    public Object printCola;

    public QuequeG(){
        this.primero=null;
        this.ultimo=null;
        this.size=0;
    }

    public void add(T value){
        NodeGeneric<T> newNode= new NodeGeneric<T>(value);
        if (isEmpty()){
            primero= newNode;
            ultimo= newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo=newNode;
        }
        size++;

    }

    public T remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T aux= primero.getValue();
        primero=primero.getNext();
        size--;
        return aux;

    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public int size(){
        return size();
    }

    public boolean isEmpty(){
        return primero==null;
    }

    public void printCola(){
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public Persona findByName(String name) {
    NodeGeneric<T> aux = primero;
    while (aux != null) {
        T value = aux.getValue();
        if (value instanceof Persona) {
            Persona p = (Persona) value;
            if (p.getNombre().equalsIgnoreCase(name)) {
                return p;
            }
        }
        aux = aux.getNext();
    }
    return null;
}

public Persona deleteByName(String name) {
    NodeGeneric<T> actual = primero;
    NodeGeneric<T> anterior = null;

    while (actual != null) {
        T value = actual.getValue();
        if (value instanceof Persona) {
            Persona p = (Persona) value;
            if (p.getNombre().equalsIgnoreCase(name)) {
                if (anterior == null) {
                    // Eliminar el primero
                    primero = actual.getNext();
                    if (primero == null) ultimo = null; // cola vacía
                } else {
                    anterior.setNext(actual.getNext());
                    if (actual == ultimo) ultimo = anterior;
                }
                size--;
                return p;
            }
        }
        anterior = actual;
        actual = actual.getNext();
    }
    return null;
}

    
}
