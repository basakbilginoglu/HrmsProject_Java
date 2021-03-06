package kodlamaio.hrms.business.abstracts;

import java.util.List;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitle;


public interface JobTitleService {

	DataResult<List<JobTitle>> getAll();
	DataResult<JobTitle> getJobByTitle(String title);
	Result add(JobTitle jobTitle);
}
