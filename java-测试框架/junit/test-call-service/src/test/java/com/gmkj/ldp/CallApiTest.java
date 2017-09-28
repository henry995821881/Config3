/**
 * 
 */
package com.gmkj.ldp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.BaseDataService;
import com.xyscm.ldp.api.LdpDeliveryForAppService;
import com.xyscm.ldp.api.oconsign.dto.VStorageOconsignReportDto;

/**
 * ClassName: CallApiTest <br/>
 * 
 *
 * @author xielf
 * @version 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath*:spring/applicationContext-dubbo.xml"
	,"classpath*:spring/applicationContext.xml"
	})
public class CallApiTest {
	
	@Autowired
	BaseDataService baseDataService;
	@Autowired
	LdpDeliveryForAppService ldpDeliveryForAppService;
	

	
/*	@Test
	public void test2(){
		VStorageOconsignReportDto  dto = new VStorageOconsignReportDto();
		dto.setMemberCode("0000");
		ResultDTO r = ldpDeliveryForAppService.queryOconsignDetail(dto, 1, 10);
		System.out.println(r);
		
		
		 
	}*/
	
	@Test
	public void test1(){
		
		System.out.println("CallApiTest.test1()");
		 
	}
	@Test
	public void test3(){
		System.out.println("Test3");
	}
	
	


}
