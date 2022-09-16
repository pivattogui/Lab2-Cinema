package cinema;

import java.util.*;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private Opcoes opcoes;

    public Menu(ArrayList<Assento> assentos) {
        this.opcoes = new Opcoes(assentos);
    }

    public void mostrarOpcoes() {
        int resposta = 0;

        while (resposta != 5) {
            System.out.println("Digite uma das opcoes abaixo:\n1 - Reservar assentos\n2 - Mostrar mapa de assentos\n3 - Mostrar disponibilidade de assentos\n4 - Cancelar reserva\n5 - Sair do programa");

            resposta = scanner.nextInt();
            
            switch (resposta) {
                // RESERVAR ASSENTOS
                case 1: {

                    int qtdAssetos;
                    System.out.println("\nQuantos assentos voce deseja reservar?");
                    qtdAssetos = scanner.nextInt();

                    int coluna;
                    char linha;

                    // RESERVA DE 1 ASSENTO
                    if (qtdAssetos == 1) {
                        System.out.println("\nDigite a numero correspondente a coluna do assento:");
                        coluna = scanner.nextInt();
                        System.out.println("Digite o letra correspondente a linha do assento:");
                        linha = scanner.next().charAt(0);

                        opcoes.reservar(linha, coluna);
                        System.out.println("Reserva do assento " + linha + coluna + " realizada com sucesso!\n");
                    }

                    // RESERVA DE 2 ASSENTOS OU MAIS
                    else {
                        for (int x = 0; x < qtdAssetos; x++) {
                            System.out.println("\nDigite a numero correspondente a coluna do " + (x + 1) + "º assento:");
                            coluna = scanner.nextInt();
                            System.out.println("Digite o letra correspondente a linha do " + (x + 1) + "º assento:");
                            linha = scanner.next().charAt(0);

                            opcoes.reservar(linha, coluna);
                            System.out.println("Reserva do assento " + linha + coluna + " realizada com sucesso!\n");
                        }
                    }
                    break;
                }

                case 2: {
                    System.out.println(opcoes.mostrarMapa());
                    System.out.println("");

                    break;
                }

                case 3: {
                    System.out.println("");
                    System.out.println(opcoes.quantidade());
                    break;

                }

                case 4: {
                    int qtdAssetos;
                    System.out.println("\nQuantos assentos voce deseja reservar?");
                    qtdAssetos = scanner.nextInt();

                    int coluna;
                    char linha;

                    // RESERVA DE 1 ASSENTO
                    if (qtdAssetos == 1) {
                        System.out.println("\nDigite a numero correspondente a coluna do assento:");
                        coluna = scanner.nextInt();
                        System.out.println("Digite o letra correspondente a linha do assento:");
                        linha = scanner.next().charAt(0);

                        opcoes.cancelar(linha, coluna);
                        System.out.println("Reserva do assento " + linha + coluna + " cancelada com sucesso!\n");
                    }

                    // RESERVA DE 2 ASSENTOS OU MAIS
                    else {
                        for (int x = 0; x < qtdAssetos; x++) {
                            System.out.println("\nDigite a numero correspondente a coluna do " + (x + 1) + "º assento:");
                            coluna = scanner.nextInt();
                            System.out.println("Digite o letra correspondente a linha do " + (x + 1) + "º assento:");
                            linha = scanner.next().charAt(0);

                            opcoes.cancelar(linha, coluna);
                            System.out.println("Reserva do assento " + linha + coluna + " cancelada com sucesso!\n");
                        }
                    }
                    break;
                }

                case 5: {
                    break;
                }

                default: {
                    System.out.println("\nO valor digitado não corresponde à nenhuma das opções. Por favor, digite um número válido:\n");
                    break;
                }
            }
        }
    }
}
