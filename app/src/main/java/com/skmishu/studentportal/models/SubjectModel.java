package com.skmishu.studentportal.models;

/**
 * Created by mishu on 7/28/2016.
 */
public class SubjectModel {
    private int id;
    private String subjectName;

    public SubjectModel() {
    }

    public SubjectModel(int id, String subjectName) {
        this.id = id;
        this.subjectName = subjectName;
    }

    public SubjectModel(String subjectName) {
        this.subjectName = subjectName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
