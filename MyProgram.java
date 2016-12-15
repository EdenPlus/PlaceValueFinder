public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        int number;
        switch(readInt("What do you want to do?\n1. Specific place value\n2. All place values\n> "))
        {
            case 1:
                number = readInt("\nNumber we are getting the place value of?\n> ");
                int place = 1;
                repeated: while(true)
                {
                    int temp = readInt("\nPlace value?\n> ");
                    if(temp == 1 || temp % 10 == 0)
                    {
                        place = temp;
                        break repeated;
                    }
                }
                System.out.println("\nThe selected place value: " + placeValue(place, number));
                break;
            case 2:
                number = readInt("\nNumber we are getting the place value of?\n> ");
                System.out.println("\nValue of each place in the number:\n" + allPlaceValues(number));
                break;
        }
    }
    
    public int placeValue(int place, int number)
    {
        return number%(place*10)-number%place;
    }
    
    public String allPlaceValues(int number)
    {
        int temp = 10;
        String output = "" + number%(temp);
        for(int i = 1; i < String.valueOf(number).length(); i++)
        {
            output += " + ";
            output += number%(temp * 10)-number%(temp);
            temp *= 10;
        }
        return output;
    }
}
