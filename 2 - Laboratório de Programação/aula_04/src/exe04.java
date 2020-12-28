public class exe04 {
    public static void main(String[] args) {
        String palindromo = "arara";

        for(int i=0; i<palindromo.length(); i++) {
            if(palindromo.charAt(i) != palindromo.charAt((palindromo.length() -1) - i)) {
                System.out.println("Não é um palindromo");
                break;
            }
        }
        System.out.println("É um palindromo");
    }
}