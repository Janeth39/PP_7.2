public class Sport
{
    public String name;
    public int sizeOfTeam;

    public Sport (String name, int sizeOfTeam)
    {
        this.name = name;
        this.sizeOfTeam = sizeOfTeam;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSizeOfTeam(int sizeOfTeam)
    {
        this.sizeOfTeam = sizeOfTeam;
    }

    public String getName()
    {
        return name;
    }

    public int getSizeOfTeam()
    {
        return sizeOfTeam;
    }
    public String toString()
    {
        String output = "\nName: " + name +
                        "\nTeam Size: " + sizeOfTeam;

        return output;

    }
}
