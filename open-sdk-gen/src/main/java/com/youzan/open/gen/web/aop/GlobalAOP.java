package com.youzan.open.gen.web.aop;

import com.youzan.open.gen.constant.AppCode;
import com.youzan.open.gen.exception.AppException;
import com.youzan.open.gen.model.ResultModel;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ph0ly
 * @time 2016-10-20
 */
@Component
@Aspect
public class GlobalAOP {

    private final static Logger LOG = LoggerFactory.getLogger(GlobalAOP.class);

    @Around("execution(* com.youzan.amon.web.controller.*.*(..))")
    public Object doAroundMethodForWeb(ProceedingJoinPoint pig) throws Throwable {
        Object obj;
        try {
            long startTime = System.currentTimeMillis();
            MethodSignature methodSign = (MethodSignature) pig.getSignature();
            LOG.debug(String.format("##开始执行%s方法, 参数名称为%s, 值为%s", methodSign.getMethod().getName(), Arrays.toString(methodSign.getParameterNames()), Arrays.toString(pig.getArgs())));
            obj = pig.proceed();
            LOG.debug(String.format("##结束调用%s总耗时：%ss", methodSign.getMethod().getName(), (System.currentTimeMillis() - startTime) / 1000.0));
        } catch (AppException ex) {
            return createResult(pig, ex, ex.getData().getCode(), ex.getData().getMessage());
        } catch (Throwable t) {
            LOG.error("", t);
            return createResult(pig, null, AppCode.INTERNAL_SERVER_ERROR.INTERNAL_SERVER_ERROR.getCode(), AppCode.INTERNAL_SERVER_ERROR.getMessage());
        }
        return obj;
    }

    private Object createResult(ProceedingJoinPoint pig, Exception ex, String code, String message) {
        MethodSignature methodSign = (MethodSignature) pig.getSignature();
        String errorMessage = String.format("##执行%s方法出错, 参数名称为%s, 值为%s", methodSign.getMethod().getName(),
                Arrays.toString(methodSign.getParameterNames()), Arrays.toString(pig.getArgs()));
        if(ex instanceof AppException) {
            LOG.warn(errorMessage);
        } else {
            LOG.error(errorMessage, ex);
        }
        /**
         * 构造返回对象
         */
        ResultModel result = null;
        try {
            Class<?> returnTypeMethod = methodSign.getReturnType();
            result = (ResultModel)returnTypeMethod.newInstance();
            result.setCode(code);
            result.setMessage(message);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return result;
    }

}
