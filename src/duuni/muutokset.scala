

package duuni
import Gui._
import scala.collection.mutable.Buffer

class muutokset {

  def tekijä() = {
    var vastaukset = Buffer[String]()
    var nimet = Buffer[String]()
    for (kaikkiSanat <- vastaukset) {
      kaikkiSanat.toLowerCase()
      if (kaikkiSanat == "i") {
        nimet += "you"
      } else if (kaikkiSanat == "we") {
        nimet += "you" // jatka samanlailla kaikki tekijät läpi
      }
    }
  }

  def omistus() = {
    var vastaukset = Buffer[String]()
    var omistus = Buffer[String]()
    for (kaikkiSanat <- vastaukset) {
      kaikkiSanat.toLowerCase()
      if (kaikkiSanat == "my") {
        omistus += "your"
      } else if (kaikkiSanat == "mine") {
        omistus += "yours" // jatka samanlailla kaikki tekijät läpi
      }
    }
  }

  /* def playTurn(command: String) = {
    val action = new Action(command)
    val outcomeReport = action.execute(this.player)
    if (outcomeReport.isDefined) { 
      this.turnCount += 1 
    }
    outcomeReport.getOrElse("Unknown command: \"" + command + "\".")
  }
  */

}