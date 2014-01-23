package com.deductions.bankplus

import org.scalatra._
import scalate.ScalateSupport
import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.model.Operation
import java.util.Date
import com.deductions.bankplus.views.TimeLineView 
import com.deductions.bankplus.views.TableView 
import com.deductions.bankplus.model.ConnecteurBanqueCA

/**
 * Le flux de données:
 *  API banque => Compte => TimeLineData => composant Javascript
 */
class BankplusScalatraServlet extends BanquePersoStack {

  get("/") {
    page
  }

  def page =
      <html>
      <body>
        <h1>Banque</h1>
        {
          for (compte <- ConnecteurBanqueCA.comptes)
          yield TimeLineView.html(compte)
        }
      </body>
    </html>
  
    // OK
  def page1 = <html>
        <h1>Banque test</h1>{
	  		TableView.html(Compte.compteBidon)
  }</html>
}
