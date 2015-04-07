package com.example.tipcalculator3;


import android.R;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.appcompat.*;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Spinner s;  
    ArrayAdapter<CharSequence> adapter; 
    private int judgeWindow=0;
    private enum Operator {none, add, minus, multiply, divide};
	private double data1 = 0, data2  =0,data3 = 0, data4  =0;
	private Operator optr=Operator.none;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		adapter = ArrayAdapter.createFromResource(this, R.array.place, android.R.layout.simple_spinner_item);  
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
          
        s = (Spinner)findViewById(R.id.spinner);  
        s.setAdapter(adapter);  
        s.setOnItemSelectedListener(new SpinnerListener());  
        s.setPrompt("tip");  
        
   //     EditText et = (EditText) findViewById(R.id.EditText03);
   //     et.requestFocus(); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	class SpinnerListener implements OnItemSelectedListener{  
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,  
                long arg3) {  
            String selected = arg0.getItemAtPosition(arg2).toString();  
            Toast.makeText(MainActivity.this, "what you selected is :"+selected, Toast.LENGTH_LONG).show();  
            Log.d("test", "what you selected is :"+selected);  
            
            EditText eText = (EditText) findViewById(R.id.editText1);
         	eText.setText(selected);
    		eText.setSelection(eText.getText().length());
            
        }  
  
        public void onNothingSelected(AdapterView<?> arg0) {  
            Toast.makeText(MainActivity.this, "you have selected nothing", Toast.LENGTH_LONG).show();  
            Log.d("test", "you have selected nothing");  
        }  
          
    }  
	
	public void tipClick(View view)
	{
		judgeWindow=1;
	
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
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"0");
			if(eText.getText().toString().equals("00"))
			{
				Toast.makeText( MainActivity.this, "invalid number", Toast.LENGTH_LONG).show(); 
			}
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
		{
			eText = (EditText) findViewById(R.id.editText_31);
			eText.setText(eText.getText()+"0");
			if(eText.getText().toString().equals("0"))
			{
				Toast.makeText( MainActivity.this, "invalid number", Toast.LENGTH_LONG).show(); 
			}
			eText.setSelection(eText.getText().length());
		}
		else if  (judgeWindow==3)
		{
			eText = (EditText) findViewById(R.id.editText_131);
			eText.setText(eText.getText()+"0");
			if(eText.getText().toString().equals("0"))
			{
				Toast.makeText( MainActivity.this, "invalid number", Toast.LENGTH_LONG).show(); 
			}
			eText.setSelection(eText.getText().length());
		}
		
		else
		{
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
			

		
	}
	
	public void btn01Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"1");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn02Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"2");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn03Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"3");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn04Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"4");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn05Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"5");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn06Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"6");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn07Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"7");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn08Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"8");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btn09Click(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText()+"9");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	public void btnClearClick(View view)
	{
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText("");
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
		
	}
	
	public void btnCClick(View view)
	{
		EditText eText;
		String newString;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			eText.setText(eText.getText().subSequence(0, eText.getText().length()-1));
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
	}
	
	
	public void btnDotClick(View view)
	{
		
		EditText eText;
		if (judgeWindow==1) {
			eText = (EditText) findViewById(R.id.editText1);
			data1=Double.parseDouble(eText.getText().toString());
			eText.setText(eText.getText()+".");		
			eText.setSelection(eText.getText().length());
		} 
		else if  (judgeWindow==2)
		{
			/*eText = (EditText) findViewById(R.id.editText_31);
			data1=Double.parseDouble(eText.getText().toString());
			eText.setText(eText.getText()+".");		
			eText.setSelection(eText.getText().length());*/
			
			Toast.makeText(MainActivity.this, "Please enter an integer.", Toast.LENGTH_LONG).show(); 
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
			Toast.makeText(MainActivity.this, "Please select a box to enter", Toast.LENGTH_LONG).show(); 
		}
		
		
	}
	
	public void btnDoneClick(View view)
	{

			EditText eText = (EditText) findViewById(R.id.editText1);
			data1=Double.parseDouble(eText.getText().toString());
			data1=data1/100;//tip
			
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
		
		SuggestTip st = new SuggestTip();
		EditText eText = (EditText) findViewById(R.id.editText1);
		String d1=eText.getText().toString();
		
		eText = (EditText) findViewById(R.id.editText_31);
		String d2=eText.getText().toString();//persons
		
		eText = (EditText) findViewById(R.id.editText_131);
		String d3=eText.getText().toString();//bill
		
		st.setNumber(d1, d2, d3);
		
		startActivity(intent);
	}
}
