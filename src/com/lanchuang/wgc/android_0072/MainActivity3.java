package com.lanchuang.wgc.android_0072;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

/**
 * 弹出式菜单
 * 
 * @author Administrator
 * 
 */
public class MainActivity3 extends Activity implements OnMenuItemClickListener
{

	// private Button btn1;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main3);
		// btn1 = (Button) findViewById(R.id.button1);
		// registerForContextMenu(btn1);
	}

	public void showPopupMenu(View v )
	{

		// 创建弹出式菜单对象（最低版本11）
		PopupMenu popup = new PopupMenu(this , v);
		// 获取菜单填充器
		MenuInflater inflater = popup.getMenuInflater();
		// 填充菜单
		inflater.inflate(R.menu.main3 ,popup.getMenu());

		// 设置菜单项的单击事件
		popup.setOnMenuItemClickListener(this);

		popup.show();
	}

	/**
	 * 弹出式菜单单击事件处理
	 */
	@Override
	public boolean onMenuItemClick(MenuItem item )
	{

		switch(item.getItemId())
		{
			case R.id.copy:
				Toast.makeText(this ,"复制中" ,Toast.LENGTH_LONG).show();
				break;

			case R.id.cut:
				Toast.makeText(this ,"剪切中" ,Toast.LENGTH_LONG).show();
				break;

			case R.id.del:
				Toast.makeText(this ,"删除中" ,Toast.LENGTH_LONG).show();
				break;

			default:
				break;
		}

		return false;
	}

}
