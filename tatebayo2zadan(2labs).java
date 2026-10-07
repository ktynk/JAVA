
public class tatebayo {
    public static void main(String[] args) {
        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int strok = num.length;
        int stolb = num[0].length;
      int transp[][] = new int[stolb][strok];
      for(int i = 0; i<strok; i++){
        for(int j = 0; j<stolb; j++)
        {
          transp[j][i] = num[i][j];
        }
      }
          System.out.println("транспонированная матрица");
          for (int i = 0; i<transp.length; i++)
          {
            for( int j = 0; j< transp[i].length;j++)
            {
              System.out.println(transp[i][j] + "");
            }
          }
      }
}
