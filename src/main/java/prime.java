public class prime {
    public static void main(String[] args) {
        System.out.println(2);
        for (int number = 0;number<100;number++){
            boolean check = true;
            if (number < 2){
                check = false;
            }
            if (number == 2){
                check = true;
            }
            if (number % 2 ==0){
                check = false;
            }for (int i =  3;i<number;i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number);
            }
        }

    }
}
