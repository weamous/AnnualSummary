package cn.com.loliclub.annualsummary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ShowActivity extends AppCompatActivity {

    private List<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(ShowFragment.newInstance(0));
        mFragmentList.add(ShowFragment.newInstance(1));
        mFragmentList.add(ShowFragment.newInstance(2));
        mFragmentList.add(ShowFragment.newInstance(3));
        mFragmentList.add(ShowFragment.newInstance(4));
        mFragmentList.add(ShowFragment.newInstance(5));
        mFragmentList.add(ShowFragment.newInstance(6));
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    class PagerAdapter extends FragmentPagerAdapter {

        private PagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int arg0) {
            return mFragmentList.get(arg0);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

    }

}
