package Java;
public class Fundamentos {
    public static void main(String [] args) {
        String nome;
        int idade = 17;
        char sexo = 'M';
        double temperatura = 26.7;
        boolean arCondicionado = false;
        nome = "Davi Paulino";
        System.out.println("Uso de variaveis na linguagem Java");
        System.out.println("Exemplos:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Temperatura:" + temperatura);
        System.out.println("Ar condicionado:" + arCondicionado);
        System.out.println("_____________________________________");
        System.out.println("");
        double i = 10;
        System.out.println("Operadores aritmeticos e atribuições");
        System.out.println("Exemplos:");
        System.out.println("i = " +  i);
        System.out.println("i = " + i +" + 5 | i = " + (i + 5));
        System.out.println("i = " + i +" - 5 | i = " + (i - 5));
        System.out.println("i = " + i +" * 5 | i = " + (i * 5));
        System.out.println("i = " + i +" / 5 | i = " + (i / 5));
        System.out.println("i = " + i +" % 5 | i = " + (i % 5));
        System.out.println("i += 5    | i = " + (i += 5));
        System.out.println("i -= 5    | i = " + (i -= 5));
        System.out.println("i *= 5    | i = " + (i *= 5));
        System.out.println("i /= 5    | i = " + (i /= 5));
        i++;
        System.out.println("i++       | i = " + i);
        i--;
        System.out.println("i--       | i = " + i);
        System.out.println("_____________________________________");
        System.out.println("");
        System.out.println("Estruturas de controle");

        if (idade < 18) {
            System.out.println("Menor de idade");   
        } else {
            System.out.println("Maior de idade");
        }

        if (nome == "Davi Paulino") {
            System.out.println("Nome correto");
        } else {
            System.out.println("Nome incorreto");
        }

        int  opcao = 3;
        switch (opcao) {
        case 1:
            System.out.println("CLIENTES");
            break;
        case 2:
        System.out.println("USUARIOS");
        break;
        case 3:
        System.out.println("RELATORIOS");
        break;
        default:
        System.out.println("OPÇÃO INVALIDA");
        break;
        }

        System.out.println("_____________________________________");

        System.out.println("Estruturas de repetição");


        for (int j = 10; j > 0; j--) {
                System.out.println("j");
            }

        for (int tabuada = 0; tabuada <= 10;  tabuada++) {
            for  (int valor = 0; valor <= 10; valor++) {
                System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));

        }
        System.out.println("_____________________________________");

        System.out.println("while, do while");

        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
            
        }

        char novoJogo;
        do {
            System.out.println("DSeseja jogar novamente?");
            novoJogo = 'n';
        } while (novoJogo == 's');
        System.out.println("Game over");

        }
    
      }

    }
