package com.example.spring_rest_api_session_java7.converter.task;

import com.example.spring_rest_api_session_java7.dto.response.TaskResponse;
import com.example.spring_rest_api_session_java7.entity.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskConverterResponse {

    public TaskResponse create(Task task) {
        if (task == null) return null;
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setId(task.getId());
        taskResponse.setTaskName(task.getTaskName());
        taskResponse.setTaskText(task.getTaskText());
        taskResponse.setDeadLine(task.getDeadLine());

        return taskResponse;
    }

    public List<TaskResponse> getAll(List<Task> tasks) {
        List<TaskResponse> taskResponses = new ArrayList<>();
        for (Task task : tasks) {
            taskResponses.add(create(task));
        }
        return taskResponses;
    }
}
