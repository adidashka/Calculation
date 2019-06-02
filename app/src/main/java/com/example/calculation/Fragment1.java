package com.example.calculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Fragment1 extends Fragment implements View.OnClickListener {

    private Unbinder unbinder;

    @BindView(R.id.id1) Button button1;
    @BindView(R.id.id2) Button button2;
    @BindView(R.id.id3) Button button3;
    @BindView(R.id.id4) Button button4;
    @BindView(R.id.id5) Button button5;
    @BindView(R.id.id6) Button button6;
    @BindView(R.id.id7) Button button7;
    @BindView(R.id.id8) Button button8;
    @BindView(R.id.id9) Button button9;
    @BindView(R.id.id0) Button button0;
    @BindView(R.id.add) Button buttonAdd;
    @BindView(R.id.sub) Button buttonSub;
    @BindView(R.id.mul) Button buttonMul;
    @BindView(R.id.div) Button buttonDiv;
    @BindView(R.id.idAC) Button buttonAC;
    @BindView(R.id.idTochka) Button buttonTochka;
    @BindView(R.id.equals) Button buttonEquals;
    @BindView(R.id.id_persent) Button buttonPersent;
    @BindView(R.id.plus_minus) Button buttonPlusMinus;


    @BindView(R.id.arg1) TextView textViewArg1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment1, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        buttonAC.setText("AC");
        return rootView;
    }

    public void setStringOutput (String s){
        textViewArg1.setText("");
        if (s.endsWith(".0")){
            s = s.replace(".0", "");
        }
        else {
            if (s.contains("E")& (s.length()>9)) {
                // дописать код, чтобы строка сокращалась в зависимоти от размера поля ввода вывода резльтата
            }
        }
        textViewArg1.setText(s);
    }





    public String getString (){
        String s = textViewArg1.getText().toString();
        return s;
    }



    @Override
    @OnClick ({R.id.id1, R.id.id2, R.id.id3, R.id.id4, R.id.id5, R.id.id6, R.id.id7, R.id.id8, R.id.id9, R.id.id0,
             R.id.add, R.id.sub, R.id.mul, R.id.div, R.id.idAC, R.id.idTochka, R.id.equals, R.id.id_persent, R.id.plus_minus})
    public void onClick(View v) {
        int buttonIndex = translateIdToIndex(v.getId());
        setText_A_or_AC(buttonIndex);
        Fragment1.OnSelectedButtonListener listener = (Fragment1.OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);
    }



    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.id0:
                index = 0;
                break;
            case R.id.id1:
                index = 1;
                break;
            case R.id.id2:
                index = 2;
                break;
            case R.id.id3:
                index = 3;
                break;
            case R.id.id4:
                index = 4;
                break;
            case R.id.id5:
                index = 5;
                break;
            case R.id.id6:
                index = 6;
                break;
            case R.id.id7:
                index = 7;
                break;
            case R.id.id8:
                index = 8;
                break;
            case R.id.id9:
                index = 9;
                break;
            case R.id.idTochka:
                index = 10;
                break;
            case R.id.idAC:
                index = 11;
                break;
            case R.id.div:
                index = 12;
                break;
            case R.id.mul:
                index = 13;
                break;
            case R.id.sub:
                index = 14;
                break;
            case R.id.add:
                index = 19;
                break;
            case R.id.equals:
                index = 16;
                break;
            case R.id.id_persent:
                index = 17;
                break;
            case R.id.plus_minus:
                index = 18;
                break;
        }
        return index;
    }


    private void setText_A_or_AC(int index){
        switch (index){
            case (1|2|3|4|5|6|7|8|9|10):
                buttonAC.setText("C");
                break;
            case (11):
                buttonAC.setText("AC");
                break;
            default:
                break;
        }
    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }

    @Override
    public void onDestroyView () {
        super.onDestroyView();
        unbinder.unbind();
    }
}
