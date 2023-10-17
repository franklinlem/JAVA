package testefuncao01;
public class TesteFuncao01 {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("O programa começou.");
        int sm = soma(5,23);
        System.out.println("A soma é " + sm);
    }   
}