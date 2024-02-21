import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Edinez Rocha ");
        pessoa1.setIdade(56);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mabiza Stefany");
        pessoa2.setIdade(33);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Ana Flor");
        pessoa3.setIdade(13);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Quantidade de itens do ArrayLyst de Pessoas: " + listaDePessoas.size());
        System.out.println("Primeiro item da lista: " + listaDePessoas.get(0));
        System.out.println("Lista Completa: " + listaDePessoas);

    }
}