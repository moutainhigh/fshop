/*
 * Copyright 2020 rannuo1010@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fshop.component.core.exception;

/**
 * Description：业务异常
 *
 * @author 然诺
 * @date 2020/2/22
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 3420268083230000759L;

	private IExceptionCode errorCode;

	public BizException() {
		super();
	}

	public BizException(String message) {
		super(message);
	}

	public BizException(Throwable cause) {
		super(cause);
	}

	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(IExceptionCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public IExceptionCode getErrorCode() {
		return errorCode;
	}
}
