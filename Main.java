import java.util.ArrayList;

/**
 * Created by Swen on 16.05.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        //Options
        int calculatedYears=10;

        // set datafiles names
        String YearDatasetFile="E:/GAA/JahrgangsstatistikLuther.csv";
        String DieDataSetFile="E:/GAA/Überlebenswahrscheinlichkeit.csv";
        String BirthDataSetFile="E:/GAA/Geburtenrate.csv";
        //Datatypes
        int MaxYear=0;
        ArrayList<YearDataSet> data_yearDataSets =new ArrayList<YearDataSet>(); //arraylist
        ArrayList<LiveProbabilty> data_liveprob=new ArrayList<LiveProbabilty>(); //arraylist
        ArrayList<BirthProbability> data_birthrate=new ArrayList<BirthProbability>();
        //read Datafiles
        MaxYear=DataFileReader.readYearCsv(YearDatasetFile, data_yearDataSets);
        DataFileReader.readDeadCsv(DieDataSetFile,data_liveprob);
        DataFileReader.readBirthCsv(BirthDataSetFile,data_birthrate);
        //calculate
        CalculateYears.calculateYear(data_yearDataSets,data_birthrate,MaxYear);

        //Debugoutput
        for (YearDataSet value: data_yearDataSets)
        {
            //System.out.println(value.toString());
        }

        for (LiveProbabilty value: data_liveprob)
        {
            //System.out.println(value.toString());
        }
        for (BirthProbability value: data_birthrate)
        {
            //System.out.println(value.toString());
        }
        System.out.println(MaxYear);

    }
}