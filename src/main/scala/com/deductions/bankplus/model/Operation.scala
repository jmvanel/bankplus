package com.deductions.bankplus.model

import scala.collection.mutable.ListBuffer
import Operation._
import java.util.Date

/** si credit est faux, c'est un débit */
case class Operation (montant:Long, credit:Boolean, autreCompte:String,
    libelle:String, dateValeur:Date) extends PropertyValues {
  // NOTE: on met tout dans une map pour préparer le terrain pour un stockage SPARQL (RDF)
  map += MONTANT -> montant.toString
  map += CREDIT -> credit.toString
  map += AUTRECOMPTE -> autreCompte
  map += LIBELLE -> libelle
  map += DATEVALEUR -> dateValeur.toString
}

object Operation {
  val MONTANT:String = "montant"
  val CREDIT:String = "credit"
  val AUTRECOMPTE = "autreCompte"
  val LIBELLE = "libelle"
  val DATEVALEUR = "dateValeur"
}
