package questao02;

public class EmpregadoDaFaculdade {
    public static void main(String[] args) {
        private String nome;
        private double salario;
        private int horasAula;

        double getGastos(){
            return this.salario;
        }
        String getInfo(){
            return "nome:” + this.nome + " com salário “ + this.salario;

            System.out.println(+ getGastos);
            System.out.println(+ getInfo);
        }
    }
}
