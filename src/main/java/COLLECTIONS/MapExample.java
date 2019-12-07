package COLLECTIONS;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

    public void introduceYS() {
        System.out.println("im mapexample test");
    }


    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();
        employees.put(1, "andrzej");
        employees.put(2, "bolesław");

        MapExample employee = new MapExample();
        employee.introduceYS();


        System.out.println(employees.get(1));
        System.out.println(employees.get(2));
        System.out.println(employees.get(3));

        System.out.println(employee);
        System.out.println(employees);
        System.out.println(employees.size());
        System.out.println(employees.get(1));
        System.out.println(employees.values());
        System.out.println(employees.keySet());

        Set<Integer> keySet = employees.keySet();
        System.out.println(keySet);

        System.out.println("ENTRYSET:");

        Set<Map.Entry<Integer,String>> entryset = employees.entrySet();

        for (Map.Entry<Integer, String> entry : entryset) {
            System.out.println("Dla użytkownika: "+entry.getValue()+" odpowiadający indekx to: "+entry.getKey());
        }
        System.out.println(entryset);

        

//        entrySet();
//                getKey()
//                getValue()
    }
}
