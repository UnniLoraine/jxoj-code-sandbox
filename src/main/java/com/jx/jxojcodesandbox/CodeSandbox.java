package com.jx.jxojcodesandbox;


import com.jx.jxojcodesandbox.model.ExecuteCodeRequest;
import com.jx.jxojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
