import java.time.LocalTime

final String templateFileName = "./template-demo1.txt"
final String outputFileName="./template-demo1"+"sb"+".groovy"
File templateFile = new File(templateFileName)
//获取文件所有内容
def fileStr = templateFile.text


File OutputFile = new File(outputFileName)
OutputFile.withWriter('utf-8'){
    writer -> writer.writeLine(fileStr)
}

def assign(){

}

