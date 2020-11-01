package com.employee;

public class Main {

    public static void main(String[] args) {
    	Doctor[] D=new Doctor[3];
    	Engineer[] E=new Engineer[3];
    	pilots[] p=new pilots[3];
    	for(int i=0;i<3; i++) {
			D[i] = new Doctor();
			D[i].getDetails();
			D[i].DocDetail();
			E[i] = new Engineer();
			E[i].getDetails();
			E[i].engDetails();
			p[i] = new pilots();
			p[i].getDetails();
			p[i].pilDetails();
		}
    }
	
}
