package com.youzan.open.gen.constant;

/**
 * @author ph0ly
 * @time 2016-09-07
 */
public enum AppCode {

    SUCCESS("000000", "操作成功完成"),

    INTERNAL_SERVER_ERROR("000500", "服务器内部错误"),

    SESSION_TIMEOUT("200000", "session超时"),

    ADMIN_ALREADY_EXISTS_ERROR("001000", "管理员已经存在"),
    ADMIN_NOT_FOUND_ERROR("001001", "管理员不存在"),
    ADMIN_ID_EMPTY_ERROR("001002", "管理员不能为空"),

    API_ALREADY_EXISTS_ERROR("002000", "API已经存在"),
    API_NOT_FOUND_ERROR("002001", "API不存在错误"),

    API_PARAM_ALREADY_EXISTS_ERROR("003000", "API参数已经存在"),
    API_PARAM_NOT_FOUND_ERROR("003001", "API不存在错误"),
    API_PARAM_TYPE_ERROR("003002", "API类型错误"),

    API_METRIC_ALREADY_EXISTS_ERROR("003100", "API监控项已经存在"),
    API_METRIC_NOT_FOUND_ERROR("003101", "API监控项不存在错误"),
    API_METRIC_TYPE_ERROR("003102", "API配置错误"),

    API_METRIC_RECORD_ALREADY_EXISTS_ERROR("003200", "API监控项记录已经存在"),

    API_TEST_ERROR("003300", "测试API失败, 请检查API是否可用"),

    ALERT_TASK_NOT_FOUND_ERROR("004000", "告警任务不存在错误, 请先配置告警任务"),
    ALERT_TASK_TYPE_ERROR("004001", "告警任务类型错误, 不支持自定义告警类型任务");

    private String code;
    private String message;

    AppCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
