package com.videoselenium.constant;

/**
 * 系统常量
 *
 */
public interface MsgConstant {

	String DB_PRIMARY_KEY = "id";

	/**
	 * 主键字段get方法
	 */
	String DB_PRIMARY_KEY_METHOD = "getId";

	/**
	 * 租户字段名
	 */
	String DB_TENANT_KEY = "tenantId";

	/**
	 * 租户字段get方法
	 */
	String DB_TENANT_KEY_GET_METHOD = "getTenantId";

	/**
	 * 租户字段set方法
	 */
	String DB_TENANT_KEY_SET_METHOD = "setTenantId";

	/**
	 * 业务状态[1:正常]
	 */
	int DB_STATUS_NORMAL = 1;


	/**
	 * 删除状态[0:正常,1:删除]
	 */
	int DB_NOT_DELETED = 0;
	int DB_IS_DELETED = 1;

	/**
	 * 用户锁定状态
	 */
	int DB_ADMIN_NON_LOCKED = 0;
	int DB_ADMIN_LOCKED = 1;

	/**
	 * 顶级父节点id
	 */
	Long TOP_PARENT_ID = 0L;

	/**
	 * 顶级父节点名称
	 */
	String TOP_PARENT_NAME = "顶级";

	/**
	 * 管理员对应的租户ID
	 */
	String ADMIN_TENANT_ID = "000000";

	/**
	 * 日志默认状态
	 */
	String LOG_NORMAL_TYPE = "1";

	/**
	 * 默认为空消息
	 */
	String DEFAULT_NULL_MESSAGE = "暂无承载数据";
	/**
	 * 默认成功消息
	 */
	String DEFAULT_SUCCESS_MESSAGE = "操作成功";
	/**
	 * 默认失败消息
	 */
	String DEFAULT_FAILURE_MESSAGE = "操作失败";
	/**
	 * 默认未授权消息
	 */
	String DEFAULT_UNAUTHORIZED_MESSAGE = "签名认证失败";

}
