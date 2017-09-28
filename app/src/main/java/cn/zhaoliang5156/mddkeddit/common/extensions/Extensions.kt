package cn.zhaoliang5156.mddkeddit.common.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 在ViewGroup中扩展填充布局的方法
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}