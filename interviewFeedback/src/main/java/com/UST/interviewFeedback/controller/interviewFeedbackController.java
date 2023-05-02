package com.UST.interviewFeedback.controller;

import com.UST.interviewFeedback.dto.interviewFeedbackDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "interviewFeedback API")
public interface interviewFeedbackController {
    @ApiOperation("Add new data")
    public interviewFeedbackDTO save(@RequestBody interviewFeedbackDTO interviewFeedback);

    @ApiOperation("Find by Id")
    public interviewFeedbackDTO findById(@PathVariable("id") long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") long id);

    @ApiOperation("Find all data")
    public List<interviewFeedbackDTO> list();

    @ApiOperation("Pagination request")
    public Page<interviewFeedbackDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public interviewFeedbackDTO update(@RequestBody interviewFeedbackDTO dto, @PathVariable("id") long id);
}