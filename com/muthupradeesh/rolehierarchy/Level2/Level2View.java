package com.muthupradeesh.rolehierarchy.Level2;

import com.muthupradeesh.rolehierarchy.RoleMain;

public class Level2View {
	Level2ViewModel level2ViewModel;
	public Level2View()
	{
		level2ViewModel=new Level2ViewModel();
	}
	public void start()
	{
		System.out.println("Enter subRole : ");
		String subRole=RoleMain.scanner.nextLine();
		System.out.println("Enter ReportingRole : ");
		String root=RoleMain.scanner.nextLine();
		level2ViewModel.addSubRole(RoleMain.rootRole,subRole,root);
	}

}
