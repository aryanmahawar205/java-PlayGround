import java.util.Arrays;
import java.util.List;

class ArrayMethods
{
    public static void main(String[] args)
    {
        // asList method
        String[] foodItems = {"Chicken", "Bacon", "Apple"};
        List<String> foodItemsList = Arrays.asList(foodItems);
        System.out.println("List created - " + foodItemsList);

        System.out.println("----------");

        // fill method
        int[] values = new int[5];
        Arrays.fill(values, 100);
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%d ", values[i]);;
        }

        System.out.println("\n----------");

        // copyOf method
        int[] notCopied = {1, 2, 3, 4, 5};
        int[] copied = Arrays.copyOf(notCopied, notCopied.length);
        for (int i = 0; i < copied.length; i++)
        {
            System.out.printf("%d ", copied[i]);;
        }

        System.out.println("\n----------");

        // equals method
        String[] array1 = {"Tomato", "Lettuce", "Lemon"};
        String[] array2 = {"Tomato", "Lettuce", "Lemon"};
        System.out.println(Arrays.equals(array1, array2));

        System.out.println("\n----------");

        // compare method
        // more of less works like strcmp() of C
        String[] lexo1 = {"gajar", "zmooli", "kheera"};
        String[] lexo2 = {"gajar", "mooli", "kheera"};
        int diff = Arrays.compare(lexo1, lexo2);
        System.out.println("Lexographic Difference - " + diff);

        System.out.println("\n----------");

        // sort method
        int[] data = {5, 6, 8, 2, 4};
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++)
        {
            System.out.printf("%d ", data[i]);
        }

        System.out.println("\n----------");

        // binarySearch method
        // returns -1 if key not found, else returns index of key
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Index of key - " + Arrays.binarySearch(sortedArray, 5));

        System.out.println("\n----------");


    }
}