package MiddleGrad;

import HostGrad.HostClass;

public class MiddleClass {
	public void print() {
		System.out.println("MiddleGrad is dependent on HostGrad");
		HostClass objClass=new HostClass();
		System.out.print("Msg from HostGrad: ");
		objClass.print();
	}
}
