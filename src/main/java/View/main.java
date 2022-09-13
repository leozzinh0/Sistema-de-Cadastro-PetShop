/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;

/**
 *
 * @author l222552
 */
public class main {

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();
        Controller cont = new Controller();

        cli('leo', 'rua 2', '31985433663', '37638900', 'huehue@gmail.com');

    System.out.println("Escolha um procedimento de 1 a 5:");
    int numero = entrada.nextInt();
    switch (numero) {
        case 1:
        cont.Adicionar(cli);
        break;
        case 2:
        cont.mostrarTodos();
        break;
        case 3:
        cont.Excluir(cli);
        break;
        case 4:
        cont.AnimalEncontrar();
         case 5:
        cont.Alterar(cli);
        break;
    }

        
}
