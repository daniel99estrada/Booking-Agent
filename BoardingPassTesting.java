public class BoardingPassTesting {
    public static void main(String[] args) {
        BoardingPass first = new BoardingPass("John Doe", 123456);
        BoardingPass second = new BoardingPass("Joe", 696969);
        BoardingPass third = new BoardingPass("James", 756849);
        BoardingPass[] arr = new BoardingPass[3];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;
        boolean uniqueNum = false;
        int tempNum = (int) (Math.random() * 999999) + 100000;
        while(!uniqueNum) {
            uniqueNum = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].getPassNumber() == tempNum) {
                    uniqueNum = false;
                    tempNum = (int) (Math.random() * 999999) + 100000;
                    break;
                }
            }
        }
        System.out.println(tempNum);
    }
}
