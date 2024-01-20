import java.util.*;

public class ArraysListsMap {
    public static void main(String[] args) {
      //  sortArray();
      //  capitalizeFirstChar();
        showMapValues();
    }

    public static void sortArray(){
        int[] arrayOfNumbers = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] secondArrayOfNumbers = new int[]{10,9,8,7,6,5,4,3,2,1};


        Arrays.sort(secondArrayOfNumbers, 0, arrayOfNumbers.length);

        // First way to do it (without using Arrays method)
        for (int i = arrayOfNumbers.length-1; i >= 0; i--) {
            System.out.printf("\n Sorted array numbers: %s%n\t", arrayOfNumbers[i] + " ");

        }
        System.out.print("\n--------------------------\n");

        // Second way to do it (by using Arrays method)
        for (int i = 0; i < secondArrayOfNumbers.length; i++) {
            System.out.printf("\n Sorted array numbers: %s%n\t", secondArrayOfNumbers[i] + " ");

        }
    }

    public static void capitalizeFirstChar(){
        List<String> namesList = new ArrayList<>();
        namesList.add("inês");
        namesList.add("pablo");
        namesList.add("konstantinos");
        namesList.add("mancilla");

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i).toUpperCase().charAt(0)
                    + namesList.get(i).substring(1));
        }
    }

    public static void showMapValues (){
        Map<Integer, String> mapOfStrings = new HashMap<>();


        mapOfStrings.put(100,"one hundred");
        mapOfStrings.put(101,"one hundred and one");
        mapOfStrings.put(102,"one hundred and two");
        mapOfStrings.put(103,"one hundred and three");
        mapOfStrings.put(104,"one hundred and four");
        mapOfStrings.put(105,"one hundred and five");
        mapOfStrings.put(106,"one hundred and six");
        mapOfStrings.put(107,"one hundred and seven");
        mapOfStrings.put(108,"one hundred and eight");
        mapOfStrings.put(109,"one hundred and nine");
        mapOfStrings.put(110,"one hundred and ten");

        Iterator<String> iterator = mapOfStrings.values().iterator();
        System.out.println();

        for (int i = 0; i < mapOfStrings.size(); i++) {
            while (iterator.hasNext())
                System.out.printf("HashMap values: %s%n", iterator.next());
        }


    }
}
