public class Main
{
    public static void main ( String [] args )
    {
        Basketball basketball = new Basketball("Basketball", 21, 6);
        Hockey hockey = new Hockey("Hockey", 18, 3.0, 15);
        Soccer soccer = new Soccer("Soccer", 20, 5, 1);

        System.out.println(basketball);
        System.out.println(soccer);
        System.out.println(hockey);
    }
}
