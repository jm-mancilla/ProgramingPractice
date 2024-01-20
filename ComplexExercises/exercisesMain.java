package ComplexExercises;

public class exercisesMain {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[] {9,8,7,6,5,4,3,2,1,0};
        boolean normalOrder = true;
        sortAnArray(arrayOfIntegers, normalOrder);

        for (int arrayOfInteger : arrayOfIntegers){
            System.out.printf("Value: %d%n", arrayOfInteger);
        }

    }

    private static void sortAnArray(int[] arrayOfIntegers){
        sortAnArray(arrayOfIntegers, true);

    }

    private static void sortAnArray(int[] arrayOfIntegers, boolean normalOrder) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = i; j <arrayOfIntegers.length ; j++) {
              if(normalOrder && arrayOfIntegers[i] > arrayOfIntegers[j])
                    interchange(arrayOfIntegers, i, j);
              if(!normalOrder && arrayOfIntegers[i] < arrayOfIntegers[j])
                  interchange(arrayOfIntegers, i, j);
            }
        }
    }

     static void interchange (int[] arrayOfIntegers, int i, int j){
        int aux = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[j];
        arrayOfIntegers[j] = aux;
    }

}
