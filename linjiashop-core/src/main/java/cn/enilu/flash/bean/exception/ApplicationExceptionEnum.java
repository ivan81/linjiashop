package cn.enilu.flash.bean.exception;

/**
 * 异常枚举
 *
 * @author fengshuonan
 * @Date 2017/12/28 下午10:33
 */
public enum ApplicationExceptionEnum implements ServiceExceptionEnum{

	/**
	 * 其他
	 */
	WRITE_ERROR(500,"渲染界面错误"),

	/**
	 * 文件上传
	 */
	FILE_READING_ERROR(400,"FILE_READING_ERROR!"),
	FILE_NOT_FOUND(400,"FILE_NOT_FOUND!"),

	/**
	 * 错误的请求
	 */
	REQUEST_NULL(400, "请求有错误"),
	SERVER_ERROR(500, "服务异常，请联系管理员"),
	WECHAT_BIND_ANOTHER(500, "该手机号已经绑定其他微信号"),
	REQUEST_TOO_MANY(500, "请求频繁，请稍后重试"),
	TASK_CONFIG_ERROR(500, "定时任务配置错误");

	ApplicationExceptionEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	private Integer code;

	private String message;

	@Override
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
