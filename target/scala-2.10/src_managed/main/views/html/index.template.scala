
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Application.SampleForm],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, form1: Form[Application.SampleForm]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

     <h1>Hello!</h1>
     <p>"""),_display_(Seq[Any](/*6.10*/msg)),format.raw/*6.13*/("""</p>
     """),_display_(Seq[Any](/*7.7*/helper/*7.13*/.form(action = routes.Application.send)/*7.52*/{_display_(Seq[Any](format.raw/*7.53*/("""
       """),_display_(Seq[Any](/*8.9*/(helper.inputText (
         field = form1("message")
       )))),format.raw/*10.10*/("""
       <input type="submit">
     """)))})),format.raw/*12.7*/("""
""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(msg:String,form1:Form[Application.SampleForm]): play.api.templates.HtmlFormat.Appendable = apply(msg,form1)
    
    def f:((String,Form[Application.SampleForm]) => play.api.templates.HtmlFormat.Appendable) = (msg,form1) => apply(msg,form1)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 27 22:52:16 JST 2014
                    SOURCE: /Users/shige/projects/PlayApp/app/views/index.scala.html
                    HASH: ae0206b112b77406ccd53a6b7813d6cc5a955dd5
                    MATRIX: 803->1|947->51|984->54|1011->73|1050->75|1117->107|1141->110|1186->121|1200->127|1247->166|1285->167|1328->176|1413->239|1480->275|1513->277
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|35->7|35->7|36->8|38->10|40->12|41->13
                    -- GENERATED --
                */
            