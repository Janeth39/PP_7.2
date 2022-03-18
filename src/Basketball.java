public class Basketball extends Sport
{
    int numOfThreePointers;

    public Basketball(String name, int sizeOfTeam, int numOfThreePointers)
    {
        super(name, sizeOfTeam);
        this.numOfThreePointers = numOfThreePointers;
    }


    public String toString()
    {
        String output = super.toString() +
                "\nNumber of Three Pointers: " + numOfThreePointers;
        return output;
    }
}
