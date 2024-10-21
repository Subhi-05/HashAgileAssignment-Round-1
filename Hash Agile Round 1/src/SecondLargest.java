public class SecondLargest {
    public static void secondlargest()
    {
        int numberArray[] = {99, 82, 63, 39,39, 16,73, 44,
                5, 6, 24, 22, 56, 27, 34, 54, 95, 95, 9, 55, 99, 43,
                27, 35, 90, 62, 63, 0, 26, 78, 66};

        int large = -1;
        int secondLarge = -1;

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > large) {
                secondLarge = large;
                large = numberArray[i];
            }

            if(numberArray[i]<large &&
                    numberArray[i]>secondLarge)
                secondLarge = numberArray[i];
        }

        System.out.println("First Large : "+large+"   SecondLarge : "+secondLarge);
    }
}
