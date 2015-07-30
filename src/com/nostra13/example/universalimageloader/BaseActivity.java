package com.nostra13.example.universalimageloader;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import com.nostra13.universalimageloader.core.ImageLoader;

public abstract class BaseActivity extends Activity {

	protected ImageLoader imageLoader = ImageLoader.getInstance();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// ���ز˵�
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.item_clear_memory_cache:
				imageLoader.clearMemoryCache();		// ����ڴ滺��
				return true;
			case R.id.item_clear_disc_cache:
				imageLoader.clearDiscCache();		// ���SD���еĻ���
				return true;
			default:
				return false;
		}
	}
}
