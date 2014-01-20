package com.deductions.bankplus

import org.scalatra._
import scalate.ScalateSupport
import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.model.Operation
import java.util.Date
import com.deductions.bankplus.views.TableView
import com.deductions.bankplus.model.ConnecteurBanqueCA

/**
 * Le flux de données:
 *  API banque => Compte => TimeLineData => composant Javascript
 */
class BankplusScalatraServlet extends BanquePersoStack {

  get("/") {
    <html>
      <body>
        <h1>Banque</h1>
        {
          for (compte <- ConnecteurBanqueCA.comptes) {
            TableView.html(compte)
          }
        }
      </body>
    </html>
  }
}
