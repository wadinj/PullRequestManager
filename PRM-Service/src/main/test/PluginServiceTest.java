import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.egit.github.core.PullRequest;
import org.junit.Test;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.api.entity.PRMStateResult;
import com.escowad.prm.services.PluginService;

public class PluginServiceTest {

	
	@Test
	public void evaluatePluginOnPullRequestTest() {
		PluginService serv = new PluginService();
		Map<Long, Map<IPRM, PRMResult>> map = new HashMap<Long, Map<IPRM, PRMResult>>();
		Map<IPRM, PRMResult> map2 = new HashMap<IPRM, PRMResult>();
		IPRM mock = new IPRMMockTest();
		map2.put(mock,null);
		map.put((long) 1,map2);
		PullRequest requ = new PullRequest();
		requ.setId(1);
//		 serv.evaluatePluginOnPullRequest(map, requ);
//		assertTrue(result.get((long)1).get(mock) != null);
//		assertEquals(5,result.get((long)1).get(mock).getMark());
//		assertEquals("TEST OK",result.get((long)1).get(mock).getResult());
//		assertEquals(PRMStateResult.PASSED,result.get((long)1).get(mock).getState());
	}

}
