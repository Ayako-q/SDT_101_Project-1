package Part2_Weappers;

/*
Part 2 - Part2_Weappers.Wrappers
Oleksii Ishchenko Project 1
*/

public class Wrappers {
    public static void main (String[] args)
    {
        // 1. and 2. Integer, Double etc. and using .valueOf()
        // create variables using wrapper classes

        String str_num = "123";
        String str_dub = "1.333";
        String str_bul = "False";
        Integer num1 = Integer.valueOf(str_num);
        Double num2 = Double.valueOf(str_dub);
        Boolean flag = Boolean.valueOf(str_bul);
        Character ch = 'C';

        // 3. using parseInt() for Integer

        int parsedInt = Integer.parseInt("123");

        // demonstrating usage
        System.out.println("\n\u001B[35mPart 1.1 .2. and .3 Integer, Double etc. , using .valueOf() using parseInt() for Integer\u001B[0m");
        System.out.println("""
                \nParsed integer:""" + parsedInt + """
                \nnum1:""" + num1 + """
                \nflag:""" + flag + """
                \nch:""" + ch + """
                """);

        // 4. Using intValue() and doubleValue()

        int num = num1.intValue();
        double dub = num2.doubleValue();

        // 5. Using toString
        String str = num1.toString();

        System.out.println("\n\u001B[35mPart 1.4 and .5 Using intValue() doubleValue() and using toString\u001B[0m");
        System.out.println("""
                \nintValue - num:""" + num + """
                \ndoubleValue - dub:""" + dub + """
                \ntoString - str:""" + str + """     
                """);

        // 6. Using hashCode()

        String hashString = "Testing HashCode";
        int hashTest = hashString.hashCode();
        System.out.println("\n\u001B[35mPart 1.6 Using hashCode()\n\u001B[0m" +
                "\nHashCode for String: " + hashTest);
        Integer hashInt = 1222;
        hashTest = hashInt.hashCode();
        System.out.println("\nHashCode for Integer: " + hashTest);
        Character hashChar = 'c';
        hashTest = hashChar.hashCode();
        System.out.println("\nHashCode for Character: " + hashTest);
        Double hashDub = 44.2144;
        hashTest = hashDub.hashCode();
        System.out.println("\nHashCode for Double: " + hashTest);

        // 7. compareTo() Usage with Srtings and Integers

        Integer numb = 1;
        String stroka = "Hellou worl";
        System.out.println(
                "\n\u001B[35mPart 1.7 compareTo() Usage\n\u001B[0m" +
                "\n1 compared to 2: " + numb.compareTo(2) +
                "\n1 compared to -4: " + numb.compareTo(-4) +
                "\n1 compared to 1: " + numb.compareTo(1) +
                "\n'Hellou worl' String compared to 'Hi everyone' String = " + stroka.compareTo("Hi everyone") +
                "\n'Hellou worl' String compaerd to 'uolleH lrow' = " + stroka.compareTo("uolleH lrow") +
                "\n'Hellou worl' String compaerd to 'Hellou worl' = " + stroka.compareTo("Hellou worl") +
                "\n\u001B[33mIf the number we're comparing is greater, compareTo() outputs 1, if it is less we'll get -1, if it is the same - 0\n\u001B[0m");

        // 8. Comparing a + b and a.toString() + b.toString()

        Integer a = 25;
        Integer b = 9;
        Integer c = a + b;
        String d = a.toString() + b.toString();
        System.out.println("\n\u001B[35mPart 1.8 Comparing a + b and a.toString() + b.toString()\n\u001B[0m" +
                "\na + b = " + c +
                "\na.toString() + b.toString() = " + d);

    }
}
