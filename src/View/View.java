//Sharon Cohen 208463463, Dana Daniella Aloni 207907742

package View;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Vector;

import com.toedter.calendar.JDateChooser;

import ViewModel.MyViewModel;
import ViewModel.ViewModel;



public interface View {

	
	public void fillReportsTable();
	public void fillDropDowns(boolean isFirstSetup);
	public void checkEnability();
	public void startButtonAction(ActionEvent e);
	public void updateComboBox(String comboBox, String value, String ops);
	public void setVmodel(ViewModel vm);
	public void updateData(String [][] data);
	public void updateObject(Vector<Object> item);
	public void updateresultButtomAction(boolean res);

}