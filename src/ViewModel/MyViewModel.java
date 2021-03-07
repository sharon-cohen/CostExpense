/*
 * This class handles the bridge between View & Model.
 * 
 * It accepts and returns data to and fro for both View & Model
 * 
 * This implements interface ViewModel
 */

//Sharon Cohen 208463463, Dana Daniella Aloni 207907742

package ViewModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Model.Model;
import Model.MyModel;
import View.MyView;
import View.View;
import com.toedter.calendar.JDateChooser;

public class MyViewModel implements ViewModel {
	
	public Model model;
	public View view;
	private static Vector<Object> list;
	
	public MyViewModel(MyModel mod)  {
		model=mod;
	}

	public void getComboList(String type) {
		
		if(type.equals(null))
		{
			view.updateObject(null);
		}		
		
		list = new Vector<>();
		
	ResultSet result = model.getItemsQuery(type);
								
				try {
						while(result.next())
						{
							if(type.equals("currency"))
							{
								list.add(result.getObject(2));
							}
							else {
								list.add(result.getObject(1));
							}
							
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		view.updateObject(list);

	}

	public void getButtonAction(int type, String query, Object obj) {
		//Acts when a button is pressed
		
		System.out.println("Type is "+type);
		System.out.println("Query -> "+query);
		
		if(type==1)
		{
			boolean r=((MyModel) model).exeObjectQuery(query,obj);
			view.updateresultButtomAction(r);
			return;
		}
		if (type==2 || type ==3)
		{
			view.updateresultButtomAction(model.updateQuery(query));
			return;
		}

		view.updateresultButtomAction(false);
		return;
	}

	public void getTableData(JDateChooser fromDate, JDateChooser toDate) {
		// TODO Auto-generated method stub
		view.updateData( model.getTableDataModel(fromDate,toDate));
	}

	@Override
	public void startInitialData() {
		model.startInitial();
		
	}



	@Override
	public void setView(View view) {

		this.view = view;
		
	}

	@Override
	public void setModel(Model mod) {

		this.model = mod;
		
	}

	
}
