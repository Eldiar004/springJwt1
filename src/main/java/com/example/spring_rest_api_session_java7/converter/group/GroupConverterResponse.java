package com.example.spring_rest_api_session_java7.converter.group;

import com.example.spring_rest_api_session_java7.dto.response.GroupResponse;
import com.example.spring_rest_api_session_java7.entity.Group;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class GroupConverterResponse {

    public GroupResponse create(Group group) {
        if (group == null) return null;
        GroupResponse groupResponse = new GroupResponse();
        groupResponse.setId(group.getId());
        groupResponse.setGroupName(group.getGroupName());
        groupResponse.setImage(group.getImage());
        groupResponse.setDateOfStart(LocalDate.now());
        return groupResponse;
    }

    public List<GroupResponse> getAll(List<Group> groups) {
        List<GroupResponse> groupResponses = new ArrayList<>();
        for (Group group : groups) {
            groupResponses.add(create(group));
        }
        return groupResponses;
    }
}
