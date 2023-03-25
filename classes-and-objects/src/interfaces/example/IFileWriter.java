package interfaces.example;

public interface IFileWriter {

	boolean isFileWrittenSuccessfully();
	
	boolean isFileOverwritten();
	
	boolean isFileDeleted();
	
	boolean isFileInsert();
}
