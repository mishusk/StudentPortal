package com.skmishu.studentportal.models;

/**
 * Created by mishu on 7/28/2016.
 */
public class RoutineModel {
    private int id_rtn;
    private String subjectName;
    private int dayOfWeek;
    private String room_rtn;
    private String timeClassStart;
    private int classDuration;
    private String teacherName;

    public RoutineModel() {
    }


    // with id_rtn and without alarm time
    public RoutineModel(String subjectName, int dayOfWeek, String room_rtn,
                        String timeClassStart, int classDuration, String teacherName) {
        this.subjectName = subjectName;
        this.dayOfWeek = dayOfWeek;
        this.room_rtn = room_rtn;
        this.timeClassStart = timeClassStart;
        this.classDuration = classDuration;
        this.teacherName = teacherName;
    }

    public int getId() {
        return id_rtn;
    }

    public void setId(int id_rtn) {
        this.id_rtn = id_rtn;
    }

    public String getRoutinSubjctName() {
        return subjectName;
    }

    public void setRoutinSubjctName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getRoutinDay() {
        return dayOfWeek;
    }

    public void setRoutinDay(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getRoutineRoom() {
        return room_rtn;
    }

    public void setRoutineRoom(String room_rtn) {
        this.room_rtn = room_rtn;
    }

    public String getRoutinTime() {
        return timeClassStart;
    }

    public void setRoutinTime(String timeClassStart) {
        this.timeClassStart = timeClassStart;
    }

    public int getRoutinDuration() {
        return classDuration;
    }

    public void setRoutinDuration(int classDuration) {
        this.classDuration = classDuration;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}