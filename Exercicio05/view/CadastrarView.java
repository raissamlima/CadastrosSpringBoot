package Exercicio05.view;

import java.util.ArrayList;
import java.util.Scanner;

import Exercicio05.controller.CadastrarController;
import Exercicio05.model.CadastrarModel;

public class CadastrarView {

    private static CadastrarController controller = new CadastrarController();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        menuPrincipal(sc);
    }

    private static void listar() {
        System.out.println("Listando veiculos cadastrados...");
        System.out.println("------------------------------------------");
        ArrayList<CadastrarModel> veic = controller.listar();
        for (CadastrarModel veicSalvo : veic) {
            System.out.println(veicSalvo);
        }
        System.out.println("------------------------------------------");
    }

    private static void cadastrar(Scanner sc) {
        CadastrarModel veiculo = new CadastrarModel();

        Integer idVeiculo;

        do {
            System.out.print("Digite o ID do veículo: ");
            idVeiculo = Integer.valueOf(sc.nextLine());
            if (idVeiculo != null) {
                veiculo.setid(idVeiculo);
            } else {
                System.out.println("ID invalido");
            }
        } while (idVeiculo == null);

        System.out.print("Digite o nome do veículo: ");
        veiculo.setveiculo(sc.nextLine());
        System.out.print("Digite a descrição do veículo: ");
        veiculo.setdescricao(sc.nextLine());
        controller.salvar(veiculo);
        System.out.print("Digite a marca do veículo: ");
        veiculo.setmarca(sc.nextLine());
        System.out.print("Digite o ano do veículo: ");
        veiculo.setano(Integer.parseInt(sc.nextLine()));
        Integer valor;
        do {
            System.out.print("Digite 1 para vendido e 2 para disponivel: ");
            valor = Integer.parseInt(sc.nextLine());
            if (valor == 1) {
                veiculo.setvendido(true);
            } else if (valor == 2) {
                veiculo.setvendido(false);
            } else {
                System.out.println("Opçao invalida!");
            }
        } while (valor != 1 && valor != 2);

        System.out.println("Veiculo cadastrado com sucesso");
        System.out.println(veiculo.toString());
    }

    private static void editar(Scanner sc) {
        CadastrarModel veiculo;

        do {
            System.out.print("Digite o Id do veiculo: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Buscando veiculo por Id...");
            veiculo = controller.busca(id);
            if (veiculo == null) {
                System.out.println("Veiculo nao encontrado!");
            }
        } while (veiculo == null);

        int opcao = 0;

        do {
            System.out.println("-----------------------------------------");
            System.out.println(veiculo.toString());
            System.out.println("Qual informacao voce quer editar?");
            System.out.println("1. Veiculo\n2. Marca\n3. Ano\n4. Descrição\n5. Vendido\n6. Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Edite o nome do veículo: ");
                    veiculo.setveiculo(sc.nextLine());
                    System.out.println("Informacao editada com sucesso!");
                    break;
                case 2:
                    System.out.print("Edite a marca do veículo: ");
                    veiculo.setmarca(sc.nextLine());
                    System.out.println("Informacao editada com sucesso!");
                    break;
                case 3:
                    System.out.print("Edite o ano do veículo: ");
                    veiculo.setano(Integer.parseInt(sc.nextLine()));
                    System.out.println("Informacao editada com sucesso!");
                    break;
                case 4:
                    System.out.print("Edite a descriçao do veículo: ");
                    veiculo.setdescricao(sc.nextLine());
                    System.out.println("Informacao editada com sucesso!");
                    break;
                case 5:
                    System.out.print("Digite 1 para vendido e 2 para disponivel: ");
                    int valor = Integer.parseInt(sc.nextLine());
                    if (valor == 1) {
                        veiculo.setvendido(true);
                        System.out.println("Informacao editada com sucesso!");
                    } else if (valor == 2) {
                        veiculo.setvendido(false);
                        System.out.println("Informacao editada com sucesso!");
                    } else {
                        System.out.println("Opçao invalida!");
                    }
                    break;
            }
        } while (opcao != 6);
    }

    private static void deletar(Scanner sc) {
        CadastrarModel veiculo;

        do {
            System.out.print("Digite o Id do veiculo para deletar: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Buscando veiculo por Id...");
            veiculo = controller.busca(id);
            if (veiculo == null) {
                System.out.println("Veiculo nao encontrado!");
            } else {
                System.out.println(veiculo.toString());
                controller.deletar(id);
                System.out.println("Veiculo deletado com sucesso");
            }
        } while (veiculo == null);
    }

    private static void menuPrincipal(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n------------------------------------------");
            System.out.println("--------------MENU PRINCIPAL--------------");
            System.out
                    .println("1- Cadastrar Veículo\n2- Listar Veículo\n3- Editar Veiculo\n4- Deletar Veiculo\n5- Sair");
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("Escolha uma opção: \n");

            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    cadastrar(sc);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    editar(sc);
                    break;
                case 4:
                    deletar(sc);
                    break;
            }
        } while (opcao != 5);
        System.out.println("Saindo...");
    }
}