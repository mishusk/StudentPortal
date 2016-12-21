package com.skmishu.studentportal.view_and_dialogues;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.skmishu.studentportal.R;

import java.util.ArrayList;

/**
 * Created by sk mishu on 10/29/2016.
 */

public class DialogueAddExam extends Dialog implements
        android.view.View.OnClickListener {

    private Activity activity;
    public Dialog dialog;
    private ImageButton yesIBtn, cancleIBtn;
    private Spinner subjectNameSpnr, dayIDSpnr;
    private EditText roomEt, teacherNameEt;
    private TextView timeTv, durationTv;
    private RadioGroup radioGroup;
    private SeekBar durationHour;

    private String subjectName, day, room, teacher, time, duration, am_pm;

    public DialogueAddExam(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialogue_exam_schedule);

        yesIBtn = (ImageButton) findViewById(R.id.save_btn);
        cancleIBtn = (ImageButton) findViewById(R.id.cancle_btn);
        subjectNameSpnr = (Spinner) findViewById(R.id.subjectName_spnr);
        dayIDSpnr = (Spinner) findViewById(R.id.dayName_spnr);
        roomEt = (EditText) findViewById(R.id.room_et);
        durationTv = (TextView) findViewById(R.id.durationTv);
        radioGroup = (RadioGroup) findViewById(R.id.am_pm_radioBtn);
        durationHour = (SeekBar) findViewById(R.id.seekBar);

        yesIBtn.setOnClickListener(this);
        cancleIBtn.setOnClickListener(this);

        ArrayList<String> subjectArray = new ArrayList<>();
        subjectArray.add("subject1");
        subjectArray.add("subject2");
        subjectArray.add("subject3");
        subjectArray.add("subject4");
        ArrayAdapter<String> subjectAdapter = new ArrayAdapter<String>(getContext(), R.layout.view_spinner_row, subjectArray);
        subjectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjectNameSpnr.setAdapter(subjectAdapter);
        subjectNameSpnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                subjectName = subjectNameSpnr.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //TODO: class duration (in minutes) Min=0 Max=180
        durationHour.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                durationTv.setText("" + String.valueOf(i) + " m");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //TODO: radio am and pm
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = radioGroup.getCheckedRadioButtonId();
                View radioButton = radioGroup.findViewById(id);
                if (radioButton.getId() == R.id.am_radioBtn) {
                    am_pm = "am";
                } else {
                    am_pm = "pm";
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_btn:
                Log.e("output", "SubjectName = " + subjectName
                        + "\nDayName = " + day + "" +
                        "\nRoomNumber = " + "" +
                        "\nDuration");
//                activity.finish();
                break;
            case R.id.cancle_btn:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }


}