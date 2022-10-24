import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AppAluno {
    //Criado método main
    public static void main(String[] args) {
        //Criada instancia de aluno
        Aluno a1 = new Aluno();
        Scanner in = new Scanner(System.in);
        //Informar nome
        System.out.print("Informe o nome do aluno: ");
        a1.setNome(in.nextLine());
        //Informar matricula
        System.out.print("\nInforme a matrícula do aluno: ");
        a1.setMatricula(in.nextLine());
        //Informar frequencia
        System.out.print("\nInforme a frequencia do aluno: ");
        a1.setFrequencia(confirmaNumero());
        //Informar nota p1
        System.out.print("\nInforme a nota da P1: ");
        a1.setP1(informaNota());
        //Informar nota p2
        System.out.print("\nInforme a nota da P2: ");
        a1.setP2(informaNota());
        //Informar nota p3
        System.out.print("\nInforme a nota da P3: ");
        a1.setP3(informaNota());
        //Informar nota da média de exercícios
        System.out.print("\nInforme a nota da Média de exercícios: ");
        a1.setMe(informaNota());
        a1.calculaG1();
        if (!a1.isG1()&&a1.getFrequencia()>=75){
            System.out.print("Aluno precisará fazer G2");
            System.out.print("\nInforme a nota da G2: ");
            a1.setMediaG2(informaNota());
            a1.calculaG2();
        }
        System.out.println(a1);
        System.out.println(a1.relatorioAluno());
    }


    public static double informaNota(){
        double nota;
        do {
            nota = confirmaNumero();
            if (nota<0){
                System.out.print("\nInforme um valor numerico maior ou igual a zero!!");
            }
        }while (nota< 0);
        return nota;
    }

    public static double confirmaNumero(){
        Scanner in = new Scanner(System.in);
        double numero;
        try {
            numero = in.nextDouble();
            in.nextLine();
        }catch (Exception e){
            System.out.print("Informe um VALOR NUMÉRICO: ");
            numero = confirmaNumero();
        }
        return numero;
    }
}
