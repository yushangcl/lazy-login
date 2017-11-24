package com.whh.lazy.login.action;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by huahui.wu on 2017/11/24.
 */
public class OfficeAccountActionTest extends BaseTest {

    @Resource
    OfficeAccountAction officeAccountAction;


    @Test
    public void testGetOfficeAccount() throws Exception {
        System.out.println(officeAccountAction.getOfficeAccount());
    }

}