package com.wayj.inputbinder.example2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.tianque.inputbinder.InputBinder
import com.tianque.inputbinder.InputBinderEngine
import com.tianque.inputbinder.item.ButtonInputItem


/**
 * Created by way on 2018/3/7.
 */

class Input2Activity : AppCompatActivity() {
    lateinit var printTxt: TextView
    lateinit var inputBinder: InputBinder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        printTxt = findViewById(R.id.print)
        (findViewById<View>(R.id.button) as Button).setOnClickListener { printTxt.text = inputBinder.requestMap.toString().replace(",".toRegex(), ",\n") }
        inputBinder = InputBinder(this)
        inputBinder.engine.callBack = InputBinderEngine.CallBack { }
        inputBinder.setRootView(this).setRelationEntity(Student::class.java)
        val buttonInputItem = ButtonInputItem(R.id.input_btn, "点我一下，代码赋值")
        buttonInputItem.setOnClickListener { Toast.makeText(this@Input2Activity, "点击了一下", Toast.LENGTH_SHORT).show() }
        buttonInputItem.setDisplayText("点一下试试看")
        inputBinder.addInputItem(buttonInputItem)

        //模拟请求接口获得数据并显示
        doRequestAndShow()

        inputBinder.start()
    }

    private fun doRequestAndShow() {
        //request
        //get data
        //转换成实体类

//        inputBinder.doQuery(Student())
    }
}
