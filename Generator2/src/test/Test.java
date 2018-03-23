package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import entity.EmpExample;
import entity.EmpExample.Criteria;
import mapper.EmpMapper;
import util.MybatisUtils;

public class Test {

	public static void main(String[] args) throws Exception{
		 List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("src/generatorConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
		   System.out.println("运行成功");
	}
	
	@org.junit.Test
	public void test3(){
		SqlSession session = MybatisUtils.getSession();
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		EmpExample example = new EmpExample();
		//离线查询
		Criteria criteria = example.createCriteria();
		criteria.andEnameLike("%S%");
		System.out.println(mapper.selectByExample(example).get(0).getEname());
		MybatisUtils.closeSession();
	}
	
	@org.junit.Test
	public void test4(){
		SqlSession session = MybatisUtils.getSession();
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		System.out.println(mapper.selectByPrimaryKey(7788));
		MybatisUtils.closeSession();
	}

}
