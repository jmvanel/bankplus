package com.deductions.bankplus.algos

import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.views.TimeLineData
import com.deductions.bankplus.views.Event

/** */
object CompteVersTimeline {
  def creerTimeline(compte: Compte): TimeLineData = {
    val moyenne = compte.calculMoyenneOperations
    var events = List[Event]()
    for (op <- compte.operations) {
      val event = new Event(
        timeStamp = op.dateValeur,
        aboveLine = op.credit,
        label = op.autreCompte,
        comment = op.montant + "\n" + op.libelle,
        size = op.montant/moyenne.toFloat
        )
    }
    new TimeLineData(events)
  }
}