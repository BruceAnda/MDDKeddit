package cn.zhaoliang5156.mddkeddit.freatures.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cn.zhaoliang5156.mddkeddit.R
import cn.zhaoliang5156.mddkeddit.common.extensions.inflate


/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return container?.inflate(R.layout.fragment_news)
    }

}// Required empty public constructor
