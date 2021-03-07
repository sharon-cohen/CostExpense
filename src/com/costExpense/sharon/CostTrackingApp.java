package com.costExpense.sharon;

import java.sql.SQLException;

import Model.MyModel;
import View.MyView;
import ViewModel.MyViewModel;

public class CostTrackingApp {

	public static void main(String[] args) throws SQLException {
		
		
		//Creating instances
		MyModel mod = new MyModel();
		MyViewModel vm = new MyViewModel(mod);

		MyView view = new MyView(vm);
		
		//Binding Components
//		vm.setView(view);
//		vm.setModel(mod);
//		view.setVmodel(vm);
		
		
		
	}

}