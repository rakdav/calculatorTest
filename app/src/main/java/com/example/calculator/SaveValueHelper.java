package com.example.calculator;

import android.content.SharedPreferences;

public class SaveValueHelper
{
    public static final String KEY_FIRST_OPERAND="first_operand";
    public static final String KEY_SECOND_OPERAND="second_operand";
    private final SharedPreferences sharedPreferences;

    public SaveValueHelper(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }
    public void saveValues(Values values)
    {
        sharedPreferences.edit().putString(KEY_FIRST_OPERAND,values.getFirstOperation()).
                putString(KEY_SECOND_OPERAND,values.getSecondOperation()).commit();
    }
    public Values readValues()
    {
        Values values=new Values();
        values.setFirstOperation(sharedPreferences.getString(KEY_FIRST_OPERAND,""));
        values.setSecondOperation(sharedPreferences.getString(KEY_SECOND_OPERAND,""));
        return values;
    }
}
