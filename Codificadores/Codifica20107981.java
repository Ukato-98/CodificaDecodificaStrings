package Codificadores;

public class Codifica20107981 implements Codifica {

    private String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    private int vet[] = new int[62];

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

        for (int i = 0; i < 62; i++) {
            vet[i] = i;
        }

        String palavranova = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                palavranova += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        palavranova += "-" + vet[i] + "-";
                    }
                }
            }
        }

        return palavranova;
    }

    @Override
    public String decodifica(String str) {

        return null;
    }

}