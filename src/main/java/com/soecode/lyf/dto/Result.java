package com.soecode.lyf.dto;

import com.soecode.lyf.enums.ResultType;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private ResultType success;// 是否成功标志

	private T data;// 成功时返回的数据

	private String error;// 错误信息

	public Result() {
	}

	// 成功时的构造器
	public Result(ResultType success, T data) {
		this.success = success;
		this.data = data;
	}

	// 错误时的构造器
	public Result(ResultType success, String error) {
		this.success = success;
		this.error = error;
	}

	public ResultType isSuccess() {
		return success;
	}

	public void setSuccess(ResultType success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "JsonResult [success=" + success + ", data=" + data + ", error=" + error + "]";
	}

}
