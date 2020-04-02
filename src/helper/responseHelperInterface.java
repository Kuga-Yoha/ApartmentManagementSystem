package helper;

import java.sql.SQLException;
import java.util.ArrayList;

import model.responseModel;

public interface responseHelperInterface {

	public boolean addResponse(responseModel response) throws SQLException, ClassNotFoundException;
		
	public boolean updateResponse(responseModel response)throws SQLException, ClassNotFoundException;
	
	public boolean deleteResponse(responseModel response) throws SQLException,ClassNotFoundException;
		
	public  ArrayList<responseModel> displayResponse(responseModel response ) throws SQLException,ClassNotFoundException;
				
	public ArrayList<responseModel> displayResponses( ) throws SQLException,ClassNotFoundException;
		
}

