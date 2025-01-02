public class func1{
    public static int countmaleStudents(String[]genders){
        if(genders.length != 10){
            return -1;
        }
      int maleCount = 0;
      for(String gender : genders){
        if(gender.equals("male")){
            maleCount++;
        }
      }
      return maleCount;
    }
public static void main(String[]args){
  String[] genders = {"male","male","male","male","male","male","male","female","female","female"};
  int maleCount = countmaleStudents(genders);
  if(maleCount != -1){
    System.out.println(maleCount);
  }
    }
}