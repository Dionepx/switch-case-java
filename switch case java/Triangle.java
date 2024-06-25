public class Triangle {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Você tirou um A");
                break;
            case 'B':
                System.out.println("Você tirou um B");
                break;
            case 'C':
                System.out.println("Você tirou um C");
                break;
            default:
                System.out.println("Nota não reconhecida");
                break;
        }
    }
}