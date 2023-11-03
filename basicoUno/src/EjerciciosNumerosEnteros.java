public class EjerciciosNumerosEnteros {

    public void fibonacci(int n) {
        int i1 = 0;
        int i2 = 1;
        int suma;

        for (int j = 0; j < n; j++) {
            suma = i1 + i2;
            i1 = i2;
            i2 = suma;
            System.out.println("El término " + (j+1) + " es= " + suma);
        }
    }
    public void SumaDeEnteros(int n) {
        //Scanner teclado = new Scanner(System.in);
        //System.out.print("Ingrese el numero de sumas: ");
        //int num = teclado.nextInt();
        //int n = 8;
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
            System.out.println(" " + i + " " + suma);
        }
    }
    public void Aleatorio() {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int random;
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            random = (int)(Math.random()*10+1);

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i + " " + random);
        }
    }
}
