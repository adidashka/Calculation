package com.example.calculation;

public class ReactionsCalculationsButtons {
    private float _res;
    private float _arg1;
    private float _arg2;


    private String str;
    private String oper_Pred;
    private String string_Output;
    private Boolean oper_Equals;
    private Boolean input_Number;
    private Boolean first_Click;

    public ReactionsCalculationsButtons() {
        this._res = 0;
        this._arg1 = 0;
        this._arg2 = 0;
        this.str = "";
        this.oper_Pred = "";
        this.string_Output = "";
        this.oper_Equals = false;
        this.input_Number = false;
        this.first_Click = true;
    }

    public String getString_Output() {
        return string_Output;
    }

    public String getStr() {
        return str;
    }

    public ReactionsCalculationsButtons onClickAdd(String s_arg) {

        this.calculation(s_arg);
        oper_Pred = "+";
        return this;
    }
    public ReactionsCalculationsButtons onClickSub(String s_arg) {


        this.calculation(s_arg);
        oper_Pred = "-";
        return this;
    }

    public ReactionsCalculationsButtons onClickDiv(String s_arg) {

        this.calculation(s_arg);
        oper_Pred = "/";
        return this;
    }


    public  ReactionsCalculationsButtons onClickMul(String s_arg) {

        this.calculation(s_arg);
        oper_Pred = "*";
        return this;
    }


    public ReactionsCalculationsButtons onClickPercent(String s_arg) {

        _arg2 = Float.parseFloat(s_arg);
        _res = _arg2 / 100;
        string_Output = Float.toString(_res);

        return this;
    }

    public ReactionsCalculationsButtons onClickPlusMinus(String s_arg) {

        _arg2 = Float.parseFloat(s_arg);
        _res = _arg2 * (-1);
        string_Output = Float.toString(_res);

        return this;
    }

    public ReactionsCalculationsButtons onClickNumber(int _index, String s_arg) {
//        if (!input_Number) {
//            string_Output = Integer.toString(_index);
//        }
//        else {
//            if (!string_Output.equals("0") && (string_Output.length() < 9)) {
//                    string_Output = string_Output + Integer.toString(_index);
//            }
//        }

        if (s_arg.length()<9) {
            string_Output = string_Output + Integer.toString(_index);
        }
        input_Number = true;
        oper_Equals = false;
        return  this;
    }

    //+
    public ReactionsCalculationsButtons onClickZero (String s_arg) {
        if (s_arg.length()<9) {
            if (!(s_arg.equals("0")) && input_Number) {
                string_Output = string_Output + "0";
            }
            else
                string_Output = "0";
        }
        return this;
    }

    //+
    public  ReactionsCalculationsButtons onClickTochka (String s_arg) {
        //if (s_arg.length()<9) {
        if (input_Number) {
            if (!string_Output.contains(".")) {
                string_Output = string_Output + ".";
            }
        }
        else {
            string_Output = "0.";
        }
        //}
        input_Number = true;
        return this;
    }

    public ReactionsCalculationsButtons onClickAC() {

        str = "0";
        string_Output = "";
        _res = 0;
        _arg1 = 0;
        _arg2 = 0;

        first_Click = true;
        input_Number = false;
        oper_Pred="";
        oper_Equals = false;

        return this;
    }


    // реакция на клавишу равно
    public ReactionsCalculationsButtons onClickEquals(String s_arg) {

        if (!oper_Equals) {
            _arg2 = Float.parseFloat(s_arg);
        }
        else {
            _arg1 = _res;
        }
        switch (oper_Pred) {
            case "+":
                _res = _arg1 + _arg2;
                string_Output = "";
                str = Float.toString(_res);
                break;
            case "-":
                _res = _arg1 - _arg2;
                string_Output = "";
                str = Float.toString(_res);
                break;
            case "/":
                if (_arg2 != 0) {
                    _res = _arg1 / _arg2;
                    str = Float.toString(_res);
                } else {
                    str = "Error";
                }
                string_Output = "";
                break;
            case "*":
                _res = _arg1 * _arg2;
                string_Output = "";
                str = Float.toString(_res);
                break;
            case "":
                _res = _arg2;
                str = Float.toString(_res);
            default:
                break;
        }
        oper_Equals = true;
        input_Number = false;

        return this;
    }

    //калькуляция в зависимости от последней нажатой операцонной клавиши
    private void calculation (String s_arg) {

        if (input_Number) {
            _arg1 = Float.parseFloat(s_arg);
            string_Output = "";
            if (first_Click) {
                _res = _arg1;
                //str = Float.toString(_res);
                str = s_arg;
                first_Click = false;
            }
            else {
                switch (oper_Pred){
                    case "+":
                        _res = _res + _arg1;
                        str = Float.toString(_res);
                        break;

                    case "-":
                        _res = _res - _arg1;
                        str = Float.toString(_res);
                        break;

                    case "/":
                        if (_arg1 != 0) {
                            _res = _res / _arg1;
                            str = Float.toString(_res);
                        }
                        else
                            str = "Error";
                        break;

                    case "*":
                        _res = _res * _arg1;
                        str = Float.toString(_res);
                        break;
                    default:
                        break;
                }
            }
        }
        _arg1 = _res;
        oper_Equals = false;
        input_Number = false;

    }

}
