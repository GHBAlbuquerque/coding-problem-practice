public class ZigZag {

    public static int[] solution(int[] numbers) {
        int sizeResult = numbers.length - 2;
        int[] result = new int[sizeResult];
        int resultIterator = 0;

        for(int i=1; i<numbers.length-1; i++){
            boolean zigzag1 = numbers[i] > numbers[i-1] && numbers[i] > numbers[i+1];
            boolean zigzag2 = numbers[i] < numbers[i-1] && numbers[i] < numbers[i+1];

            if(zigzag1 || zigzag2) {
                result[resultIterator] = 1;
            } else {
                result[resultIterator] = 0;
            }

            resultIterator++;
        }

        return result;

    }
}

