package com.deductions.bankplus

import org.scalatra._
import scalate.ScalateSupport
import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.model.Operation
import java.util.Date

class BankplusScalatraServlet extends BanquePersoStack {

  get("/") {
    <html>
      <body>
        <h1>Banque</h1>
<table border="1">
	  { compteBidon.operations . map { op =>
	    <tr>
	    <td> {op.montant} </td>
	    <td> {op.credit} </td>
	    <td> {op.autreCompte} </td>
	    <td> {op.libelle} </td>
	    <td> {op.dateValeur} </td>
	    </tr>
	  }}
</table>
      </body>
    </html>
  }
  
  val compteBidon = new Compte(List(
      new Operation(123, true, "EDF", "abonnement", new Date() ),
      new Operation(123, true, "FNAC", "", new Date() )
      ))
}
