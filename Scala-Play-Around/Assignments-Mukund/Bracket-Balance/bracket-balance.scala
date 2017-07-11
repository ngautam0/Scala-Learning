/*
Problem Statement
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
*/
object BracketBalance {

    def main(args: Array[String]) {

        // 3 test cases.. uncomment any one and run it

        var expression = "{[()]}{}" // Balanced
        // var expression = "{[(])}" // Not Balanced
        // var expression = "{{[[(())]]}}" // Balanced

        var stack = new scala.collection.mutable.Stack[Char] // declare stack to store and pop brackets

        val closing = List(')','}',']') // list of all closing brackets
        val opening = List('(','{','[') // list of all opening brackets

        var result = "Balanced" // lets assume that brackets are Balanced

        if(expression.length % 2 != 0){ // if number of brackets are not even
          result = "Not Balanced"
        }
        else {

          for(each <- expression){ // for each bracket in expression

              if(opening.indexOf(each) >= 0){ // if its an opening bracket
                  stack.push(each) // push to stack
              }
              else if (stack.length != 0 && opening.indexOf(stack.top) == closing.indexOf(each) ){
                  // else if its a closing bracket and stack is not empty
                  // a opening closing match found. pop the element
                  stack.pop
              }
              else{ // it was a closing bracket.. but on stack top there was different opening bracket
                result = "Not Balanced"
                println(expression + " is " +result)
                return
              }

          }
          // at end of all scanning the stack should be empty.. other wise its not Balanced
          if(stack.length != 0)
            result = "Not Balanced"
        }

        // print result
        println(expression + " is " +result)

    }
}
