import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> cars = new HashMap<>();
        for(int j = 0;j<7;j++){
            Car cr = new Car("bmw"+j);
            cars.put(j,cr.getName());
        }
        System.out.println(cars);
    }
}
