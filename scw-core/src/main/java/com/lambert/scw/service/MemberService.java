package com.lambert.scw.service;

import com.lambert.scw.bean.TMember;
import com.lambert.scw.dao.TMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private TMemberMapper tMemberMapper;

    public TMember getMember(Integer id) {
        return tMemberMapper.selectByPrimaryKey(id);
    }

}
