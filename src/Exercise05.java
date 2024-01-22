import java.util.HashMap;

public class Exercise05 {
    private String[] arr01;
    private String[] arr02;

    Exercise05(String[] arr01, String[] arr02) {
        this.arr01 = arr01;
        this.arr02 = arr02;
    }

    public void print() {
        String arr02Joined = String.join(",", arr02);
        for(int i =0; i<arr01.length; i++){
            if(arr02Joined.contains(arr01[i])){
                System.out.println(arr01[i]);
            }
        }
    }
}
