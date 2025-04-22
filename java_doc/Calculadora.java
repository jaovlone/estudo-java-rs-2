package java_doc;

public class Calculadora {

    public static void main(String[] args) {
        // Teste da calculadora
        Integer dividendo = 10;
        Integer divisor = 2;

        try {
            Integer resultado = dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * Realiza a divisão entre dois números inteiros
     *
     * @param dividendo     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo
     * @return              O resultado da divisão entre o dividendo e o divisor
     * @author              Gleyson Sampaio
     * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     */
    public static Integer dividir(Integer dividendo, Integer divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }
}
