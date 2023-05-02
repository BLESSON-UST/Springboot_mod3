package com.UST.interviewFeedback.service;

import com.UST.interviewFeedback.Model.interviewFeedback;

import java.util.Optional;

public interface interviewFeedbackService extends GenericService<interviewFeedback, Long> {
    void deleteById(long id);

    Optional<interviewFeedback> findById(long id);

    interviewFeedback update(interviewFeedback entity, long id);
}