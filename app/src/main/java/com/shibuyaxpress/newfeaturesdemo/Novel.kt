package com.shibuyaxpress.newfeaturesdemo

class Novel {
    private var id:String?=null
    private var title:String?=null
    private var author:String?=null
    private var category:Array<Category>?=null
    private var cover:String?=null
    private var favorite:Boolean=false
    private var description:String?=null
    private var releaseDate:String?=null
    private var publisher:String?=null
    private var illustrator:String?=null
    private var publisherPrint:String?=null
    private var volume:Int?=null
        get() = field
        set(value) {
            field = value
        }
}