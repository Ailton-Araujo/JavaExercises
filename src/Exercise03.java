public class Exercise03 {
    private int value;

    Exercise03(int value){
        this.value = value;
    }

    public void print(){
        System.out.println("Tabela de multiplicação de " + value);
        int multiple = 1;
        while(multiple <=10){
            System.out.println(value + " x " + multiple + " = " + (value * multiple));
            multiple++;
        }
    }
}
