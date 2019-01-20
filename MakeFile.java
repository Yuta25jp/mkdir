import java.io.File;
import java.io.IOException;

public class MakeFile
{
  public static void main(String args [])
  {
    if (args.length == 0)
    {
      System.out.println("パラメータが未指定");
    }

    for (int i = 0; i <= 70 ; i++ )
    {

      File newdir = new File("Sample"+ i +".java");

      if (newdir.exists())
      {
        System.out.println("そのファイルは既に存在しています");
      }

      try
      {
        if (newdir.createNewFile())
        {
          String path = newdir.getPath();
          System.out.println(path + "を作成");
        }
        else
        {
          System.out.println("ファイルの作成に失敗");
        }
      }
        catch(IOException e)
        {
          System.out.println(e);
        }
     }
  }
}
