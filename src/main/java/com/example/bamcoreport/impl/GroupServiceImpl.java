package com.example.bamcoreport.impl;

import com.example.bamcoreport.model.entity.Group;
import com.example.bamcoreport.repository.GroupRepository;
import com.example.bamcoreport.service.GroupService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    public GroupRepository groupRepository;


    @Override
    public List<Group> getAllGroup() {

        return groupRepository.findAll();
    }

    @Override
    public Group createGroup(Group group) {

        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(long id, Group groupRequest) {
        Group group = groupRepository.findById(id).orElse(null);
        //  group.(groupRequest.);

        if(group != null){
            group.setName(groupRequest.getName());
            group.setParentPath(groupRequest.getParentPath());
            group.setDisplayName(groupRequest.getDisplayName());
            group.setDescription(groupRequest.getDescription());
            group.setCreatedBy(groupRequest.getCreatedBy());
            group.setCreationDate(groupRequest.getCreationDate());
            group.setLastUpdate(groupRequest.getLastUpdate());
        }
        return groupRepository.save(group);

    }

    @Override
    public String deleteGroup(long id) {
        groupRepository.deleteById(id);
        return "Group removed !!";

    }

    @Override
    public Optional<Group> getGroupById(long id) {
      return groupRepository.findById(id);
    }
}
