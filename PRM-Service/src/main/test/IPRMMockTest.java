import org.eclipse.egit.github.core.PullRequest;

import com.escowad.prm.api.entity.IPRM;
import com.escowad.prm.api.entity.PRMResult;
import com.escowad.prm.api.entity.PRMStateResult;

public class IPRMMockTest implements IPRM {

	@Override
	public String getPluginName() {
		return "test";
	}

	@Override
	public String getPluginVersion() {
		// TODO Auto-generated method stub
		return "1.1";
	}

	@Override
	public PRMResult evaluate(PullRequest pullRequest) {
		// TODO Auto-generated method stub
		return new PRMResult(5, "TEST OK", PRMStateResult.PASSED);
	}

	@Override
	public PullRequest executeTreatment(PullRequest pullRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
