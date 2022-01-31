package es.cristian;

public class Main {

    public static void main(String[] args) {
        int partido;

        for (int i = 1; i <= 15; i++) {
            partido = (int) (Math.round(Math.random() * 2));

            if (partido == 0) {
                System.out.println("Partido " + i + ": X" );
            } else {
                System.out.println("Partido : " + partido);

            }
        }
    }
}
