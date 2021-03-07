//Sharon Cohen 208463463, Dana Daniella Aloni 207907742

package ViewModel;
import java.sql.ResultSet;
import java.util.Vector;

import Model.Model;
import View.View;
import com.toedter.calendar.JDateChooser;

public interface ViewModel {
	
	public void getComboList(String type);

	public void getButtonAction(int type, String query, Object obj);

	public void getTableData(JDateChooser fromDate, JDateChooser toDate);

	public void startInitialData();

	public void setView(View view);

	public void setModel(Model mod);

}
