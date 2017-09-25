package com.whh.lazy.login.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import com.whh.lazy.login.mapper.BuOfficeAccountDOMapper;
import com.whh.lazy.login.model.BuOfficeAccount;
import com.whh.lazy.login.model.BuOfficeAccountDO;
import com.whh.lazy.login.model.BuOfficeAccountDOExample;
import com.whh.lazy.login.manager.BuOfficeAccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BuOfficeAccountManagerImpl
*  on 2017/9/22.
*/
@Service
@Transactional
public class BuOfficeAccountManagerImpl extends BaseManagerImpl<BuOfficeAccountDOMapper, BuOfficeAccount, BuOfficeAccountDO, BuOfficeAccountDOExample> implements BuOfficeAccountManager {

    private static Logger _log = LoggerFactory.getLogger(BuOfficeAccountManagerImpl.class);

    @Autowired
    BuOfficeAccountDOMapper buOfficeAccountDOMapper;

    @Override
    public BuOfficeAccountDOMapper getMapper() {
        return buOfficeAccountDOMapper;
    }
}