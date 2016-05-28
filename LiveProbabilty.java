/**
 * Created by Swen on 21.05.2016.
 */
public class LiveProbabilty
{
    int age =0;
    double px_m=0;
    double px_w=0;

    public LiveProbabilty(int age, double px_m, double px_w)
    {
        this.age = age;
        this.px_m = px_m;
        this.px_w = px_w;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getPx_m()
    {
        return px_m;
    }

    public void setPx_m(double px_m)
    {
        this.px_m = px_m;
    }

    public double getPx_w()
    {
        return px_w;
    }

    public void setPx_w(double px_w)
    {
        this.px_w = px_w;
    }

    @Override
    public String toString()
    {
        return "LiveProbabilty{" +
                "age=" + age +
                ", px_m=" + px_m +
                ", px_w=" + px_w +
                '}';
    }
}
