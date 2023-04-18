/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhas;

public class Pilhas {

    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        p1.Empilha("el01");
        p1.Empilha("el02");
        p1.Empilha("el03");
        p1.Empilha("el04");
        System.out.print(p1.Desempilha());
        System.out.print(p1.Desempilha());
    }

}
