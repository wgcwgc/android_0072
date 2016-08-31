package com.lanchuang.wgc.android_0072;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

/**
 * ����ѡ��˵�
 * 
 * @author Administrator
 * 
 */
public class MainActivity extends Activity
{

	private static final int START_ITEM = Menu.FIRST;
	private static final int OVER_ITEM = Menu.FIRST + 1;
	private static final int SETTING_ITEM1 = Menu.FIRST + 2;
	private static final int SETTING_ITEM2 = Menu.FIRST + 3;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * ��дonCreateOptionsMenu����
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		// ���ѡ��˵�����ȡXML�ļ������������ص�menu����ϣ�
		// getMenuInflater().inflate(R.menu.main, menu);
		/**
		 * ��Ӳ˵����ID �� �˵���ID �� ���� �� ���⣩
		 */
		menu.add(0 ,START_ITEM ,100 ,"start");
		menu.add(0 ,OVER_ITEM ,200 ,"stop");
		/**
		 * ����Ӳ˵�
		 */
		SubMenu submenu = menu.addSubMenu("setting");
		submenu.add(1 ,SETTING_ITEM1 ,30 ,"setting1");
		submenu.add(1 ,SETTING_ITEM2 ,40 ,"setting2");

		System.out.println("onCreateOptionsMenu...");
		return true;
	}

	/**
	 * ��дonOptionsItemSelected����
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		// int id = item.getItemId();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		System.out.println("onOptionsItemSelected...");
		switch(item.getItemId())
		{
		// case R.id.action_settings:
		// Toast.makeText(this, "������Ӧ", Toast.LENGTH_LONG).show();
		// break;
		//
		// case R.id.start:
		// Toast.makeText(this, "��ʼ��Ӧ", Toast.LENGTH_SHORT).show();
		// break;
		//
		// case R.id.over:
		// Toast.makeText(this, "������Ӧ", Toast.LENGTH_SHORT).show();
		// break;
		//
		// default:
		// break;
			case START_ITEM:
				Toast.makeText(this ,"��ʼ��Ӧ" ,Toast.LENGTH_SHORT).show();
				break;

			case OVER_ITEM:
				Toast.makeText(this ,"������Ӧ" ,Toast.LENGTH_SHORT).show();
				break;

			case SETTING_ITEM1:
				Toast.makeText(this ,"����1" ,Toast.LENGTH_SHORT).show();
				break;

			case SETTING_ITEM2:
				Toast.makeText(this ,"����2" ,Toast.LENGTH_SHORT).show();
				break;

			default:
				break;

		}
		return super.onOptionsItemSelected(item);
	}
}
