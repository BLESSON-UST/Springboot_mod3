package com.UST.interviewFeedback.dao;

import com.UST.interviewFeedback.Model.interviewFeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewFeedbackRepository extends PagingAndSortingRepository<interviewFeedback, Long> {
}