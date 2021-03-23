package com.example.calculator;

import android.util.Log;

public class Calc
{
    public int Add(int a,int b)
    {
        return a+b;
    }
    public int Sub(int a,int b)
    {
        return a-b;
    }
    public int Mul(int a,int b)
    {
        return a*b;
    }
    public int Div(int a,int b)
    {
        if(b!=0)
            return a/b;
        {
            Log.d("error","Divide by zero");
            return 0;
        }
    }
}
