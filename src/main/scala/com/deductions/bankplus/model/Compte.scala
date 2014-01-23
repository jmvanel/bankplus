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
    println( "moyenne " + moyenne + " " + operations.size)
    moyenne / operations.size
  }
}

object Compte {
  lazy val compteCourant = compteBidon
  lazy val compteBidon = new Compte(List(
      new Operation(123, false, "EDF", "abonnement", new Date() ),
      new Operation( 62, false, "FNAC", "", 
        new GregorianCalendar( 114 + 1900, 01, 01, 13, 33).getTime()
      ),
      new Operation( 65, false, "RATP", "", 
        new GregorianCalendar( 114 + 1900, 01, 01, 13, 33).getTime()
      )
      ) )
}