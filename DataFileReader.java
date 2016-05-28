import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Swen on 20.05.2016.
 * CSV File reader
 */
public class DataFileReader
{
    public static int readYearCsv(String YearDatasetFile, ArrayList years)
    {
        String filename =YearDatasetFile;
        File file = new File(filename);
        int MaxYear=0;
        try
        {
            Scanner InputStream = new Scanner(file);
            int i =0;
            while (InputStream.hasNextLine())
            {
                String line = InputStream.nextLine();
                if (line.matches("\\d*;\\d*;\\d*;\\d*"))
                {
                    String StrSplitArray[] = line.split(";");
                    //System.out.println(StrSplitArray[0]);
                    years.add(new YearDataSet(Integer.parseInt(StrSplitArray[0]),Integer.parseInt(StrSplitArray[1]),Integer.parseInt(StrSplitArray[2]),Integer.parseInt(StrSplitArray[3])));
                    if (Integer.parseInt(StrSplitArray[0])>MaxYear)
                    {
                        MaxYear=Integer.parseInt(StrSplitArray[0]);
                    }
                    i++;
                }
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return MaxYear;
    }

    public static void readDeadCsv(String DieDatasetFile, ArrayList live)
    {
        String filename =DieDatasetFile;
        File file = new File(filename);
        try
        {
            Scanner InputStream = new Scanner(file);
            int i =0;
            while (InputStream.hasNextLine())
            {
                String line = InputStream.nextLine();
                if (line.matches("\\d*;[-+]?[0-9]*,?[0-9]*;[-+]?[0-9]*,?[0-9]*"))
                {
                    String StrSplitArray[] = line.split(";");
                    for (int j=0; j<StrSplitArray.length; j++)
                    {
                        StrSplitArray[j]=StrSplitArray[j].replaceAll(",",".");
                    }
                    live.add(new LiveProbabilty(Integer.parseInt(StrSplitArray[0]),Double.parseDouble(StrSplitArray[1]),Double.parseDouble(StrSplitArray[2])));
                    i++;
                }
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static void readBirthCsv(String BirthDataSetFile, ArrayList birth)
    {
        String filename =BirthDataSetFile;
        File file = new File(filename);
        try
        {
            Scanner InputStream = new Scanner(file);
            int i =0;
            while (InputStream.hasNextLine())
            {
                String line = InputStream.nextLine();
                if (line.matches("\\d*;[-+]?[0-9]*,?[0-9]*"))
                {
                    String StrSplitArray[] = line.split(";");
                    for (int j=0; j<StrSplitArray.length; j++)
                    {
                        StrSplitArray[j]=StrSplitArray[j].replaceAll(",",".");
                    }
                    birth.add(new BirthProbability(Integer.parseInt(StrSplitArray[0]),Double.parseDouble(StrSplitArray[1])));
                    i++;
                }
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
