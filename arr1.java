public class arr1{
    public static void main(String[]args){
       double[] height = {1.2,3.4,6.7,4.5,6.0,4.8};

       int tallestindex = 0;
       double maxheight = height[0];

       for(int i = 1; i < height.length; i++){
        if(height[i] > maxheight){
            maxheight = height[i];
            tallestindex = i;
        }
        
        
       }
        System.out.println("Tallest:" + tallestindex);
    }
}