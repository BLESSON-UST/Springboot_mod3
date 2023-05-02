package com.UST.interviewFeedback.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class interviewFeedback {
    @Id
    @GeneratedValue
    private long id;
    private String userid;
    private String candidateName;
    private String Position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String status;

    public interviewFeedback(long id, String userid, String candidateName, String position, String interviewerName, String interviewerEmpid, int rating, String status) {
        this.id = id;
        this.userid = userid;
        this.candidateName = candidateName;
        Position = position;
        InterviewerName = interviewerName;
        InterviewerEmpid = interviewerEmpid;
        this.rating = rating;
        this.status = status;
    }

    public interviewFeedback() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getInterviewerName() {
        return InterviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        InterviewerName = interviewerName;
    }

    public String getInterviewerEmpid() {
        return InterviewerEmpid;
    }

    public void setInterviewerEmpid(String interviewerEmpid) {
        InterviewerEmpid = interviewerEmpid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
