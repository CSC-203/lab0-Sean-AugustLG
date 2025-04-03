public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      double z = 9.8;

      System.out.println("x: " + x + ", y: " + y + ", z: " + z);

      int[] nums = new int[4];
      nums[0] = 3;
      nums[1] = 6;
      nums[2] = -1;
      nums[3] = 2;

      for(int i = 0; i<nums.length; i++){
         System.out.println(nums[i]);
      }

      int numFound = char_count(y, 'l');
      System.out.println("Found:" + numFound);

      for(int i = 0; i < 11; i++){
         System.out.print(i + " " );
      }
   }
   public static int char_count(String s, char c){
      int count = 0;
      for(int i = 0; i<s.length(); i++){
         if(c == s.charAt(i)){
            count += 1;
         }
      }
      return count;
   }
}
