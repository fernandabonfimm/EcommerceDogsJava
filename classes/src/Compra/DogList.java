package src.Compra;

import java.util.LinkedList;

import src.Dog.subclasses.Puppy;

public class DogList {
    private LinkedList<Puppy> listaDogs = new LinkedList<Puppy>();

    public void addToList(Puppy catioro){
        listaDogs.add(catioro);
    }

    public void showAll(){
        System.out.println("Lista de todos os puppys");
        for(Puppy catiorro: listaDogs){
            System.out.println(catiorro.getName());
        }
    }

    public void showReservados(){
        System.out.println("Lista de todos os puppys reservados");
        for(Puppy catiorro: listaDogs){
            if(catiorro.getReservado()){
                System.out.println(catiorro.getName());
            }
        }
    }

    public void showNaoReservados(){
        System.out.println("Lista de todos os puppys não reservados");
        for(Puppy catiorro: listaDogs){
            if(!catiorro.getReservado()){
                System.out.println(catiorro.getName());
            }
        }
    }
    
}

