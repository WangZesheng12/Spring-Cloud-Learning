package com.codefish.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * sentinal
 * 4.授权规则 白名单黑名单
 */
@Component
public class RequestOriginParserDefinition implements RequestOriginParser {

    //定义区分来源: 本质作用是通过request域获取到来源标识
    //app  pc
    //然后 交给流控应用 位置进行匹配
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String serviceName = request.getParameter("serviceName");
        if (StringUtils.isEmpty(serviceName)){
//            throw new RuntimeException("serviceName is not empty");
        }
        return serviceName;
    }
}
