package com.example.jeffreypadgett.interviewPrep;

public class AccessModifiers {   // public means it is available to other packages... just have to import this package in order to use it.
    // 9/10 times, is going to be public.
    // default would mean this class is only available to the package.


    public AccessModifiers () {  // explicit constructor... same as auto generated implicit constructor.  Unnecessary

    }
    // Classes only use Default or Public.

    public static int RANDOMKEYINT = 1239841; // cannot be referenced via an object instance of AccessModifiers... must do AccessModifiers.RANDOMKEYINT;


    public int a = 1;  // Visible to whole word.
    protected int d = 4;  // less restrictive than the Default.  Visible to package AND all subsclasses.  Used with inheritance, extending classes.
    int c = 3;  // Default, is visible only to this package.
    private int b = 2;  // Only this class has access to this variable - most restrictive modifier.




    public int getB() {  // allows access to class's b, even though b is private.
        return b;
    }

    public void setB(int b) {

        this.b = b;  // "this" refers to the class.  If I just said "b" = b, then it would be referring to itself in the argument.
        // this.b = b;
    }





/*  Most Developers will use private variables within a public class.  The variables are usually then accessed by a public method,
* so that the variables themselves cannot be messed with. That way, the variables can only be used as defined by the method.
*
* Most of the time, methods use PUBLIC modifiers*/



}
