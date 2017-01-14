import java.util.ArrayList;

/**
 * Created by Swen on 24.05.2016.
 */
public class CalculateYears
{
    public static void  calculateYear (ArrayList dataset_Years, ArrayList dataset_Birth, int MaxYear)
    {
        int newYear=MaxYear+1;
        int countNewHuman=0;

        //loop through year dataset an calculate age
        for (Object YearRow: dataset_Years)
        {
            System.out.println("Age: " + YearRow.getYear());
        }
        //loop through birthrates to find the right one

        // YearDataSet test=dataset_Years.get(2);
        System.out.println(dataset_Years.size());
        System.out.println(dataset_Birth.size());
        //System.out.println(dataset_Years.get(2));


    }
}
