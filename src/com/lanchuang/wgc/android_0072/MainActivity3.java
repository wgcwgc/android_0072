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
 * ����ʽ�˵�
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

		// ��������ʽ�˵�������Ͱ汾11��
		PopupMenu popup = new PopupMenu(this , v);
		// ��ȡ�˵������
		MenuInflater inflater = popup.getMenuInflater();
		// ���˵�
		inflater.inflate(R.menu.main3 ,popup.getMenu());

		// ���ò˵���ĵ����¼�
		popup.setOnMenuItemClickListener(this);

		popup.show();
	}

	/**
	 * ����ʽ�˵������¼�����
	 */
	@Override
	public boolean onMenuItemClick(MenuItem item )
	{

		switch(item.getItemId())
		{
			case R.id.copy:
				Toast.makeText(this ,"������" ,Toast.LENGTH_LONG).show();
				break;

			case R.id.cut:
				Toast.makeText(this ,"������" ,Toast.LENGTH_LONG).show();
				break;

			case R.id.del:
				Toast.makeText(this ,"ɾ����" ,Toast.LENGTH_LONG).show();
				break;

			default:
				break;
		}

		return false;
	}

}
