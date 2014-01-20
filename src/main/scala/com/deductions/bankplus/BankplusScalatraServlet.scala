package com.deductions.bankplus

import org.scalatra._
import scalate.ScalateSupport
import com.deductions.bankplus.model.Compte
import com.deductions.bankplus.model.Operation
import java.util.Date
import com.deductions.bankplus.views.TableView

class BankplusScalatraServlet extends BanquePersoStack {

  get("/") {
    <html>
      <body>
        <h1>Banque</h1>
          {TableView.html(Compte.compteCourant)}
      </body>
    </html>
  }
}
