import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def json = '''
    {
    "courseName":"math",
    "teacher":{
        "name":"sb",
        "age":"50"
    },
    "people":[
        {
        "firstName":"Brett",
        "lastName":"McLaughlin"
        },
        {
        "firstName":"Jason",
        "lastName":"Hunter"
        }
    ]
    }
'''
def jsonSlurper = new JsonSlurper()
def course=jsonSlurper.parseText(json)
println course.courseName
jsonBuilder=new JsonBuilder()
def code='''
jsonBuilder{
        courseName course.courseName
    }
    
    writer = new StringWriter()
    jsonBuilder.writeTo(writer)

    println writer
'''

//def code2="println 'hello!world'"
Eval.me(code)
//jsonBuilder{
//    courseName course.courseName
//}
//
//writer = new StringWriter()
//jsonBuilder.writeTo(writer)
//
//println writer