package cn.zhaoliang5156.mddkeddit.freatures.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cn.zhaoliang5156.mddkeddit.R
import cn.zhaoliang5156.mddkeddit.common.extensions.inflate
import kotlinx.android.synthetic.main.fragment_news.*


/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {

    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return container?.inflate(R.layout.fragment_news)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)
    }

}// Required empty public constructor
