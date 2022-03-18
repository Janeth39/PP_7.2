public class Hockey extends Sport
{
    double puckSize;
    int numsOfTackle;


    public Hockey(String name, int sizeOfTeam, double puckSize, int numsOfTackle)
    {
        super(name, sizeOfTeam);
        this.puckSize = puckSize;
        this.numsOfTackle = numsOfTackle;
    }

    @Override
    public String toString()
    {
        String output = super.toString() +
                        "\nPuck Size: " + puckSize +
                        "\nTackles: " + numsOfTackle;
        return output;
    }
}
