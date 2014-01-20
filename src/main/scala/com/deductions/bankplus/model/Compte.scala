package com.deductions.bankplus.model

import java.util.Date

case class Compte (operations:List[Operation]) {
	// TODO calculer les distances entre opérations sur l'axe temporel
}

object Compte {
  val compteCourant = compteBidon
  val compteBidon = new Compte(List(
      new Operation(123, true, "EDF", "abonnement", new Date() ),
      new Operation(123, true, "FNAC", "", new Date() )
      ))
}