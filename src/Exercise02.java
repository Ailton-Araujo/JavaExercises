public class Exercise02 {
    private String result;
    Exercise02 (int size){
        if(size <=0){
            System.out.println("O tamanho da sequencia deve ser maior que zero");
            return;
        }
        long positionMinus1 = 1;
        long positionMinus2 = 0;
        long sum;
        int i = 0;
        while ( i < size ){
            if( i == 0){
                this.result = "0 ";
                i++;
            }else if(i == 1){
                this.result = result + i + " ";
                i++;
            } else {
                sum = positionMinus1 + positionMinus2;
                positionMinus2 = positionMinus1;
                positionMinus1 = sum;
                i++;
                this.result = result + sum + " ";
            }
        }
    }
    public void print (){
        if(result != null){
            System.out.println(result);
        }else{
            System.out.println("Entrada de tamanho invalida");
        }
    }
}