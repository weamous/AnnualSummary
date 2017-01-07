package cn.com.loliclub.annualsummary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShowFragment extends Fragment {

    private int mPosition;

    public static ShowFragment newInstance(int position) {
        return new ShowFragment().setPosition(position);
    }

    public ShowFragment() {

    }

    protected ShowFragment setPosition(int position) {
        this.mPosition = position;
        return this;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mPosition == 0) {
            return inflater.inflate(R.layout.fragment_code_line, container, false);
        } else if (mPosition == 1) {
            return inflater.inflate(R.layout.fragment_overtime, container, false);
        } else if (mPosition == 2) {
            return inflater.inflate(R.layout.fragment_part_time, container, false);
        } else if (mPosition == 3) {
            return inflater.inflate(R.layout.fragment_clothes, container, false);
        } else if (mPosition == 4) {
            return inflater.inflate(R.layout.fragment_tea_time, container, false);
        } else if (mPosition == 5) {
            return inflater.inflate(R.layout.fragment_bility, container, false);
        } else {
            return inflater.inflate(R.layout.fragment_summary, container, false);
        }
    }

}
