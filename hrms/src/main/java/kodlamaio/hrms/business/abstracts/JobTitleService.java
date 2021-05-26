package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.JobTitle;


public interface JobTitleService {

	List<JobTitle> getAll();
}
