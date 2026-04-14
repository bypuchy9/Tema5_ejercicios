public class PiedraPapelTijera {

    public static String jugar(String jugador1, String jugador2) {

        if (!esValida(jugador1) || !esValida(jugador2)) {
            throw new IllegalArgumentException("Jugada no válida");
        }

        if (jugador1.equals(jugador2)) {
            return "EMPATE";
        }

        if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) ||
                (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) ||
                (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))) {
            return "JUGADOR1";
        }

        return "JUGADOR2";
    }

    private static boolean esValida(String jugada) {
        return jugada.equals("PIEDRA") ||
                jugada.equals("PAPEL") ||
                jugada.equals("TIJERA");
    }
}