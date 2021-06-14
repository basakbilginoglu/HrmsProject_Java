package kodlamaio.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {


	public ErrorDataResult(boolean success) {
		super(false);
		// TODO Auto-generated constructor stub
	}
    
	public ErrorDataResult(T data,boolean success,String message) {
		super(data,false,message);
		;
	}
	
	public ErrorDataResult(T data,boolean success) {
		super(data,false);
		
	}
	
	public ErrorDataResult() {
		super(null,false);
	}
	

}
