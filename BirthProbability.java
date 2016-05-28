/**
 * Created by Swen on 21.05.2016.
 */
public class BirthProbability
{
    int age=0;
    double count_kids=0;

    public BirthProbability(int age, double count_kids)
    {
        this.age = age;
        this.count_kids = count_kids;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getCount_kids()
    {
        return count_kids;
    }

    public void setCount_kids(double count_kids)
    {
        this.count_kids = count_kids;
    }

    @Override
    public String toString()
    {
        return "BirthProbability{" +
                "age=" + age +
                ", count_kids=" + count_kids +
                '}';
    }
}
