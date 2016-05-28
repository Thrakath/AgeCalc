/**
 * Created by Swen on 16.05.2016.
 */
public class YearDataSet
{
    private int jahr =0;
    private int count_m=0;
    private int count_w=0;
    private int count_total=0;

    public YearDataSet(int jahr, int count_m, int count_w, int count_total)
    {
        this.jahr = jahr;
        this.count_m = count_m;
        this.count_w = count_w;
        this.count_total = count_total;
    }

    public int getJahr()
    {
        return jahr;
    }

    public void setJahr(int jahr)
    {
        this.jahr = jahr;
    }

    public int getCount_m()
    {
        return count_m;
    }

    public void setCount_m(int count_m)
    {
        this.count_m = count_m;
    }

    public int getCount_w()
    {
        return count_w;
    }

    public void setCount_w(int count_w)
    {
        this.count_w = count_w;
    }

    public int getCount_total()
    {
        return count_total;
    }

    public void setCount_total(int count_total)
    {
        this.count_total = count_total;
    }

    @Override
    public String toString()
    {
        return "YearDataSet{" +
                "jahr=" + jahr +
                ", count_m=" + count_m +
                ", count_w=" + count_w +
                ", count_total=" + count_total +
                '}';
    }
}
