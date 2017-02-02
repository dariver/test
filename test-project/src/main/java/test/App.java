package test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int count = 3;
        // per 5 minute
        int numberOfBuilds = 1;
        System.out.println("builds per 5 min: " + numberOfBuilds);
        // hour
        numberOfBuilds = numberOfBuilds * 12;
        System.out.println("builds per hour: " + numberOfBuilds);
        // day
        numberOfBuilds = numberOfBuilds * 24;
        System.out.println("builds per day: " + numberOfBuilds);
        // year
        numberOfBuilds = numberOfBuilds * 365;
        int numberOfBuildsPerYear = numberOfBuilds;
        System.out.println("builds per year: " + numberOfBuilds);
        int yearCount = 2;
        while (yearCount <= 100000 && numberOfBuilds > 0 ) {
            numberOfBuilds = numberOfBuildsPerYear * yearCount;
            //if (yearCount < 10 || yearCount == 100 || yearCount == 1000 || yearCount == 1000 || yearCount == 1000 || yearCount == 10000 || yearCount == 100000|| yearCount == 1000000)
            System.out.println("builds per "+ yearCount +" years: " + numberOfBuilds);
            yearCount++;
        }

        int longInteger = Integer.MAX_VALUE - 1;

        for (int i = 0; i < count; i++) {
            longInteger++;
            System.out.println(longInteger);
        }
    }
}
