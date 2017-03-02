package com.yunxin.service.impl;

import com.yunxin.entity.CaBank;
import com.yunxin.mapper.CaBankMapper;
import com.yunxin.service.CaBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by henryzhou on 17/3/2.
 */
@Service
public class CaBankServiceImpl implements CaBankService {

    @Autowired
    private CaBankMapper caBankMapper;

    @Override
    public CaBank selectCaBankById() {
        return caBankMapper.selectByPrimaryKey("C10201");
    }
}
