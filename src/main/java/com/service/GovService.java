package com.service;

import com.vo.GovLoginVo;

import javax.servlet.http.HttpServletResponse;

public interface GovService {

    /** 政府人员登录 */
    public String login(HttpServletResponse response, GovLoginVo vo);

}
