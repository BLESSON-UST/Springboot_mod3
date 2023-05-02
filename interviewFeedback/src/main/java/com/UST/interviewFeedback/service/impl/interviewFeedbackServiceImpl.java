package com.UST.interviewFeedback.service.impl;

import com.UST.interviewFeedback.Model.interviewFeedback;
import com.UST.interviewFeedback.dao.interviewFeedbackRepository;
import com.UST.interviewFeedback.service.interviewFeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class interviewFeedbackServiceImpl implements interviewFeedbackService {
    private final interviewFeedbackRepository repository;

    public interviewFeedbackServiceImpl(interviewFeedbackRepository repository) {
        this.repository = repository;
    }

    @Override
    public interviewFeedback save(interviewFeedback entity) {
        return repository.save(entity);
    }

    @Override
    public List<interviewFeedback> save(List<interviewFeedback> entities) {
        return (List<interviewFeedback>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<interviewFeedback> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<interviewFeedback> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<interviewFeedback> findAll() {
        return (List<interviewFeedback>) repository.findAll();
    }

    @Override
    public Page<interviewFeedback> findAll(Pageable pageable) {
        Page<interviewFeedback> entityPage = repository.findAll(pageable);
        List<interviewFeedback> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public interviewFeedback update(interviewFeedback entity, Long id) {
        return null;
    }

    @Override
    public interviewFeedback update(interviewFeedback entity, long id) {
        Optional<interviewFeedback> optional = findById(id) ;
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}