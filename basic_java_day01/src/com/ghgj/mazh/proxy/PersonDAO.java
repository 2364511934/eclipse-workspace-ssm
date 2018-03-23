/** 
* 
*/
package com.ghgj.mazh.proxy;

import com.ghgj.mazh.reflect.Student;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:39:18 
 * 
 * 描述: 需要进行功能增强的委托类
 * 
 * 	增强的功能是： 在insertStudent方法的调用前后 分别进行日志打印
 */
public class PersonDAO implements PersonInterface {

	@Override
	public int insertStudent(Student student) {
		// 以下这段代码是业务逻辑
		return null == student ? 0 : 1;
	}

}
