package com.UST.interviewFeedback.controller.impl;

import com.UST.interviewFeedback.Model.interviewFeedback;
import com.UST.interviewFeedback.controller.interviewFeedbackController;
import com.UST.interviewFeedback.dto.interviewFeedbackDTO;
import com.UST.interviewFeedback.mapper.interviewFeedbackMapper;
import com.UST.interviewFeedback.service.interviewFeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/interview-feedback")
@RestController
public class interviewFeedbackControllerImpl implements interviewFeedbackController {
    private final interviewFeedbackService interviewFeedbackService;
    private final interviewFeedbackMapper interviewFeedbackMapper;

    public interviewFeedbackControllerImpl(interviewFeedbackService interviewFeedbackService, interviewFeedbackMapper interviewFeedbackMapper) {
        this.interviewFeedbackService = interviewFeedbackService;
        this.interviewFeedbackMapper = interviewFeedbackMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public interviewFeedbackDTO save(@RequestBody interviewFeedbackDTO interviewFeedbackDTO) {
        interviewFeedback interviewFeedback = interviewFeedbackMapper.asEntity(interviewFeedbackDTO);
        return interviewFeedbackMapper.asDTO(interviewFeedbackService.save(interviewFeedback));
    }

    @Override
    @GetMapping("/{id}")
    public interviewFeedbackDTO findById(@PathVariable("id") long id) {
        interviewFeedback interviewFeedback = interviewFeedbackService.findById(id).orElse(null);
        return interviewFeedbackMapper.asDTO(interviewFeedback);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        interviewFeedbackService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<interviewFeedbackDTO> list() {
        return interviewFeedbackMapper.asDTOList(interviewFeedbackService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<interviewFeedbackDTO> pageQuery(Pageable pageable) {
        Page<interviewFeedback> interviewFeedbackPage = interviewFeedbackService.findAll(pageable);
        List<interviewFeedbackDTO> dtoList = interviewFeedbackPage
                .stream()
                .map(interviewFeedbackMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, interviewFeedbackPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public interviewFeedbackDTO update(@RequestBody interviewFeedbackDTO interviewFeedbackDTO, @PathVariable("id") long id) {
        interviewFeedback interviewFeedback = interviewFeedbackMapper.asEntity(interviewFeedbackDTO);
        return interviewFeedbackMapper.asDTO(interviewFeedbackService.update(interviewFeedback, id));
    }
}