public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match.");
        System.out.println("Filme: Top Gun: Maverick.");
        
        int ano=2022;
        System.out.println("Ano de Lançamento: "+ano);
        boolean incluidoNoPlano=true;
        double notaDoFilme=8.1;
        double media=(9.8+6.3+8.0)/3;
        System.out.println("A média é: "+media);

        //Text blocks + concatenação
        String sinopse= """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!!
                Ano de lançamento:
                """+ano;
        System.out.println(sinopse);

        //Casting
        int classificacao=(int)(media/2);
        System.out.println("A classificação é:"+classificacao);
    }
}
