package com.example.testgame2;

import android.app.Activity;
import android.os.Bundle;


public class RunActivity extends Activity{
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(new GameView(this)); /*Sets the displaycontent to our new object GameView*/
	   }


}
