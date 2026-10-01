public class ContarVocales {

    public static void main(String[] args) {

        String texto = "hola";

        int totalVocales = vocales(texto);

        System.out.println("La cadena es: \"" + texto + "\"");
        System.out.println("Número de vocales: " + totalVocales);
}

    // Método recursivo para contar las vocales
    public static int vocales(String cadena) {

        // Caso base: cadena vacía
        if (cadena.isEmpty()) {
            return 0;
        }

        // Primer carácter
        char c = Character.toLowerCase(cadena.charAt(0));

        // Verificar si es vocal
        int esVocal = (c == 'a' || c == 'e' || c == 'i' ||c == 'o' ||c == 'u') ? 1 : 0;

        // Llamada recursiva
        return esVocal + vocales(cadena.substring(1));
}
}
