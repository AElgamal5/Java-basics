import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
         * ArrayList
         * - resizable array: elements can be added or remove after compilation
         * - store reference data types
         */

        ArrayList<String> food = new ArrayList<String>();

        food.add("Shawarma");
        food.add("Kofta");
        food.add("Koshary");

        food.set(1, "Ful medames");

        food.remove(2);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(i + " : " + food.get(i));
        }

        food.clear();

        // 2D ArrayList
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("4");
        list2.add("5");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("6");
        list3.add("7");
        list3.add("8");
        list3.add("9");

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        lists.get(0).add("0");

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
