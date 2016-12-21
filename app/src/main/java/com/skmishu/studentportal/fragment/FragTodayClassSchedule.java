package com.skmishu.studentportal.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skmishu.studentportal.R;
import com.skmishu.studentportal.view_and_dialogues.DialogueAddClass;
import com.skmishu.studentportal.view_and_dialogues.DialogueAddExam;

/**
 * Created by sk mishu on 10/27/2016.
 */

public class FragTodayClassSchedule extends Fragment implements View.OnClickListener {

    private String fragmentName = "Class Schedule";
    private View view;
    private TextView showDialogue;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_today_class_schedule, container, false);
        showDialogue = (TextView) view.findViewById(R.id.todayDayNameTV);
        showDialogue.setOnClickListener(this);
        return view;
    }


    private void showDialogueOnClick() {
//        DialogueAddExam cdd = new DialogueAddExam(getActivity());
        DialogueAddClass cdd = new DialogueAddClass(getActivity());
//        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public String getFragmentName() {
        return fragmentName;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.todayDayNameTV:
                showDialogueOnClick();
                break;
        }
    }
}
