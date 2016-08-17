package com.fis.looslycoupled;

public class ClassDTO {
	private String className;
	private String methodName;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	@Override
	public String toString() {
		return "ClassDTO [className=" + className + ", methodName=" + methodName + "]";
	}
	

}
