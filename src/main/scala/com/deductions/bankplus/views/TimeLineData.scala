package com.deductions.bankplus.views

import java.util.Date
import java.net.URL

case class TimeLineData(events: List[Event]) {

}

case class Event(
  timeStamp: Date = new Date,
  aboveLine: Boolean = true,
  label: String = "",
  comment: String = "",
  icon: Option[URL] = None,
  size: Float = 0.5f
)
{ require( size >0 && size < 1 ) }