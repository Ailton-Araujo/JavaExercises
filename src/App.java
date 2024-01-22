public class App {
    public static void main(String[] args) {

    // Exercício 01
        Exercise01 positivoPar = new Exercise01(6);
        Exercise01 negativoPar = new Exercise01(-4);
        Exercise01 positivoImpar = new Exercise01(7);
        Exercise01 negativoImpar = new Exercise01(-67);
        
        positivoPar.result();
        positivoImpar.result();
        negativoPar.result();
        negativoImpar.result();

    // Exercício 02
        Exercise02 size0 = new Exercise02(0);
        Exercise02 size1 = new Exercise02(1);
        Exercise02 size2 = new Exercise02(2);
        Exercise02 size5 = new Exercise02(5);
        Exercise02 size15 = new Exercise02(15);

        size0.print();
        size1.print();
        size2.print();
        size5.print();
        size15.print();

    // Exercício 03
        Exercise03 value01 = new Exercise03(1);
        Exercise03 value03 = new Exercise03(3);
        Exercise03 value05 = new Exercise03(5);
        Exercise03 value07 = new Exercise03(7);

        value01.print();
        value03.print();
        value05.print();
        value07.print();

    // Exercício 04
        Exercise04 height0 = new Exercise04(0);
        Exercise04 height1 = new Exercise04(3);
        Exercise04 height7 = new Exercise04(7);
        Exercise04 height15= new Exercise04(15);

        height0.print();
        height1.print();
        height7.print();
        height15.print();

    // Exercício 05
        String[] arr01 = {"teste1", "teste3", "teste4", "teste5", "teste"};
        String[] arr02 = {"teste", "teste1","teste4"};

        Exercise05 iguais = new Exercise05(arr01, arr02);

        iguais.print();

    // Exercício 06
        String[] dates = {"01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024", "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024"};
        String[] names = {"Confraternização Mundial", "Carnaval", "Carnaval", "Sexta-feira Santa", "Tiradentes", "Dia do Trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Dia Nacional de Zumbi e da Consciência Negra", "Natal"};

        Exercise06 holydaysList = new Exercise06(dates, names);

        holydaysList.getList();
    }


}
