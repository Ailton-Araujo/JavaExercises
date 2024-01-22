public class Exercise01 {
    private String text;
    private String signal;
    private String oddOrPair;

    Exercise01 (int number) {
        if(number >= 0){
            this.signal = "positivo";
        }else{
            this.signal = "negativo";
        }
        if(number % 2 == 0 ){
            this.oddOrPair= "par";
        }else{
            this.oddOrPair = "impar";
        }

        this.text = number + " é " + oddOrPair + " e " + signal;
    }

    public void result(){
        System.out.println(text);
    }
}
