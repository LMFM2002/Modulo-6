import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class livroVisitas {
private List<String>Lista;
public livroVisitas(){
    Lista = new ArrayList<String>();
}
public void assinar(String nomeCompleto) {
   Lista.add(nomeCompleto);
}
public void listarAssinaturas() {
    for (String nomeC: Lista)
        System.out.println(nomeC);
}
    public int getTotalAssinaturas(){
        return Lista.size();
    }
    

public static void main(String[] args){

livroVisitas livroVisitas = new livroVisitas();
Scanner scanner = new Scanner (System.in);
int opcao=0;
String nomeCompleto;
do {
    
    System.out.println("1- Assinar Livro");
    System.out.println("2- Listar assinatura");
    //System.out.println("Existem atualmente"+ LivroVisitas.getTotalAssinaturas() +"assinaturas");
    System.out.print("Insira a sua op��o:");
    opcao=scanner.nextInt();
    System.out.println("");
    switch(opcao){
        case 1: nomeCompleto = JOptionPane.showInputDialog("Insira o seu nome: ");
livroVisitas.assinar(nomeCompleto);
break  ;
        case 2: System.out.println("Listagem de assinaturas");
    livroVisitas.listarAssinaturas();
    System.out.println("");
    }
} while((opcao>0)&& (opcao<3)); 
} 
}