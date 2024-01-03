package com.muthupradeesh.rolehierarchy;

import java.util.Scanner;

import com.muthupradeesh.rolehierarchy.Level1.*;
import com.muthupradeesh.rolehierarchy.Level2.*;
import com.muthupradeesh.rolehierarchy.dto.RoleManagement;

public class RoleMain {
	public static RoleManagement rootRole;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		RoleMain main = new RoleMain();
		main.initialize();
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t----------------------");
		System.out.println("\t\t RoleHierarchy..!");
		System.out.println("\t\t----------------------");
		boolean flag = true;
		while (flag) {
			System.out.println(
					" 1 == Level1 \n 2 == Level2 \n 3 == Level3\n 4 == level4\n 5 == level5\n 6 == level6\n 7 == Level7 \n 0 == Exit ");
			System.out.println("Enter Option : ");
			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				Level1View level1View = new Level1View();
				level1View.start();
				break;

			case 2:
				Level2View level2View = new Level2View();
				level2View.start();
				break;
//
//			case 3:
//				Level3View level3View = new Level3View();
//				level3View.start();
//				break;
//
//			case 4:
//				Level4View level4View = new Level4View();
//				level4View.start();
//				break;
//
//			case 5:
//				Level5View level5View = new Level5View();
//				level5View.start();
//				break;
//			case 6:
//				Level6View level6View = new Level6View();
//				level6View.start();
//				break;
//			case 7:
//				Level7View level7View = new Level7View();
//				level7View.start();
//				break;
//
//			case 0:
//				System.out.println("Exiting program. Goodbye!");
//				flag = false;
//				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
				break;
			}
		}
	}

}
