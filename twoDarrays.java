public class twoDarrays{
    public static void main(String[]args){
        int[][] marks = {
          {80,80,70},
          {30,40,70},
          {40,50,60},
        };
        for(int stu = 0; stu < marks.length; stu++){
            int sum = 0;
            for(int sub = 0; sub < marks[stu].length; sub++){
                sum += marks[stu][sub];
            }
            System.out.println((stu + 1) + ":" + sum);
        }
    }
}