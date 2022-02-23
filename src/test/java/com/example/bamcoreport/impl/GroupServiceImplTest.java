package com.example.bamcoreport.impl;

import com.example.bamcoreport.model.entity.Group;
import com.example.bamcoreport.model.entity.User;
import com.example.bamcoreport.repository.GroupRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@SpringBootTest
class GroupServiceImplTest {


    @Mock
    private GroupRepository groupRepository;

    @InjectMocks
    private GroupServiceImpl groupService;

    @Test
    void getAllGroup() {
        LocalDateTime now = LocalDateTime.now();
        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
        Group group2 = new Group(2L,"group2","group2","group2","group2",new User(),now,now);
        Group group3 = new Group(3L,"group3","group3","group3","group3",new User(),now,now);

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        doReturn(groups).when(groupRepository).findAll();
        Mockito.when(groupService.getAllGroup()).thenReturn(groups);
        assertNotNull(groupService.getAllGroup());
//        List<Group> groupList = groupService.getAllGroup();
//        assertThat(groupList).isNotEmpty();
    }

    @Test
    void createGroup() {
//        LocalDateTime now = LocalDateTime.now();
//        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
//        when(groupService.createGroup(group1)).thenReturn(group1);
//        assertThat(groupService.createGroup(group1).getName()).isEqualTo("group1");
    }

    @Test
    void updateGroup() {
//        LocalDateTime now = LocalDateTime.now();
//        Group group = new Group();
//        group.setId(89L);
//        group.setName("Test Name");
//        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
//        //given(groupRepository.findById(group.getId())).willReturn(Optional.of(group));
//        when(groupService.updateGroup(group1.getId(),group1)).thenReturn(group);
//        assertNotNull(groupService.updateGroup(group1.getId(),group1));

    }

    @Test
    void deleteGroup() {
//        LocalDateTime now = LocalDateTime.now();
//        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
//        assertThat(groupService.deleteGroup(group1.getId())).isEqualTo("Group removed !!");
    }

    @Test
    void getGroupById() {
//        LocalDateTime now = LocalDateTime.now();
//        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
//        when(groupService.getGroupById(group1.getId())).thenReturn(Optional.of(group1));
//        assertNotNull(groupService.getGroupById(group1.getId()));

    }
}