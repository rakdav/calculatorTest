package com.example.calculator;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.ContentView;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import androidx.test.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void saveandReadValues() throws Exception
    {
        Context context= InstrumentationRegistry.getContext();
        SharedPreferences sharedPreferences=context.getSharedPreferences("test",0);
        sharedPreferences.edit().clear();
        SaveValueHelper saveValueHelper=new SaveValueHelper(sharedPreferences);

        Values saveValues=new Values();
        saveValues.setFirstOperation("login");
        saveValues.setSecondOperation("pass");
        saveValueHelper.saveValues(saveValues);

        Values readvalues=saveValueHelper.readValues();
        assertTrue(saveValues.equalsTovalue(readvalues));
    }

}