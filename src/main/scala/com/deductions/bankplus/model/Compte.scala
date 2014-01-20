package com.deductions.bankplus.model

import java.util.Date
import java.util.GregorianCalendar

case class Compte (operations:List[Operation], numero:String="") {
  def calculMoyenneOperations : Double = {
    /// TODO style pas fonctionnel
    var moyenne : Double = 0.
      for (op <- operations) {
        moyenne += op.montant
      }
    moyenne / operations.size
  }
}

object Compte {
  val compteCourant = compteBidon
  val compteBidon = new Compte(List(
      new Operation(123, true, "EDF", "abonnement", new Date() ),
      new Operation(123, true, "FNAC", "", 
        new GregorianCalendar( 114 + 1900, 01, 01, 13, 33).getTime()
      ) ) )
}