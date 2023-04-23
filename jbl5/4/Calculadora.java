import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("CALCULADORA");
            System.out.println("Selecione uma operação:");
            System.out.println("1 - Somar dois valores");
            System.out.println("2 - Somar uma lista de valores");
            System.out.println("3 - Subtrair dois valores");
            System.out.println("4 - Subtrair uma lista de valores");
            System.out.println("5 - Multiplicar dois valores");
            System.out.println("6 - Multiplicar uma lista de valores por um multiplicador");
            System.out.println("7 - Dividir dois valores");
            System.out.println("8 - Dividir uma lista de valores");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro valor:");
                    int a = scanner.nextInt();
                    System.out.println("Digite o segundo valor:");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + somar(a, b));
                    break;
                case 2:
                    System.out.println("Digite a quantidade de valores:");
                    int n = scanner.nextInt();
                    int[] valores = new int[n];
                    System.out.println("Digite os valores:");
                    for (int i = 0; i < n; i++) {
                        valores[i] = scanner.nextInt();
                    }
                    System.out.println("Resultado: " + somar(valores));
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor:");
                    a = scanner.nextInt();
                    System.out.println("Digite o segundo valor:");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + subtrair(a, b));
                    break;
                case 4:
                    System.out.println("Digite a quantidade de valores:");
                    n = scanner.nextInt();
                    valores = new int[n];
                    System.out.println("Digite os valores:");
                    for (int i = 0; i < n; i++) {
                        valores[i] = scanner.nextInt();
                    }
                    System.out.println("Resultado: " + subtrair(valores));
                    break;
                case 5:
                    System.out.println("Digite o primeiro valor:");
                    a = scanner.nextInt();
                    System.out.println("Digite o segundo valor:");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + multiplicar(a, b));
                    break;
                case 6:
                    System.out.println("Digite a quantidade de valores:");
                    n = scanner.nextInt();
                    valores = new int[n];
                    System.out.println("Digite os valores:");
                    for (int i = 0; i < n; i++) {
                        valores[i] = scanner.nextInt();
                    }
                    System.out.println("Digite o multiplicador:");
                    int multiplicador = scanner.nextInt();
                    int[] resultado = multiplicar(valores, multiplicador);
                    System.out.print("Resultado: ");
                    for (int i = 0; i < resultado.length; i++) {
                        System.out.print(resultado[i] + " ");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Digite o primeiro valor:");
                    a = scanner.nextInt();
                    System.out.println("Digite o segundo valor:");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + dividir(a, b));
                    break;
                case 8:
                    System.out.println("Digite a quantidade de valores:");
                    n = scanner.nextInt();
                    valores = new int[n];
                    System.out.println("Digite os valores:");
                    for (int i = 0; i < n; i++) {
                        valores[i] = scanner.nextInt();
                    }
                    double resultadoDivisao = dividir(valores);
                    if (Double.isNaN(resultadoDivisao)) {
                        System.out.println("Não é possível calcular a divisão.");
                    } else {
                        System.out.println("Resultado: " + resultadoDivisao);
                    }
                    break;
                case 0:
                    System.out.println("SAIU!");
                    break;
                default:
                    System.out.println("Opção inválida. Selecione novamente.");
            }
            System.out.println();
        } while (opcao != 0);
        scanner.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int[] valores) {
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int subtrair(int[] valores) {
        int resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int[] multiplicar(int[] valores, int multiplicador) {
        int[] resultado = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            resultado[i] = valores[i] * multiplicador;
        }
        return resultado;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    public static double dividir(int[] valores) {
        double somaPares = 0;
        double somaImpares = 0;
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                somaPares += valores[i];
            } else {
                somaImpares += valores[i];
            }
        }
        if (somaPares == 0) {
            return Double.NaN;
        } else {
            return somaImpares / somaPares;
        }
    }
}
