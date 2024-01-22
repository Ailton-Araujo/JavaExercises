import java.util.ArrayList;
import java.util.List;



public class Exercise06 {
	List<Holyday> holydaysList = new ArrayList<>();

    Exercise06(String[] date, String[] name){
        if(date.length != name.length){
            System.out.println("Entrada de feriados é valida");
            return;
        }
        for(int i=0; i<date.length; i++){
            Holyday holyday = new Holyday(date[i], name[i]);
            System.out.println(holyday);
            System.out.println(date[i]);
            System.out.println( name[i]);
            holydaysList.add(holyday);
        }
    }

    public void getList(){
        System.out.println(holydaysList);
    }
}
