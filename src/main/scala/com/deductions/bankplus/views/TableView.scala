package com.deductions.bankplus.views

import com.deductions.bankplus.model.Compte

object TableView {

  def html(compte: Compte) = {
    <table border="1">
      {
//    val test = // List[scala.xml.Elem]
        compte.operations.map { op =>
          <tr>
            <td> { op.montant } </td>
            <td> { op.credit } </td>
            <td> { op.autreCompte } </td>
            <td> { op.libelle } </td>
            <td> { op.dateValeur } </td>
          </tr>
        }
      }
    </table>
  }
}