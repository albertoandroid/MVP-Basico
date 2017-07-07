package com.androiddesdecero.mvpdesdecero;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

public class AlCuadradoModel implements AlCuadrado.Model {

    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlCuadradoModel(AlCuadrado.Presenter presenter){
        this.presenter=presenter;
    }


    @Override
    public void alCuadrado(String data) {
        if(data.equals("")){
            presenter.showError("Campo Vacio");
        }else{
            resultado= Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
