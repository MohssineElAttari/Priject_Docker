package com.example.bamcoreport.service;

import com.example.bamcoreport.model.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    List<Group> getAllGroup();

    Group createGroup(Group group);

    Group updateGroup(long id, Group group);

    String deleteGroup(long id);

    Optional<Group> getGroupById(long id);
}
