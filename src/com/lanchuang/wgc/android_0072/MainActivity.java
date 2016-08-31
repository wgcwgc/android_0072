package com.lanchuang.wgc.android_0072;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

/**
 * 创建选项菜单
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
	 * 重写onCreateOptionsMenu方法
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		// 填充选项菜单（读取XML文件，解析，加载到menu组件上）
		// getMenuInflater().inflate(R.menu.main, menu);
		/**
		 * 添加菜单项（组ID ， 菜单项ID ， 排序 ， 标题）
		 */
		menu.add(0 ,START_ITEM ,100 ,"start");
		menu.add(0 ,OVER_ITEM ,200 ,"stop");
		/**
		 * 添加子菜单
		 */
		SubMenu submenu = menu.addSubMenu("setting");
		submenu.add(1 ,SETTING_ITEM1 ,30 ,"setting1");
		submenu.add(1 ,SETTING_ITEM2 ,40 ,"setting2");

		System.out.println("onCreateOptionsMenu...");
		return true;
	}

	/**
	 * 重写onOptionsItemSelected方法
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
		// Toast.makeText(this, "设置响应", Toast.LENGTH_LONG).show();
		// break;
		//
		// case R.id.start:
		// Toast.makeText(this, "开始响应", Toast.LENGTH_SHORT).show();
		// break;
		//
		// case R.id.over:
		// Toast.makeText(this, "结束响应", Toast.LENGTH_SHORT).show();
		// break;
		//
		// default:
		// break;
			case START_ITEM:
				Toast.makeText(this ,"开始响应" ,Toast.LENGTH_SHORT).show();
				break;

			case OVER_ITEM:
				Toast.makeText(this ,"结束响应" ,Toast.LENGTH_SHORT).show();
				break;

			case SETTING_ITEM1:
				Toast.makeText(this ,"设置1" ,Toast.LENGTH_SHORT).show();
				break;

			case SETTING_ITEM2:
				Toast.makeText(this ,"设置2" ,Toast.LENGTH_SHORT).show();
				break;

			default:
				break;

		}
		return super.onOptionsItemSelected(item);
	}
}
