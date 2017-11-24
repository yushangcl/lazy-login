package com.whh.lazy.login.action;

import com.whh.lazy.login.manager.impl.BuOfficeAccountManagerImpl;
import com.whh.lazy.login.model.BuOfficeAccount;
import com.whh.lazy.login.model.BuOfficeAccountDOExample;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by huahui.wu on 2017/11/24.
 */
@Service
@ResponseBody
@RequestMapping("/office")
public class OfficeAccountAction {
    @Resource
    private BuOfficeAccountManagerImpl buOfficeAccountManager;

    @RequestMapping("/getAccount")
    public List<BuOfficeAccount> getOfficeAccount() throws Exception {
        BuOfficeAccountDOExample example = new BuOfficeAccountDOExample();
        List<BuOfficeAccount> list = buOfficeAccountManager.selectByExample(example);
        return list;
    }
}
