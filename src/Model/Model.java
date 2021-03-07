//Sharon Cohen 208463463, Dana Daniella Aloni 207907742

package Model;
import com.toedter.calendar.JDateChooser;

import java.sql.ResultSet;

public interface Model {

	public ResultSet getItemsQuery(String setUp);

	public boolean exeQuery(String query);

	public boolean updateQuery(String query);

	public ResultSet tableData(String query);

	public String[][] getTableDataModel(JDateChooser fromDate, JDateChooser toDate);

	public void startInitial();
	
}
