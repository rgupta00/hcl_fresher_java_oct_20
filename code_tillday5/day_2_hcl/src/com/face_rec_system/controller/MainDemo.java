package com.face_rec_system.controller;

import com.face_rec_system.model.Face;

public class MainDemo {
	public static void main(String[] args) {

		// if ur using same classes from two diff packages 
		//atleast one should be fully qualfied...
		Face face=new Face();
		com.face_rec_system.ui.Face face2=new com.face_rec_system.ui.Face();
		
		face.saveFaceToDb();
		face2.printFaceOnUi();
	}
}
