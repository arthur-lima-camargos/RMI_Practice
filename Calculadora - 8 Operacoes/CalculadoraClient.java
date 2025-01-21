import java.rmi.Naming;
import java.util.Scanner;

public class CalculadoraClient {
    public static void main(String[] args) {
        try {
            Calculadora obj =
                    (Calculadora) Naming.lookup("rmi://10.0.2.15:1099/CalculadoraService");
            Scanner scanner = new Scanner(System.in);
            int opc = 9;
            Long[] valores;
            while (opc != 0) {
                System.out.println("CALCULADORA DE 8 OPERAÇÕES - FEITO POR: ARTHUR LIMA CAMARGOS");
                System.out.println("Aperte qualquer tecla para ver o menu...");
                scanner.nextLine();
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Elevar ao quadrado");
                System.out.println("6 - Raiz quadrada");
                System.out.println("7 - Divisão entre quadrados");
                System.out.println("8 - Multiplicação entre raízes");
                System.out.println("0 - Sair");
                System.out.println("Digite a opção desejada: ");
                while (opc < 0 || opc > 8) {
                    try {
                        opc = scanner.nextInt();

                    } catch (Exception e) {
                        System.err.println("Digite um valor válido!!!");
                        System.err.println("Digite a opção desejada: ");
                    }
                }
                switch (opc) {
                    case 1:
                        valores = obj.recebeValores();
                        long[] valoresLong = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong[i] = valores[i].longValue();
                        }
                        System.out.println("Resposta de " + valoresLong[0] + " + " + valoresLong[1]
                                + " = " + obj.adicao(valoresLong));
                        break;
                    case 2:
                        valores = obj.recebeValores();
                        long[] valoresLong1 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong1[i] = valores[i].longValue();
                        }
                        System.out.println("Resposta de " + valoresLong1[0] + " - "
                                + valoresLong1[1] + " = " + obj.subtracao(valoresLong1));
                        break;
                    case 3:
                        valores = obj.recebeValores();
                        long[] valoresLong2 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong2[i] = valores[i].longValue();
                        }
                        System.out.println("Resposta de " + valoresLong2[0] + " x "
                                + valoresLong2[1] + " = " + obj.multiplicacao(valoresLong2));
                        break;
                    case 4:
                        valores = obj.recebeValores();
                        long[] valoresLong3 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong3[i] = valores[i].longValue();
                        }
                        System.out.println("Resposta de " + valoresLong3[0] + " / "
                                + valoresLong3[1] + " = " + obj.divisao(valoresLong3));
                        break;
                    case 5:
                        valores = obj.recebeValores();
                        long[] valoresLong4 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong4[i] = valores[i].longValue();
                        }
                        long resposta[] = obj.elevaAoQuadrado(valoresLong4);
                        System.out
                                .println("O quadrado de " + valoresLong4[0] + " é " + resposta[0]);
                        System.out
                                .println("O quadrado de " + valoresLong4[1] + " é " + resposta[1]);
                        break;
                    case 6:
                        valores = obj.recebeValores();
                        long[] valoresLong5 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong5[i] = valores[i].longValue();
                        }
                        double resposta1[] = obj.raizQuadrada(valoresLong5);
                        System.out.println(
                                "A raiz quadrada de " + valoresLong5[0] + " é " + resposta1[0]);
                        System.out.println(
                                "A raiz quadrada de " + valoresLong5[1] + " é " + resposta1[1]);
                        break;
                    case 7:
                        valores = obj.recebeValores();
                        long[] valoresLong6 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong6[i] = valores[i].longValue();
                        }
                        System.out.println("A divisão entre os quadrados de" + valoresLong6[0]
                                + " e " + valoresLong6[1] + " = "
                                + obj.divisaoEntreQuadrados(valoresLong6));
                        break;
                    case 8:
                        valores = obj.recebeValores();
                        long[] valoresLong7 = new long[valores.length];
                        for (int i = 0; i < valores.length; i++) {
                            valoresLong7[i] = valores[i].longValue();
                        }
                        System.out.println("A multiplicação entre as raízes de" + valoresLong7[0]
                                + " e " + valoresLong7[1] + " = "
                                + obj.multiplicacaoEntreRaizes(valoresLong7));
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
