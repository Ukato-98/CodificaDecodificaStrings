package Codificadores;

public class Codifica20107981 implements Codifica {

    private String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    private int deslc = 4;

    @Override
    public String getNomeAutor() {
        return "Juan Acosta";
    }

    @Override
    public String getMatriculaAutor() {
        return "20107981";
    }

    @Override
    public String codifica(String str) {

        String contrario = new StringBuilder(str).reverse().toString();

        String nova = "";
        for (char s : contrario.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                nova += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        int pos = Math.floorMod((i + deslc), tabela.length());
                        nova += tabela.charAt(pos);
                    }
                }
            }
        }
        return nova;
    }

    public String decodifica(String str) {

        String normal = new StringBuilder(str).reverse().toString();

        String velha = "";
        for (char s : normal.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                velha += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        int pos = Math.floorMod((i - deslc), tabela.length());
                        velha += tabela.charAt(pos);
                    }
                }
            }
        }
        return velha;

    }

}