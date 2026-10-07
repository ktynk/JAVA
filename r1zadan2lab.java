public class r1zadan2lab {
  public static void main(String[] args) {
  int arr[] = {1,2,3,4,5,6,7,8,9,10};
  int count = 0;
  int count1 = 0;
  for(int i=0; i<arr.length; i++)
  {
    if(arr[i] %2 == 0)
    {
      
       count++;
  }
}
int idx = 0;
 int newarr[] = new int[count];
   for(int i = 0; i<arr.length;i++)
   {
    
    if(arr[i] %2 == 0)
    {
      newarr[idx] = arr[i];
      idx++;
    }
   }
 System.out.println("кол-во чётных в первой кучке"+ count + " ");
 for (int i= 0; i<newarr.length;i++)
 {
    {
    if(newarr[i] %2 == 0)
    count1++;      
    }
 }
 System.out.println("колво во второй кучке"+ count1 + " ");
}
}