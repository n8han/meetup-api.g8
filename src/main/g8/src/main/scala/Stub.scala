package com.example

import dispatch._
import dispatch.meetup._
import dispatch.liftjson.Js._

object MyApplication {
  def main(args: Array[String]) {
    val h = new nio.Http
    h(RsvpsStream.open(None) { js => 
      println(prettyrender(js))
      println("press ctrl+c to quit")
    })
  }
}
