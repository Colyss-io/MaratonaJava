package academy.devdojo.MaratonaJava.introdução;

/*
  Prática

  Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

  Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>

   */
public class Aula03TiposPrimitivosExercícios {
    public static void main(String[] args) {
        // Criando as variáveis
        String nome = "Gabriel Amaral";
        String endereco = "Rua Geminiano gois 1300";
        double salario = 4718.18;
        String dataRecebimentoSalario = "31/10/2006";

        System.out.println("Eu "+ nome +", morando no endereço "+ endereco +", confirmo que recebi o salário de R$"+ salario + ", na data " + dataRecebimentoSalario);
    }
}
