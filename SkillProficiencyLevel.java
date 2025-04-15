package taskProblems;

import java.util.Scanner;

public class SkillProficiencyLevel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Skill (JAVA/PYTHON/HTML)");
		System.out.println("Enter the technical skill 1:");
		String skill1 = sc.nextLine().toLowerCase();
		System.out.println("Enter the technical skill 2:");
		String skill2 = sc.nextLine().toLowerCase();
		System.out.println("Enter the technical skill 3:");
		String skill3 = sc.nextLine().toLowerCase();

		System.out.println("Enter the proficiency level of " + skill1 + ": ");
		int proficiencyLevel1 = sc.nextInt();
		System.out.println("Enter the proficiency level of " + skill2 + ": ");
		int proficiencyLevel2 = sc.nextInt();
		System.out.println("Enter the proficiency level of " + skill3 + ": ");
		int proficiencyLevel3 = sc.nextInt();
		sc.nextLine();
		String pkg = " ";


		if ((proficiencyLevel1 >= 0 && proficiencyLevel1 <= 10) && (proficiencyLevel2 >= 0 && proficiencyLevel2 <= 10) && (proficiencyLevel3 >= 0 && proficiencyLevel3 <= 10)) {

			// selecting role any one of the role with greater than 5 levels of proficiency
			boolean hasCoreSkill = (skill1.equals("java") || skill1.equals("python") || skill1.equals("html")) && proficiencyLevel1 >= 5
					|| ((skill2.equals("java") || skill2.equals("python") || skill2.equals("html")) && proficiencyLevel2 >= 5)
					|| ((skill3.equals("java") || skill3.equals("python") || skill3.equals("html"))
							&& proficiencyLevel3 >= 5);
			
			if (hasCoreSkill)
				System.out.println("Core Developer Role");

			//if all skills matched >=8 proficiency
			boolean package8 = ((skill1.equals("java")|| skill1.equals("python")||skill1.equals("html")) && proficiencyLevel1>=8)
					&& ((skill2.equals("java")|| skill2.equals("python")||skill2.equals("html")) && proficiencyLevel2>=8)
					&& ((skill3.equals("java")|| skill3.equals("python")||skill3.equals("html")) && proficiencyLevel3>=8);
					
			//if any two skills matched and >=6 proficiency
			boolean package6 = ((skill1.equals("java")|| skill1.equals("python")||skill1.equals("html"))
							&& ((skill2.equals("java")|| skill2.equals("python")||skill2.equals("html")) && (proficiencyLevel2>=6 && proficiencyLevel1>=6) ))
					|| ((skill2.equals("java")|| skill2.equals("python")||skill2.equals("html"))
							&& ((skill3.equals("java")|| skill3.equals("python")||skill3.equals("html")) && (proficiencyLevel2>=6 && proficiencyLevel3>=6) ))
					||((skill1.equals("java")|| skill1.equals("python")||skill1.equals("html"))
							&& ((skill3.equals("java")|| skill3.equals("python")||skill3.equals("html")) && (proficiencyLevel1>=6 && proficiencyLevel3>=6) ));
			
			if(package8) {
				pkg=10+" LPA";
			}
			else if(package6) {
				pkg=6+" LPA";
			}
			else if(hasCoreSkill) {
				pkg=3+" LPA";
			}
			else {
				System.out.println("You are not selected");
			}
			System.out.println("Package: "+pkg);
		} 
		else {
			System.out.println("Invalid proficiency level. Please enter a number between 1 and 10.");
		}
		sc.close();
	}
}
