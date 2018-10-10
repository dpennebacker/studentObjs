package com.company;

public class Students {

    public String name;
    public double GPA;
    public static double highestGPA = 0;
    public static double secondGPA = 0;
    public static double thirdGPA = 0;



    public Students (String n, double g)
    {
        name = n;
        GPA = g;
        ranking();

    }

    private void ranking ()
    {
        if(GPA > highestGPA)
        {
            thirdGPA = secondGPA;
            secondGPA = highestGPA;
            highestGPA = GPA;

        }

        else if (GPA > secondGPA){
            thirdGPA = secondGPA;
            secondGPA = GPA;

        }

        else if (GPA > thirdGPA)
        {
            thirdGPA = GPA;
        }
    }

}
