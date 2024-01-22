public class Exercise04 {
    private int height;

    Exercise04 (int height){
        if(height <=0){
            System.out.println("Valor invalido");
            return;
        }
        this.height = height;
    }

    public void print(){
        int i = 1;
        while (i <= height) {
            String stringI = String.valueOf(i);
            System.out.println(String.format("%0" + i + "d", 0).replace("0", stringI));
            i++;
        }
    }  
}
