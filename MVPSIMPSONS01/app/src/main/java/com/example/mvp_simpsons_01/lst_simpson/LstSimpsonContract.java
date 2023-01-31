package com.example.mvp_simpsons_01.lst_simpson;

import com.example.mvp_simpsons_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public interface LstSimpsonContract {
    public interface View{
        void successLstSimpson(ArrayList<Simpson> lstSimpson);
        void failureLstSimpson(String err);
    }
    public interface Presenter{
        void lstSimpson(Simpson simpson);

    }
    public interface Model{
        void lstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener);
        interface OnLstSimpsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
    }
}
