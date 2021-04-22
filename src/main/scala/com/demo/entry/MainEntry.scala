package com.demo.entry

import org.apache.log4j.Level
import org.apache.log4j.Logger

object MainEntry {
  
  def main(args: Array[String]): Unit = {
        
    Logger.getLogger("org").setLevel(Level.OFF) 
    Logger.getLogger("akka").setLevel(Level.OFF)
    println("Hello") 

  }
  
}