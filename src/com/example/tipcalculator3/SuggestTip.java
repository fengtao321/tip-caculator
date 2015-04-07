package com.example.tipcalculator3;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class SuggestTip extends ActionBarActivity {
	
	int judgeWindow=0;
	TextView textview1;
	RatingBar rb;
	float rate=3;
	private double data1 = 0, data2  =0,data3 = 0, data4  =0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suggest_tip);
		//textview1=(TextView)findViewById(R.id.ratingBar1);
		
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

			   public void onRatingChanged(RatingBar ratingBar, float rating,
			     boolean fromUser) {
				   rate = rb.getRating();
			    Toast.makeText(SuggestTip.this, "rating:"+String.valueOf(rating),
			      Toast.LENGTH_LONG).show();
			   }});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.suggest_tip, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void setNumber(String d1, String d2, String d3) {
		// TODO Auto-generated method stub
		EditText eText;
		//eText = (EditText) findViewById(R.id.editText1);
		//eText.setText(d1);
		//eText.setSelection(eText.getText().length());
	/*	
		eText = (EditText) findViewById(R.id.editText_31);
		eText.setText(d2);
		eText.setSelection(eText.getText().length());
		
		eText = (EditText) findViewById(R.id.editText_131);
		eText.setText(d3);
		eText.setSelection(eText.getText().length());*/
		
	}
	
	public void tipClick(View view)
	{
		
		judgeWindow=1;
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		rate = rb.getRating();
		Toast.makeText( SuggestTip.this, Float.toString(rate), Toast.LENGTH_LONG).show(); 
	
	}
	
	public void peopleClick(View view)
	{
		judgeWindow=2;
	
	}
	
	public void billClick(View view)		
	{
		judgeWindow=3;
	
	}
	
	public void btn00Click(View view)
	{
		EditText eText;
		
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			
			eText.setText(eText.getText()+"0");
			if(eText.getText().toString().equals("0"))
			{
				Toast.makeText( SuggestTip.this, "invalid number", Toast.LENGTH_LONG).show(); 
			}
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"0");
			if(eText.getText().toString().equals("00"))
			{
				Toast.makeText( SuggestTip.this, "invalid number", Toast.LENGTH_LONG).show(); 
			}
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText( SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
			

		
	}
	
	
	
	
	public void btn01Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"1");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"1");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn02Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"2");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"2");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn03Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"3");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"3");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn04Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"4");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"4");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn05Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"5");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"5");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn06Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"6");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"6");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn07Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"7");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"7");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn08Click(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"8");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"8");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn09Click(View view)
	{
		EditText eText;
		 if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"9");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"9");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btnClearClick(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText("");
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText("");
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
		
	}
	
	public void btnCClick(View view)
	{
		EditText eText;
		if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText().subSequence(0, eText.getText().length()-1));
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText().subSequence(0, eText.getText().length()-1));
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	
	public void btnDotClick(View view)
	{
		
		EditText eText;
		if  (judgeWindow==2)
		{
			/*eText = (EditText) findViewById(R.id.editText_31);
			data1=Double.parseDouble(eText.getText().toString());
			eText.setText(eText.getText()+".");		
			eText.setSelection(eText.getText().length());*/
			
			Toast.makeText(SuggestTip.this, "Please enter an integer.", Toast.LENGTH_LONG).show(); 
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			data1=Double.parseDouble(eText.getText().toString());
			eText.setText(eText.getText()+".");		
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(SuggestTip.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
		
		
	}
	
	public void btnDoneClick(View view)
	{

			EditText eText;
			data1=(rate*2+10)/100;//tip
			
			eText = (EditText) findViewById(R.id.editText_131);
			data2=Double.parseDouble(eText.getText().toString());//bill
			data4=data1*data2;//total tip
			
			eText = (EditText) findViewById(R.id.editText_31);
			data3=Integer.parseInt(eText.getText().toString());//persons
			
			eText = (EditText) findViewById(R.id.EditText0);//tip/person
			double temp = data4/data3;
			temp=(double)(Math.round(temp*100)/100.0);
			eText.setText(String.valueOf(temp));
			
			eText = (EditText) findViewById(R.id.EditText01);//total person
			temp=temp+data2/data3;
			temp=(double)(Math.round(temp*100)/100.0);
			eText.setText(String.valueOf(temp));
			
			eText = (EditText) findViewById(R.id.EditText03);//total bill
			temp=data4+data2;
			temp=(double)(Math.round(temp*100)/100.0);
			eText.setText(String.valueOf(temp));
	
	}
	
	public void btnClick(View view){
		Intent intent = new Intent (this,SettingsActivity.class);
		startActivity(intent);
	}
	
	public void welcomClick(View view){
		Intent intent = new Intent (this,MainActivity.class);
		startActivity(intent);
	}
	
	public void suggestTipClick(View view){
		Intent intent = new Intent (this,SuggestTip.class);
		startActivity(intent);
	}
}
