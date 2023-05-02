package com.UST.interviewFeedback.mapper;

import com.UST.interviewFeedback.Model.interviewFeedback;
import com.UST.interviewFeedback.dto.interviewFeedbackDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface interviewFeedbackMapper extends GenericMapper<interviewFeedback, interviewFeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    interviewFeedback asEntity(interviewFeedbackDTO dto);
}