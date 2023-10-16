package testefuncao01;
public class TesteFuncao01 {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    public static void main(String[] args) {
        System.out.println("O programa começou.");
        soma(5,23);
    }   
}
