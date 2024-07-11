package Leitura;

public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Alexandre", "M",20);
        p[1] = new Pessoa("Laís", "F", 19);

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Pilares da pedagogia","Lucas Montano", 1300, p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);

        l[0].abrir();
        l[0].folhear(300);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
