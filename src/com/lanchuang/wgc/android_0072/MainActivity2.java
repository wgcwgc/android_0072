package com.lanchuang.wgc.android_0072;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * �����Ĳ˵�
 * 
 * @author Administrator
 * 
 */
public class MainActivity2 extends Activity
{

	private Button button1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		// ��ȡbutton����
		button1 = (Button) findViewById(R.id.button1);
		registerForContextMenu(button1);
	}

	// ���������Ĳ˵����¼�����
	@Override
	public void onCreateContextMenu(ContextMenu menu , View v , ContextMenuInfo menuInfo )
	{

		super.onCreateContextMenu(menu ,v ,menuInfo);
		getMenuInflater().inflate(R.menu.main2 ,menu);
	}

	// �����Ĳ˵�����¼�
	@Override
	public boolean onContextItemSelected(MenuItem item )
	{

		// button1
		switch(item.getItemId())
		{
			case R.id.start:
				Toast.makeText(this ,"��ʼ������" ,Toast.LENGTH_SHORT).show();
				break;
			case R.id.over:
				Toast.makeText(this ,"����������" ,Toast.LENGTH_SHORT).show();
				break;
			default:
				break;
		}
		return super.onContextItemSelected(item);
	}
}
