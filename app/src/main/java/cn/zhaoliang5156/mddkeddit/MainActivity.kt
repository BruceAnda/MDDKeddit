package cn.zhaoliang5156.mddkeddit

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import cn.zhaoliang5156.mddkeddit.freatures.news.NewsFragment

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            changeFragment(NewsFragment())
        }
    }

    /**
     * 切换Fragment
     */
    fun changeFragment(f: Fragment, cleanStack: Boolean = false) {
        // 1. 获取FragmentTransaction
        val ft = supportFragmentManager.beginTransaction()
        // 2. 判断清除BackStack
        if (cleanStack) {
            clearBackStack()
        }
        // 3. 设置切换动画
        ft.setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out, R.anim.abc_popup_enter, R.anim.abc_popup_exit)
        // 4. 替换页面
        ft.replace(R.id.activity_base_content, f)
        // 5. 添加的回退栈
        ft.addToBackStack(null)
        // 6. 提交事务
        ft.commit()
    }

    /**
     * 清除回退栈
     */
    fun clearBackStack() {
        // 1. 获取FragmentManager
        // 2. 判断Manger中Entry的数量是否大于0，大于0就弹出
        val manager = supportFragmentManager
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    /**
     * 回退键
     */
    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount > 1) {
            fragmentManager.popBackStack()
        } else {
            finish()
        }
    }
}
