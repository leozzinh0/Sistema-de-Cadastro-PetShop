package Controller;
package Model;
import Cliente;


public class Controller(){


    public void Adicionar(Cliente cli){
    clt[index++] = cli;
    }
   
    public void mostrarTodos(){
    for (int i=-0; i <clt.length; i++){
        if (clt[i] != null){
            System.out.println(clt[i].getNome());
        }
    }}
   
    public void Excluir(Cliente clt){
         for(Cliente client1 : clt  ){
            if(client1.getId() == cli.id())
            clt.remove(cli);
        }
    }

    public Animal AnimalEncontrar(){
        return this.ani;
    }
   
   
    public void Alterar(Cliente cli){
        for(Cliente client1 : clt  ){
            if(client1.getId() == cli.id()){
            clt.remove(cli);
            clt.add(cli);
            }
        }
    }   

    }

    





    
}