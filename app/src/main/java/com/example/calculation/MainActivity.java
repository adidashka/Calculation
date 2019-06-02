package com.example.calculation;

import android.content.res.Configuration;
import android.graphics.Point;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements Fragment1.OnSelectedButtonListener {

    Fragment1 fragment1;

    ReactionsCalculationsButtons reactCalcsBut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.fragment1);


        reactCalcsBut =  new ReactionsCalculationsButtons ();

    }

    @Override
    public void onButtonSelected(int buttonIndex) {
            switch (buttonIndex) {
                //нажаты клавиши цифр
                case (1):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (2):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (3):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (4):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (5):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (6):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (7):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (8):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (9):
                    reactCalcsBut.onClickNumber(buttonIndex, fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;

                case (0):
                    reactCalcsBut.onClickZero(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;

                //нажата точка
                case (10):
                    reactCalcsBut.onClickTochka(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;

                //нажата кнопка АС
                case (11):
                    reactCalcsBut.onClickAC();
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;

                case (12):
                    reactCalcsBut.onClickDiv(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;
                case (13):
                    reactCalcsBut.onClickMul(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;
                case (14):
                    reactCalcsBut.onClickSub(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;
                case (19):
                    reactCalcsBut.onClickAdd(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;
                case (16):
                    reactCalcsBut.onClickEquals(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getStr());
                    break;
                case (17):
                    reactCalcsBut.onClickPercent(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
                case (18):
                    reactCalcsBut.onClickPlusMinus(fragment1.getString());
                    if (fragment1 != null)
                        fragment1.setStringOutput(reactCalcsBut.getString_Output());
                    break;
            }


    }


}
