class recursion{
    static int sumOfSeries(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfSeries(n - 1);
    }

    public static void main(String[]args){
        int n = 6;
        int sum = sumOfSeries(n);
        System.out.println(sum);
    }
}