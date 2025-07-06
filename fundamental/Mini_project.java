package fundamental;

class Employeedetails {
	int Empid;
	String name;
	char c;
	String dept;
	int bas, HRA, IT;

	Employeedetails(int Empid, String name, char c, String dept, int bas, int HRA, int IT) {
		this.Empid = Empid;
		this.name = name;
		this.c = c;
		this.dept = dept;
		this.bas = bas;
		this.HRA = HRA;
		this.IT = IT;
	}
}

public class Mini_project {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Please enter employee id only");
			return;
		}
		else {
			int id=Integer.parseInt(args[0]);
			Employeedetails[] employee=new Employeedetails[7];
			employee[0]= new Employeedetails(1001,"Ashish",'e',"R&D",20000,8000,3000);
			employee[1]=new Employeedetails(1002,"Sushma",'c',"PM",30000,12000,9000);
			employee[2]=new Employeedetails(1003,"Rahul",'k',"Acct",10000,8000,1000);
			employee[3]= new Employeedetails(1004,"Chahat",'r',"Front desk",12000,6000,2000);
			employee[4]=new Employeedetails(1005,"Ranjan",'m',"Engg",50000,20000,20000);
			employee[5]=new Employeedetails(1006,"Suman",'e',"Manufacturing",23000,9000,4400);
			employee[6]=new Employeedetails(1007,"Tanmay",'c',"PM",29000,12000,10000);			
			
		
     boolean idfound=false;
	for(Employeedetails empno:employee) {
		if(empno.Empid==id) {
			idfound=true;
			int da=0;
			String desgination="";
			switch(empno.c) {
			case 'e':
				desgination="Engineer";
				da=20000;
				break;
			case 'c':
				desgination="Consultant";
				da=32000;
				break;
			case 'k':
				desgination="Clerk";
				da=12000;
				break;
			case 'r':
				desgination="Receptionist";
				da=15000;
				break;
			case 'm':
				desgination="Manager";
				da=40000;
				break;
			default:
				desgination="unknown";
				da=0;
				break;
			
			}
			int salary=empno.bas+empno.HRA+da-empno.IT;
			System.out.println("Emp no\tEmp Name\tDepartment\tDesignation\tSalary");
			System.out.println(empno.Empid+"\t"+empno.name+"\t\t"+empno.dept+"\t\t"+desgination+"\t\t"+salary);
			break;
		}
	}
	if(!idfound) {
		System.out.println("No employee if found"+id);
	}
	}
	}

}
