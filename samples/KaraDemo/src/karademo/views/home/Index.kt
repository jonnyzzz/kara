package karademo.views.home

import kara.views.*

class Index() : HtmlView() {

    override fun render(context: ActionContext) {

        p {
            +"This is the demo site for Kara. Below you'll find all of the html content that can be expressed in Kara views."
        }
        h2("Header 2")
        h3("Header 3")
        h4("Header 4")
        h5("Header 5")
        p("Unordered List")
        ul {
            li("List Item 1")
            li("List Item 2")
        }
        p("Ordered List")
        ol {
            li("List Item 1")
            li("List Item 2")
        }
        fieldset() {
            label("Text Input")
            input(inputType="text", value="Text")
        }
    }
}
