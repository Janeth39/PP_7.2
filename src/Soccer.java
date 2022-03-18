public class Soccer extends Sport
{
    int goals;
    int penalty;

    public Soccer(String name, int sizeOfTeam, int goals, int penalty)
    {
        super(name, sizeOfTeam);
        this.goals = goals;
        this.penalty = penalty;
    }


    public String toString()
    {
        String output = super.toString() +
                "\nNumber of goals: " + goals +
                "\nPenalty Number: " + penalty;
        return output;
    }
}
