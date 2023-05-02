package com.UST.interviewFeedback.dto;

public class interviewFeedbackDTO  {
    private long id;
    private String userid;
    private String candidateName;
    private String Position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String status;

    public interviewFeedbackDTO() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return this.candidateName;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getPosition() {
        return this.Position;
    }

    public void setInterviewerName(String InterviewerName) {
        this.InterviewerName = InterviewerName;
    }

    public String getInterviewerName() {
        return this.InterviewerName;
    }

    public void setInterviewerEmpid(String InterviewerEmpid) {
        this.InterviewerEmpid = InterviewerEmpid;
    }

    public String getInterviewerEmpid() {
        return this.InterviewerEmpid;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}