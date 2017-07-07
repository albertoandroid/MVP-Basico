package com.androiddesdecero.mvpdesdecero;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

public interface AlCuadrado {

    interface View{
        void showResult(String result);
        void showError (String error);
    }

    interface Presenter{
        void showResult(String result);
        void alCuadrado(String data);
        void showError(String error);
    }

    interface Model{
        void alCuadrado(String data);
    }
}
