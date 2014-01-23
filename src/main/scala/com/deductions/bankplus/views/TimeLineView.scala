package com.deductions.bankplus.views

import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.algos.CompteVersTimeline
import scala.xml.NodeSeq

object TimeLineView {

  /** TODO peupler l'outil JavaScript de timeline */
  def html(compte: Compte) // : NodeSeq 
  	=
      <p>
    {
    val tl = CompteVersTimeline.creerTimeline(compte).events
    println(tl)
    tl . map ( event =>
    <p>
      {println(event); event.label}
      {event.comment}
      {event.aboveLine}
      {event.icon}
      {event.timeStamp}
      {event.size}
    </p> )
    }

    <div id="timeline-embed"></div>
    <script type="text/javascript">
      <!-- ????
       -->
    </script>
    <script type="text/javascript" src="path_to_js/storyjs-embed.js"></script>
    </p>
}
