package eu.luiz.gustavo.projects.interact;

import java.util.Scanner;

public class interactJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome aqui:");
        String name = scanner.nextLine();

        System.out.println("Agora, sua idade:");
        int age = scanner.nextInt();







        System.out.println("Escolha a categoria do filme desejado...");
        String ctg = scanner.nextLine();

        category(ctg);
        System.out.println("Digite aqui: ");
        int ctgy = scanner.nextInt();
        selectCategory(ctgy, age);

      //  System.out.println("Ola, " + name);
      //  System.out.println("Atualmente possui, " + age);


       // check(age);
    }

  //  static void check(int age) {
 //       if (age >= 16){
 //           System.out.println("Maior de idade!");
 //       } else {
 //           System.out.println("Você é MENOR idade!");
 //       }
 //   }

    static void category(String ctg){
        System.out.println("TERROR --- Digite 1");
        System.out.println("AÇÃO --- Digite 2");
        System.out.println("AVENTURA --- Digite 3");
    }

    static void selectCategory(int ctgy, int age){
        Scanner scanner = new Scanner(System.in);
        if (age >= 16) {
            switch (ctgy) {
                case 1:
                    System.out.println("Os filmes de terror são:");
                    System.out.println("Paranormal --- Digite 1");
                    System.out.println("The Ritual --- Digite 2");
                    System.out.println("A Quiet Place --- Digite 3");
                    int terror = scanner.nextInt();
                    switch (terror){
                        case 1:
                            System.out.println("SELECIONADO!");
                            break;
                        case 2:
                            System.out.println("SELECIONADO!");
                            break;
                        case 3:
                            System.out.println("SELECIONADO!");
                            break;
                    }

                                                            break;

                case 2:
                    System.out.println("Os filmes de ação:");
                    System.out.println("Velozes e furiosos --- Digite 1");
                    System.out.println("Adão Negro --- Digite 2");
                    System.out.println("O espetacular Homem-Aranha --- Digite 3");
                    int acao = scanner.nextInt();
                    switch (acao){
                        case 1:
                            System.out.println("SELECIONADO!");
                            break;
                        case 2:
                            System.out.println("SELECIONADO!");
                            break;
                        case 3:
                            System.out.println("SELECIONADO!");
                            break;
                    }

                                                             break;
                case 3:
                    System.out.println("Os filmes de aventura são:");
                    System.out.println("O Senhor dos Anéis --- Digite 1");
                    System.out.println("Uncharted --- Digite 2");
                    System.out.println("Jumanji --- Digite 3");
                    int aventura = scanner.nextInt();
                    switch (aventura){
                        case 1:
                            System.out.println("SELECIONADO!");
                            break;
                        case 2:
                            System.out.println("SELECIONADO!");
                            break;
                        case 3:
                            System.out.println("SELECIONADO!");
                            break;
                    }

                                                             break;

                default:
                    System.out.println("Digite novamente!");
            }
        } else {
            System.out.println("Não há filmes para menores de 16 anos!");
            scanner.close();
        }
    }



}
