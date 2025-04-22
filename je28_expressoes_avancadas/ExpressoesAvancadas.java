package je28_expressoes_avancadas;

public class ExpressoesAvancadas {
    public static void main(String[] args) {
        String nome = "João Victor";
        Integer matricula = 2209841;
        Double salario = 6500.8;

        String dadosFuncionarios = String.format("Mat.:%08d ,Nome: %20s, %,.2f",matricula, nome, salario);

        System.out.println(dadosFuncionarios);
    }





}
